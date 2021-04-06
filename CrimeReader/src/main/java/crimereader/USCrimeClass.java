/**Author: Alexander Spory
 *Program: Short program that houses fields for the CrimeArray puts strings for each of the selectable topics into an array
 */
package crimereader;

public class USCrimeClass {//startUSCrimeClass

    //create arrays needed to hold objects and return for user menu
    public static Float[] popArray = new Float[21];
    public static USCrimeClass[] stats = new USCrimeClass[21];
    public static String[] stringArray = new String[9];

    //declare variables
    private int year = 0;
    private float pop = 0;
    private int murder = 0;
    private float murderRate = 0;
    private int rape = 0;
    private float rapeRate = 0;
    private int robbery = 0;
    private float robberyRate = 0;
    private int aggravatedAssault = 0;
    private float aggravatedAssaultRate = 0;
    private int propertyCrime = 0;
    private float propertyCrimeRate = 0;
    private int burglary = 0;
    private float burglaryRate = 0;
    private int motorVehicleTheft = 0;
    private float motorVehicleTheftRate = 0;

    //noargs constructor
    public USCrimeClass() {
    }

    //constructor with params
    public USCrimeClass(int year, float pop, int murder, int rape, int robbery, int aggravatedAssault, int propertyCrime, int burglary, int motorVehicleTheft) {
        this.year = year;
        this.pop = pop;
        this.murder = murder;
        this.rape = rape;
        this.robbery = robbery;
        this.aggravatedAssault = aggravatedAssault;
        this.propertyCrime = propertyCrime;
        this.burglary = burglary;
        this.motorVehicleTheft = motorVehicleTheft;
    }

    static { //static block to assign stats array of objects return value of reader() in CrimeArray
        stats = CrimeArray.reader();
    }

    //getter functions
    public int getYear() {
        return this.year;
    }

    public float getPop() {
        return this.pop;
    }

    public int getMurder() {
        return this.murder;
    }


    public int getRape() {
        return this.rape;
    }

    public int getRobbery() {
        return this.robbery;
    }

    public int getAggravatedAssault() {
        return this.aggravatedAssault;
    }

    public int getPropertyCrime() {
        return this.propertyCrime;
    }


    public int getBurglary() {
        return this.burglary;
    }

    public int getMotorVehicleTheft() {
        return this.motorVehicleTheft;
    }

    //method to calculate the pop growth yearly and overall
    public static String getPopGrowth() {
        float popGrowth = 0;
        String growth;

        for (int i = 1; i < stats.length; i++) {
            if (i < (stats.length - 1)) {
                popArray[i] = (((stats[i + 1].getPop() - stats[i].getPop()) / stats[i].getPop()) * 100);

            } else {
                popArray[i] = (((stats[i].getPop() - stats[i - 1].getPop()) / stats[i - 1].getPop()) * 100);
            }
        }

        growth = ("Population Rate Statistics:\n" + "*****************************\n"
                + "1994-1995: " + popArray[1] + "%"
                + "\n1995-1996: " + popArray[2] + "%"
                + "\n1996-1997: " + popArray[3] + "%"
                + "\n1997-1998: " + popArray[4] + "%"
                + "\n1998-1999: " + popArray[5] + "%"
                + "\n1999-2000: " + popArray[6] + "%"
                + "\n2000-2001: " + popArray[7] + "%"
                + "\n2001-2002: " + popArray[8] + "%"
                + "\n2002-2003: " + popArray[9] + "%"
                + "\n2003-2004: " + popArray[10] + "%"
                + "\n2004-2005: " + popArray[11] + "%"
                + "\n2005-2006: " + popArray[13] + "%"
                + "\n2006-2007: " + popArray[14] + "%"
                + "\n2007-2008: " + popArray[15] + "%"
                + "\n2008-2009: " + popArray[16] + "%"
                + "\n2009-2010: " + popArray[17] + "%"
                + "\n2010-2011: " + popArray[18] + "%"
                + "\n2011-2012: " + popArray[19] + "%"
                + "\n2012-2013: " + popArray[20] + "%");

        return growth;
    }

