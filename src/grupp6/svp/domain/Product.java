package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DataTransferObjects.ProductData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends DomainObject {

    private ProductData data;

    public Product() {
        data = new ProductData();
    }

    public DataTransferObject delete(int id) {
        data.setId(id);

        return data;
    }

    public void find() {
    }

    public void insert() {
    }


    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        data.setId(Integer.parseInt(request.getParameter("id")));
        data.setProductDescription(request.getParameter("description"));
        data.setProductName(request.getParameter("name"));
        data.setProductPrice(Integer.parseInt(request.getParameter("price")));
        data.setProductQuantity(Integer.parseInt(request.getParameter("quantity")));

        return data;
    }
}
