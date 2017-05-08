package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;

/**
 * Created by malinvagnborg on 2017-05-03.
 */
public class Order {

    private int orderId;

    private String orderStatus;

    public Order(int orderId, String orderStatus){
        this.orderId = orderId;
        this.orderStatus = orderStatus;

        // TODO Registrera objektet i fasaden?
        // DataFacade.register(this);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
