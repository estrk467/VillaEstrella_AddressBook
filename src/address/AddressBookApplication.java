/**
 * AddressBookApplication is a main application class that will eventually
 * serve as an individual desktop address book application
 *
 * @author: Karla Villa Estrella
 */


package address;
import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.*;
import java.util.Scanner;


public class AddressBookApplication {


    public static void main(String[] args) throws IOException {


        //user's menu choice
        String menuChoice = "";

        //user's input
        String userInput = "";

        //scanner to read user's input
        Scanner input = new Scanner(System.in);

        //Creates a new address book
        AddressBook addressBook = new AddressBook();

        //creates a new instance of menu
        Menu newMenu = new Menu();



        //displays menu and
        while (!menuChoice.equals("f")) {

            //display menu
            newMenu.displayMenu();

            //get user's menu choice
            menuChoice = input.nextLine();


            //if choice is "a"
            if (menuChoice.equals("a")) {

                //Ask user for file name
                System.out.println("Enter in File name: ");

                //get user's input
                userInput = input.nextLine();

                //send to readFromAFile method to read entries to addressBook
                addressBook.readFromAFile(userInput, addressBook);

                //if choice is "b"
            } else if (menuChoice.equals("b")) {

                //prompt user for new address entry information and creates a new address entry
                AddressEntry newEntry = new AddressEntry(newMenu.prompt_FirstName(), newMenu.prompt_LastName(),
                        newMenu.prompt_Street(), newMenu.prompt_City(), newMenu.prompt_State(),
                        newMenu.prompt_Zip(), newMenu.prompt_Email(), newMenu.prompt_Telephone());

                //add new address entry to addressBook
                addressBook.add(newEntry);

            //of choice is "c"
            } else if (menuChoice.equals("c")) {

                //ask user for the last name of contact to remove
                System.out.println("Enter in Last Name of contact to remove");

                //read user's input
                userInput = input.nextLine();

                //save last name in a temporary variable
                String tempName = userInput;

                //print out the entries found with the last name asked by the user
                System.out.println("The following entry was found in the address book.");
                addressBook.find(userInput);

                //prompt user if that is the correct entry
                System.out.println("Hit 'y' to remove the entry or 'n' to return to main menu");
                //read user's input
                userInput = input.nextLine();

                //if the user's input is "y" then remove the entry from addressbook
                if(userInput.equals("y")){
                    addressBook.remove(tempName);
                }


            //if choice is "d"
            } else if (menuChoice.equals("d")) {

                //prompt user for the last name they wish to find
                System.out.println("Enter in all or beginning of last name you wish to find: ");
                //get user's input
                userInput = input.nextLine();

                //print entries
                addressBook.find(userInput);

            //if choice is "e"
            } else if (menuChoice.equals("e")) {

                //print list of entries in alphabetical order
                addressBook.list();

            //if choice is "f"
            } else if (menuChoice.equals("f")) {
                //quit program
                System.out.println("Goodbye!");

            //if the choice is not valid, ask user to pick a valid menu option
            } else {
                System.out.println("Invalid choice! Please enter a valid menu option: ");
            }



        }
        //close scanner
        input.close();
    }
}
