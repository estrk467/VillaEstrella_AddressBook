/**
 * AddressBook is a class that creates a list of address entries and adds new entries
 *
 * @author: Karla Villa Estrella
 */
package address.data;
import java.util.*;
import java.io.*;



public class AddressBook {

    /**
     * collection variable to store set of AddressEntry objects that currently in AddressBook.
     */

    private TreeMap<String, AddressEntry> addressEntryList = new TreeMap<String, AddressEntry>();


    /**
     * Goes through AddressEntryList and prints
     * all entries in list alphabetically
     */
    public void list(){

        int i = 1;
        for(Map.Entry<String, AddressEntry> e: addressEntryList.entrySet()){
           System.out.print(i + ". ");
            System.out.println(e.getValue());
            i++;
        }

    }

    /**
     * Adds a new entry to AddressEntryList
     * @param newEntry new entry to add to the list
     */
    public void add(AddressEntry newEntry){

        //add the newEntry to addressEntryList
        addressEntryList.put(newEntry.getLastName(), newEntry);

    }


    /**
     * Finds entries in addressBook with corresponding last name
     * @param lastName String to find address entries
     */
    public void  find (String lastName){

        System.out.println( addressEntryList.get(lastName));

    }


    /**
     * Remove entry from addressBook with corresponding last name
     * @param lastName
     */
    public void remove(String lastName){

        addressEntryList.remove(lastName);

    }


    /**
     * Reads entries from file and adds the new entries to addressBook
     * @param fileName file with new address entries
     */
    public void readFromAFile(String fileName, AddressBook ab) throws IOException{
        //creates a FileReader
        FileReader file_input = new FileReader(fileName);

        //creates BufferedReader
        BufferedReader br = new BufferedReader(file_input);

        //reads file with there is still lines to read
        while(br.ready()){
            //creates a new address entry
            AddressEntry newAddressEntry = new AddressEntry(br.readLine(), br.readLine(), br.readLine(),
                    br.readLine(), br.readLine(), Integer.parseInt(br.readLine()), br.readLine(), br.readLine());

            //add to addressBook
            ab.add(newAddressEntry);
        }

        //close bufferedReader
        br.close();

        //close fileReader
        file_input.close();


    }



}
