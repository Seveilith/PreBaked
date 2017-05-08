package grupp6.svp.domain;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Admin {

    private int AdminID;
    private String AdminFirstName;
    private String AdminLastName;
    private String AdminMail;
    private String AdminPassword;

    public Admin(int AdminID, String AdminFirstName, String AdminLastName, String AdminMail, String AdminPassword){
        this.AdminID = AdminID;
        this.AdminFirstName = AdminFirstName;
        this.AdminLastName = AdminLastName;
        this.AdminMail = AdminMail;
        this.AdminPassword = AdminPassword;
    }

    public int getAdminID() {
        return AdminID;
    }

    public String getAdminFirstName() {
        return AdminFirstName;
    }

    public String getAdminLastName() {
        return AdminLastName;
    }

    public String getAdminMail() {
        return AdminMail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }
}
