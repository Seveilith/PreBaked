package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by alo on 2017-05-15.
 */
public abstract class DomainObject {

    public abstract DataTransferObject create(HttpServletResponse response, HttpServletRequest request);
}
