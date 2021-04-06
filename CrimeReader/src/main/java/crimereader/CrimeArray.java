/**Author: Alexander Spory
 *Program: Short program reads lines from the Crime.csv file and adds them to an array full of objects.
 */
package crimereader;

//import modules to use in class CrimeArray
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CrimeArray {//start CrimeArray

    //declare Array for objects and multi-dimensional ArrayList for lines in Crime.csv
    public static USCrimeClass[] statsArray = new USCrimeClass[21];
    public static List<List<String>> line = new ArrayList<>();

    public static USCrimeClass[] reader() {//start reader method
        //initialize variables for constructor
        String fileLine;
        String[] data;
        int year;
        float pop;
        int murder;
        float murderRate;
        int rape;
        float rapeRate;
        int robbery;
        float robberyRate;
        int aggravatedAssault;
        float aggravatedAssaultRate;
        int propertyCrime;
        float propertyCrimeRate;
        int burglary;
        float burglaryRate;
        int motorVehicleTheft;
        float motorVehicleTheftRate;

        //try-with-resources and catch statement for reading each line from Crime.csv and put into multi-dimensional ArrayList
        try (BufferedReader inputStream = new BufferedReader(new FileReader("Crime.csv"))) {
            while ((fileLine = inputStream.readLine()) != null) {
                data = fileLine.split(",");

                line.add(Arrays.asList(data)); //add lines to multidimensional Arraylist
            }

        } catch (IOException io) { //catch statement for IO exceptions
            System.out.println("File IO exception" + io.getMessage());
        }

        //for loop to add objects with fields to Object storing array
        for (int i = 1; i < statsArray.length; i++) {
            year = Integer.parseInt(line.get(i).get(0));
            pop = Float.parseFloat(line.get(i).get(1));
            murder = Integer.parseInt(line.get(i).get(4));
            murderRate = Float.parseFloat(line.get(i).get(5));
            rape = Integer.parseInt(line.get(i).get(6));
            rapeRate = Float.parseFloat(line.get(i).get(7));
            robbery = Integer.parseInt(line.get(i).get(8));
            robberyRate = Float.parseFloat(line.get(i).get(9));
            aggravatedAssault = Integer.parseInt(line.get(i).get(10));
            aggravatedAssaultRate = Float.parseFloat(line.get(i).get(11));
            propertyCrime = Integer.parseInt(line.get(i).get(12));
            propertyCrimeRate = Float.parseFloat(line.get(i).get(13));
            burglary = Integer.parseInt(line.get(i).get(14));
            burglaryRate = Float.parseFloat(line.get(i).get(15));
            motorVehicleTheft = Integer.parseInt(line.get(i).get(18));
            motorVehicleTheftRate = Float.parseFloat(line.get(i).get(19));

            //store objects with fields in array
            statsArray[i] = new USCrimeClass(year, pop, murder, rape, robbery, aggravatedAssault, propertyCrime, burglary, motorVehicleTheft);

        }

        return statsArray; //return statsArray full of objects

    }//reader

}//end CrimeArray class