    //methods for calculating years with highest murder count
    public static int murderHighYear() {
        int highYear;
        int highMurder;

        highYear = stats[1].getYear();
        highMurder = stats[1].getMurder();

        for (int i = 1; i < stats.length; i++) {
            if (highMurder < stats[i].getMurder()) {
                highYear = stats[i].getYear();
                highMurder = stats[i].getMurder();
            }
        }

        return highYear;
    }

    public static int murderLowYear() {
        int lowYear;
        int lowMurder;

        lowYear = stats[1].getYear();
        lowMurder = stats[1].getMurder();

        for (int i = 1; i < stats.length; i++) {
            if (lowMurder > stats[i].getMurder()) {
                lowYear = stats[i].getYear();
                lowMurder = stats[i].getMurder();
            }
        }

        return lowYear;
    }

    //methods for calculating years with highest rape count
    public static int rapeHighYear() {
        int highYear;
        int highRape;

        highYear = stats[1].getYear();
        highRape = stats[1].getRape();

        for (int i = 1; i < stats.length; i++) {
            if (highRape < stats[i].getRape()) {
                highYear = stats[i].getYear();
                highRape = stats[i].getRape();
            }
        }

        return highYear;
    }

    public static int rapeLowYear() {
        int lowYear;
        int lowRape;

        lowYear = stats[1].getYear();
        lowRape = stats[1].getRape();

        for (int i = 1; i < stats.length; i++) {
            if (lowRape > stats[i].getRape()) {
                lowYear = stats[i].getYear();
                lowRape = stats[i].getRape();
            }
        }

        return lowYear;
    }

    //methods for calculating years with highest robbery count
    public static int robberyHighYear() {
        int highYear;
        int highRobbery;

        highYear = stats[1].getYear();
        highRobbery = stats[1].getRobbery();

        for (int i = 1; i < stats.length; i++) {
            if (highRobbery < stats[i].getRobbery()) {
                highYear = stats[i].getYear();
                highRobbery = stats[i].getRobbery();
            }
        }

        return highYear;
    }

    public static int robberyLowYear() {
        int lowYear;
        int lowRobbery;

        lowYear = stats[1].getYear();
        lowRobbery = stats[1].getRobbery();

        for (int i = 1; i < stats.length; i++) {
            if (lowRobbery > stats[i].getRobbery()) {
                lowYear = stats[i].getYear();
                lowRobbery = stats[i].getRobbery();
            }
        }

        return lowYear;
    }

    //methods for calculating years with highest assault count    
    public static int aggAssaultHighYear() {
        int highYear;
        int highAssault;

        highYear = stats[1].getYear();
        highAssault = stats[1].getAggravatedAssault();

        for (int i = 1; i < stats.length; i++) {
            if (highAssault < stats[i].getAggravatedAssault()) {
                highYear = stats[i].getYear();
                highAssault = stats[i].getAggravatedAssault();
            }
        }

        return highYear;
    }

    public static int aggAssaultLowYear() {
        int lowYear;
        int lowAssault;

        lowYear = stats[1].getYear();
        lowAssault = stats[1].getAggravatedAssault();

        for (int i = 1; i < stats.length; i++) {
            if (lowAssault > stats[i].getAggravatedAssault()) {
                lowYear = stats[i].getYear();
                lowAssault = stats[i].getAggravatedAssault();
            }
        }

        return lowYear;
    }

    //methods for calculating years with highest propertycrime count    
    public static int propCrimeHighYear() {
        int highYear;
        int highPropCrime;

        highYear = stats[1].getYear();
        highPropCrime = stats[1].getPropertyCrime();

        for (int i = 1; i < stats.length; i++) {
            if (highPropCrime < stats[i].getPropertyCrime()) {
                highYear = stats[i].getYear();
                highPropCrime = stats[i].getPropertyCrime();
            }
        }

        return highYear;
    }

