package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DataTransferObjects.ProductData;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Product {

    private ProductData data;

    public Product(){
        data = new ProductData();

    }

    public DataTransferObject delete(int id){
        data.setProductId(id);

        return data;
    }

    public void find(){

    }

    public void insert(){

    }
}
