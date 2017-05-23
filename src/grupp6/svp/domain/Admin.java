package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.AdminData;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Admin extends DomainObject{

    private AdminData data;

    public Admin(){
        data = new AdminData();
    }

    public int getAdminID() {
        return data.getId();
    }

    public String getAdminFirstName() {
        return data.getAdminFirstName();
    }

    public String getAdminLastName() {
        return data.getAdminLastName();
    }

    public String getAdminMail() {
        return data.getAdminMail();
    }

    public String getAdminPassword() {
        return data.getAdminPassword();
    }

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }


}
