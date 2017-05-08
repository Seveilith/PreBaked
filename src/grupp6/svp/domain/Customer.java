package grupp6.svp.domain;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Customer {
    private int CustomerID;
    private String CustomerFirstName;
    private String CustomerLastName;
    private String CustomerAdress;
    private String CustomerCity;
    private int CustomerZipCode;
    private String CustomerMail;
    private String CustomerPassword;

    public Customer(int CustomerID, String CustomerFirstName, String CustomerLastName, String CustomerAdress, String CustomerCity, int CustomerZipCode, String CustomerMail, String CustomerPassword){
        this.CustomerID = CustomerID;
        this.CustomerFirstName = CustomerFirstName;
        this.CustomerLastName = CustomerLastName;
        this.CustomerAdress = CustomerAdress;
        this.CustomerCity = CustomerCity;
        this.CustomerZipCode = CustomerZipCode;
        this.CustomerMail = CustomerMail;
        this.CustomerPassword = CustomerPassword;

    }

    public int getCustomerID() {
        return CustomerID;
    }

    public String getCustomerFirstName() {
        return CustomerFirstName;
    }

    public String getCustomerLastName() {
        return CustomerLastName;
    }

    public String getCustomerAdress() {
        return CustomerAdress;
    }

    public String getCustomerCity() {
        return CustomerCity;
    }

    public int getCustomerZipCode() {
        return CustomerZipCode;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public String getCustomerPassword() {
        return CustomerPassword;
    }
}
