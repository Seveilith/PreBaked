package grupp6.svp.domain;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Product {


    private int productId;

    private String productName;

    private String productDescription;

    private int productPrice;

    private int productQuantity;

    public Product(int productId, String productName, String productDescription, int productPrice, int productQuantity){
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getProductId(){return productId;}

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
