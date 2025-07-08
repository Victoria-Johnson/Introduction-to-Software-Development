/** TODO 1 Solution Start: Import the Scanner **/
import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String[] args) {

        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);

        /** TODO 8: Go below the TODO 2 after the creation of Scanner variable  **/
        /**         and declare a variable "subChoice" **/
        int subChoice;

        /** TODO 3: A variable for getting the day of the week is given below **/
        /**         Initialize the variable to have the value 1 **/
        /** 1- is Monday, 2- is Tuesday and so on **/
        int dayOfTheWeek = 1;

        /** TODO 4: Display a menu to get the day of the week from the user **/
        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day. Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");

        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
        System.out.println("Enter your choice of the day (1-7):");
        dayOfTheWeek = keyboard.nextInt();

        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
        /**         for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {

            case 1:
                System.out.println("Monday: It is back to work.....");

            /** TODO 9: Move below the display "Monday: It is back to work....." **/
            /**         in case 1 and create a menu  **/

                System.out.println("Did you have breakfast?");

                System.out.println("*********** SUB MENU FOR MONDAY ******");
                System.out.println("1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one");

                /** TODO 10: After the sub-menu inside case 1, prompt for input on choice **/
                /**         from Toni and store it in the variable subChoice **/

                System.out.println("Enter your choice (1 or 2)");
                subChoice = keyboard.nextInt();

                /** TODO 11: Display appropriate response to Toni, based on value in **/
                /**          variable subChoice using if, if-else, else **/

            switch (subChoice) {

                case 1:
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                    break;

                case 2:
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                    break;
                default:
                    System.out.println("NO such choice available");
            }


            /** TODO 6(a): Implement all other cases for Tuesday to Sunday **/
            /** TODO 7: Introduce a "break" after each case code, except the last  **/
            break;

            case 2:
                System.out.println("Tuesday: Time to start a project.");
                break;

            case 3:
                System.out.println("Wednesday: It's coding time!");
                break;

            case 4:
                System.out.println("Thursday: Time to Run the code.");
                break;

            case 5:
                System.out.println("Friday: Lets fix the bugs... ");
                break;

            case 6:
                System.out.println("Saturday: FUN TIME!");

            /**TODO (OPTIONAL) 12: Spice it up and subchoice another day of the week **/

                System.out.println("What plans do we have today?");

                System.out.println("**********SUBMENU FOR SATURDAY**********");
                System.out.println("1. Go to a bar");
                System.out.println("2. Check out new nightclub with friends");

                System.out.println("Enter your choice (1 or 2)");
                subChoice = keyboard.nextInt();

            switch (subChoice) {

                case 1:
                    System.out.println("Let's grab a few beer tonight.");
                    break;

                case 2:
                    System.out.println("We are going to be out all night.");
                    break;
                default:
                    System.out.println("Let's chill at home tonight.");
            }

            break;
            case 7:
                System.out.println("Sunday: Let's get ready for a new week of work");
                break;

            /** TODO 6(b): Implement "default" to handle Toni entering  **/
            /**            values less than 1 or more than 7 **/

            default:
                System.out.println("Invalid day of the week");
        }

    } //end of main method

} //end of the main class