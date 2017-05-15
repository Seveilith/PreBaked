package grupp6.svp.domain;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Basket extends DomainObject{

    HashMap<String, Integer> basketItems;
    public Basket(){
    }
    public HashMap getBasketItems(){
        return basketItems;
    }
    public void addToBasket(String itemId, int price){
        basketItems.put(itemId, price);
    }

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }
}

