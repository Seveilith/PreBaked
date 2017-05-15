package grupp6.svp.data.DataTransferObjects;

/**
 * Created by alo on 2017-05-08.
 */
public class AdminData extends DataTransferObject {

    private int AdminID;
    private String AdminFirstName;
    private String AdminLastName;
    private String AdminMail;
    private String AdminPassword;

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