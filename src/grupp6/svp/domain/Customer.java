package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Customer extends DomainObject{
    private int CustomerID;
    private String CustomerFirstName;
    private String CustomerLastName;
    private String CustomerAdress;
    private String CustomerCity;
    private int CustomerZipCode;
    private String CustomerMail;
    private String CustomerPassword;



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

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }
}
