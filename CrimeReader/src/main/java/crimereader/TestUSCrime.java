/**Author: Alexander Spory
 *Program: Short program that displays information about US Crime Statistics requested by the user
 */
package crimereader;

//import modules used in TestUSCrime
import java.util.*;
import java.time.*;

public class TestUSCrime {// start TestUSCrime

    //define array for selection menu choices
    public static String[] arr = new String[9];

    //define class variables and objects
    public static Scanner scanIn = new Scanner(System.in);
    public static Instant start = Instant.now();
    public static String selection;
    public static int num;

    //static block to assign arr array to the return value of getStringArray of USCrimeClass
    static {
        arr = USCrimeClass.getStringArray();
    }

    public static void main(String[] args) { //start main        
        while (true) { //while 'true' menu block
            //menu block output
            System.out.println("*****Welcome to the US Crime Statistics Applciation*****");
            System.out.println("Please enter the number of the menu item you would like to see more about. To exit, enter 'Q'.\n");
            System.out.println("1. Population Statistics (Includes % of growth for each consecutive year.");
            System.out.println("2. Murder Rate Statistics");
            System.out.println("3. Robbery Rate Statistics");
            System.out.println("4. Property Crime Statistics");
            System.out.println("5. Aggravated Assault Statistics");
            System.out.println("6. Rape Statistics");
            System.out.println("7. Burglary Statistics");
            System.out.println("8. Motor Vehicle Theft Statistics");
            System.out.println("Q. Quit the program\n");
            System.out.println("Enter your selection please: ");

            //user input for menu choice
            selection = scanIn.next();
            selection = selection.toLowerCase();

            //conditional for user choice
            if (selection.equals("q")) {
                break;
            } else {
                //switch statement for user selection
                switch (selection) {
                    case "1":
                        //System.out.println(arr[0]);
                        System.out.println(USCrimeClass.getPopGrowth());
                        break;
                    case "2":
                        System.out.println(arr[1]);
                        break;
                    case "3":
                        System.out.println(arr[2]);
                        break;
                    case "4":
                        System.out.println(arr[3]);
                        break;
                    case "5":
                        System.out.println(arr[4]);
                        break;
                    case "6":
                        System.out.println(arr[5]);
                        break;
                    case "7":
                        System.out.println(arr[6]);
                        break;
                    case "8":
                        System.out.println(arr[7]);
                        break;
                    default:
                        System.out.println("Please enter the number of a valid menu item.");
                        break;
                }//end switch
            }//end if-else conditional

        }//end while true
        Instant end = Instant.now();//end of instant for running time
        Duration elapsed = Duration.between(start, end);//object to hold elapsed time

        //print ending tagline plus time elapsed
        System.out.println("Thank you for visiting and utilizing the US Crimes Statistics Application.");
        System.out.println("Elapsed time in seconds was: " + elapsed.toSeconds());
    }//end main

}//end TestUSCrime
