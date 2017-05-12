package grupp6.svp.data.DataTransferObjects;

import grupp6.svp.domain.Product;

/**
 * Created by alo on 2017-05-08.
 */
public class ProductData extends DataTransferObject  {
    private int productId;
    private String productName;
    private String productDescription;
    private int productPrice;
    private int productQuantity;

    public ProductData(int productId){
        this.productId = productId;
    }

    public ProductData(){
    }

    public int getId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

}

