/**
 * AddressEntry class represents a single address entry
 *
 * @author: Karla Villa Estrella
 */

package address.data;




public class AddressEntry {

    /**
     * first name of AddressEntry contact
     */
    private String firstName;

    /**
     * last name of AddressEntry contact
     */
    private String lastName;

    /**
     * street name of AddressEntry contact
     */
    private String street;

    /**
     * city name of AddressEntry contact
     */
    private String city;

    /**
     * state name of AddressEntry contact
     */
    private String state;

    /**
     * zipcode of AddressEntry contact
     */
    private int zip;

    /**
     * phone of AddressEntry contact
     */
    private String phone;

    /**
     * email of AddressEntry contact
     */
    private String email;

    /**
     * Default Constructor
     * Initializes all attributes to a default value
     */
    public AddressEntry(){
        firstName = " ";
        lastName = " ";
        street = "";
        city = "";
        state = "";
        zip = 0;
        phone = "";
        email = "";


    }

    /**
     * Other constructor
     * Initializes all attributes to a new value
     * @param firstName new first name
     * @param lastName new last name
     * @param street new street name
     * @param state new state
     * @param zip new zipcode
     * @param phone new phone number
     * @param email new email
     */
    public AddressEntry(String firstName, String lastName,String street, String city,
                        String state, int zip, String phone, String email){
        //intialize the class variables.
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;

    }

    /**
     * Creates a formatted string of all the attributes
     * @return a String with all attributes
     */
    public String toString(){

        return firstName + " " + lastName + "\n" + street +
                "\n" + city + ", " + state + " " + zip + "\n" + email + "\n"+ phone + "\n\n";
    }

    /***************
     * Setters
     ***************/

    /**
     * Sets firstName to new value
     * @param firstName new first name
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;

    }

    /**
     *  Sets lastName to new value
     * @param lastName new last name
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Sets street to a new value
     * @param street new street name
     */
    public void setStreet(String street){
        this.street = street;
    }

    /**
     * Sets city to a new value
     * @param city new city name
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Sets state to a new value
     * @param state new state name
     */
    public void setState (String state){
        this.state = state;
    }

    /**
     * Sets zip to a new value
     * @param zip new zipcode
     */
    public void setZip (int zip){
        this.zip = zip;
    }

    /**
     * Sets phone to a new value
     * @param phone new phone number
     */
    public void setPhone (String phone){
        this.phone = phone;
    }

    /**
     * Sets email to a new value
     * @param email new email
     */
    public void setEmail (String email){
        this.email = email;
    }

    /*******************
     * Getters
     ******************/

    /**
     * Gets firstName
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Gets lastName
     * @return last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Gets street
     * @return street
     */
    public String getStreet(){
        return street;
    }

    /**
     * Gets city
     * @return city
     */
    public String getCity(){
        return street;
    }

    /**
     * Gets state
     * @return state
     */
    public String getState(){
        return state;
    }

    /**
     * Gets zip
     * @return zip
     */
    public int getZip(){
        return zip;
    }

    /**
     * Gets phone
     * @return phone
     */
    public String getPhone(){
        return phone;
    }

    /**
     * Gets email
     * @return email
     */
    public String getEmail(){
        return email;
    }



}
