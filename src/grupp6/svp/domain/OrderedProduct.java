package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;

/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class OrderedProduct {

    private int productId;

    private int quantity;

    private int orderId;

    public OrderedProduct(int productId, int quantity, int orderId) {
        this.productId = productId;
        this.quantity = quantity;
        this.orderId = orderId;

        // TODO Registrera objektet i fasaden?
        // DataFacade.register(this);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

}