    public static int propCrimeLowYear() {
        int lowYear;
        int lowPropCrime;

        lowYear = stats[1].getYear();
        lowPropCrime = stats[1].getPropertyCrime();

        for (int i = 1; i < stats.length; i++) {
            if (lowPropCrime > stats[i].getPropertyCrime()) {
                lowYear = stats[i].getYear();
                lowPropCrime = stats[i].getPropertyCrime();
            }
        }

        return lowYear;
    }

    //methods for calculating years with highest burglary count    
    public static int burglaryHighYear() {
        int highYear;
        int highBurglary;

        highYear = stats[1].getYear();
        highBurglary = stats[1].getBurglary();

        for (int i = 1; i < stats.length; i++) {
            if (highBurglary < stats[i].getBurglary()) {
                highYear = stats[i].getYear();
                highBurglary = stats[i].getBurglary();
            }
        }

        return highYear;
    }

    public static int burglaryLowYear() {
        int lowYear;
        int lowBurglary;

        lowYear = stats[1].getYear();
        lowBurglary = stats[1].getBurglary();

        for (int i = 1; i < stats.length; i++) {
            if (lowBurglary > stats[i].getBurglary()) {
                lowYear = stats[i].getYear();
                lowBurglary = stats[i].getBurglary();
            }
        }

        return lowYear;
    }

    //methods for calculating years with highest Motor Vehicle Theft count    
    public static int mvTheftHighYear() {
        int highYear;
        int highVTheft;

        highYear = stats[1].getYear();
        highVTheft = stats[1].getMotorVehicleTheft();

        for (int i = 1; i < stats.length; i++) {
            if (highVTheft < stats[i].getMotorVehicleTheft()) {
                highYear = stats[i].getYear();
                highVTheft = stats[i].getMotorVehicleTheft();
            }
        }

        return highYear;
    }

    public static int mvTheftLowYear() {
        int lowYear;
        int lowVTheft;

        lowYear = stats[1].getYear();
        lowVTheft = stats[1].getMotorVehicleTheft();

        for (int i = 1; i < stats.length; i++) {
            if (lowVTheft > stats[i].getMotorVehicleTheft()) {
                lowYear = stats[i].getYear();
                lowVTheft = stats[i].getMotorVehicleTheft();
            }
        }

        return lowYear;
    }

    //method to assign strings to stringArray for user menu selections
    public static String[] getStringArray() {

        String rStats = ("Rape Rate Statistics:\n" + "************************\n" + "\nHighest Year: " + rapeHighYear() + "\n" + "Lowest Year: " + rapeLowYear() + "\n");
        String mStats = ("Murder Rate Statistics:\n" + "************************\n" + "\nHighest Year: " + murderHighYear() + "\n" + "Lowest Year: " + murderLowYear() + "\n");
        String robStats = ("Robbery Rate Statistics:\n" + "************************\n" + "\nHighest Year: " + robberyHighYear() + "\n" + "Lowest Year: " + robberyLowYear() + "\n");
        String assaultStats = ("Assault Rate Statistics:\n" + "************************\n" + "\nHighest Year: " + aggAssaultHighYear() + "\n" + "Lowest Year: " + aggAssaultLowYear() + "\n");
        String propCrimeStats = ("Property Crime Rate Statistics:\n" + "************************\n" + "\nHighest Year: " + propCrimeHighYear() + "\n" + "Lowest Year: " + propCrimeLowYear() + "\n");
        String burglaryStats = ("Burglary Rate Statistics:\n" + "************************\n" + "\nHighest Year: " + burglaryHighYear() + "\n" + "Lowest Year: " + burglaryLowYear() + "\n");
        String mvStats = ("Vehicle Theft Statistics:\n" + "************************\n" + "\nHighest Year: " + mvTheftHighYear() + "\n" + "Lowest Year: " + mvTheftLowYear() + "\n");

        stringArray[0] = getPopGrowth();
        stringArray[1] = mStats;
        stringArray[2] = robStats;
        stringArray[3] = propCrimeStats;
        stringArray[4] = assaultStats;
        stringArray[5] = rStats;
        stringArray[6] = burglaryStats;
        stringArray[7] = mvStats;

        return stringArray;
    }

}//end USCrimeClass
