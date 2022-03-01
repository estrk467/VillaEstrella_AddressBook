/**
 * Menu is a class to represent prompts to gather user input for AddressBook
 *
 * @author: Karla Villa Estrella
 */

package address;
import java.util.Scanner;



public class Menu {

    //string for user input
    private String userInput;
    //int for zipcode input from user
    private int zipInput;
    //scannner to read input from user
    private Scanner input = new Scanner(System.in);


    /**
     * prompt for First Name and returns the user's input for first name
     * @return String for first name input from user
     */
    public String prompt_FirstName(){

    System.out.print("First Name: ");
    userInput = input.nextLine();

        return userInput;

    }


    /**
     * prompt for Last Name and returns user's input for last name
     * @return String for last name input from user
     */
    public String prompt_LastName(){
        System.out.print("Last Name: ");
        userInput = input.nextLine();

        return userInput;
    }

    /**
     * prompt for Street and returns user's input for street name
     * @return String for street input from user
     */
    public String prompt_Street(){
        System.out.print("Street: ");
        userInput = input.nextLine();
        return userInput;
    }


    /**
     * prompt for City and returns user's input for city name
     * @return String for city input from user
     */
    public String prompt_City(){
        System.out.print("City: ");
        userInput = input.nextLine();
        return userInput;
    }

    /**
     * prompt for State and returns user's input for state
     * @return String for state input from user
     */
    public String prompt_State(){
        System.out.print("State: ");
        userInput = input.nextLine();
        return userInput;
    }


    /**
     * prompt for zipcode and returns user's input for zipcode
     * @return String for zipcode input from user
     */
    public int prompt_Zip(){
        System.out.print("Zipcode: ");
        zipInput = input.nextInt();
        input.nextLine(); //gets rid of space


        return zipInput ;
    }

    /**
     * prompt for telephone and returns user's input for telephone
     * @return String for telephone input from user
     */
    public String prompt_Telephone(){

        System.out.print("Phone: ");
        userInput = input.nextLine();
        return userInput;
    }

    /**
     * prompt for email and returns user's input for email
     * @return String for email input from user
     */
    public String prompt_Email(){
        System.out.print("Email: ");
        userInput = input.nextLine();
        return userInput;
    }

    /**
     * Displays the menu options
     */
    public void displayMenu(){
        System.out.println("*************************************\n" +
                "Please enter your menu selection\n" +
                "a) Loading form a file\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*************************************");

    }


}
