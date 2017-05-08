package grupp6.svp.domain;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Designer {

    private int designerId;

    private String designerFirstName;

    private String designerLastName;

    private String designerMail;

    private String designerPassword;

    public Designer(int designerId, String designerFirstName, String designerLastName, String designerMail, String designerPassword) {
        this.designerId = designerId;
        this.designerFirstName = designerFirstName;
        this.designerLastName = designerLastName;
        this.designerMail = designerMail;
        this.designerPassword = designerPassword;

        // TODO Registrera objektet i fasaden?
        // DataFacade.register(this);
    }

    public int getDesignerId() {
        return designerId;
    }

    public void setDesignerId(int designerId) {
        this.designerId = designerId;
    }

    public String getDesignerFirstName() {
        return designerFirstName;
    }

    public void setDesignerFirstName(String designerFirstName) {
        this.designerFirstName = designerFirstName;
    }

    public String getDesignerLastName() {
        return designerLastName;
    }

    public void setDesignerLastName(String designerLastName) {
        this.designerLastName = designerLastName;
    }

    public String getDesignerMail() {
        return designerMail;
    }

    public void setDesignerMail(String designerMail) {
        this.designerMail = designerMail;
    }

    public String getDesignerPassword() {
        return designerPassword;
    }

    public void setDesignerPassword(String designerPassword) {
        this.designerPassword = designerPassword;
    }
}
