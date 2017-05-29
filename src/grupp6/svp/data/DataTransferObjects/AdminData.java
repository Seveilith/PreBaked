package grupp6.svp.data.DataTransferObjects;

import java.io.Serializable;

public class AdminData extends DataTransferObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private int AdminID;
    private String AdminFirstName, AdminLastName, AdminMail, AdminPassword;

    public void setAdminID(int adminID) {
        AdminID = adminID;
    }

    public String getAdminFirstName() {
        return AdminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        AdminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return AdminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        AdminLastName = adminLastName;
    }

    public String getAdminMail() {
        return AdminMail;
    }

    public void setAdminMail(String adminMail) {
        AdminMail = adminMail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    @Override
    public int getId() {
        return AdminID;
    }

    @Override
    public void setId(int id) {
        this.AdminID = id;
    }
}