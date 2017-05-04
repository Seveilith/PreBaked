package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;

/**
 * Created by malinvagnborg on 2017-05-03.
 */
public class Order {
    /**
     * Variable for orderID.
     * It is declared to be final so that it cannot be changed later on.
     */
    public final String orderId;

    /**
     * Variable for orderstatus.
     * It is declared to be final so that it cannot be changed later on.
     */
    public String orderStatus;

    /**
     * This is the constructor of the class, first it sets the values
     * of the variables. Last, it registers the object to the data facade.
     *
     *
     * @param orderId	orderId for the Order to be registered in the data facade,
     * 					it is also the unquie identifer in the database.
     * @param orderStatus	orderstatus for the Order to be registered in the data facade
     */
    public Order(String orderId, String orderStatus){
        this.orderId = orderId;
        this.orderStatus = orderStatus;

      //  DataFacade.registerOrder(this);
    }

}
