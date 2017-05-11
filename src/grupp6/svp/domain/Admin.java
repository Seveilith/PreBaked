package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.AdminData;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Admin {

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
}
