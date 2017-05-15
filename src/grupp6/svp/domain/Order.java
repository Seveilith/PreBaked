package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by malinvagnborg on 2017-05-03.
 */
public class Order extends DomainObject {

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

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }
}
