package grupp6.svp.domain.DomainObjects;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class DomainObject {

    public abstract DataTransferObject create(HttpServletRequest request, HttpServletResponse response);
}
