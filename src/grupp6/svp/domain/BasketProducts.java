package grupp6.svp.domain;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class BasketProducts {

    private int BasketID;
    private int ProductID;
    private int Quantity;

    public int getBasketID() {
        return BasketID;
    }

    public int getProductID() {
        return ProductID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public BasketProducts(int BasketID, int ProductID, int Quantity){
        this.BasketID = BasketID;
        this.ProductID = ProductID;
        this.Quantity = Quantity;

    }
}