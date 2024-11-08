/*
    Define a class Address representing an address with attributes such as street, city, state, and zip code.
    Provide constructors to initialize these attributes.
*/

// Class representing an Address
public class Address
{
    // Attributes
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Default constructor
    public Address()
    {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    // Constructor with parameters
    public Address(String street, String city, String state, String zipCode)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters and Setters
    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    // Method to return the full address as a string
    public String getFullAddress()
    {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    // Main method to test the Address class
    public static void main(String[] args) {
        // Create an address using the constructor with parameters
        Address myAddress = new Address("Bhavani Nagar", "Pune", "Maharashtra", "411062");

        // Print the full address
        System.out.println("Full Address: " + myAddress.getFullAddress());

        // Create an address using the default constructor and setters
        Address obj = new Address();
        obj.setStreet("Ganesh Nagar");
        obj.setCity("Pune");
        obj.setState("Maharashtra");
        obj.setZipCode("411007");

        // Print the full address
        System.out.println("Full Address: " + obj.getFullAddress());
    }
}

/*
    OUTPUT:
    Full Address: Bhavani Nagar, Pune, Maharashtra 411062
    Full Address: Ganesh Nagar, Pune, Maharashtra 411007
 */