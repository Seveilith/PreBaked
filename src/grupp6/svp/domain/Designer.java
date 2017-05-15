package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Designer extends DomainObject {

    private int designerId;

    private String designerFirstName;

    private String designerLastName;

    private String designerMail;

    private String designerPassword;

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

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }
}
