package grupp6.svp.domain;
import java.util.HashMap;
/**
 * Created by malinvagnborg on 2017-05-08.
 */
public class Basket {

    HashMap<String, Integer> basketItems;
    public Basket(){
    }
    public HashMap getBasketItems(){
        return basketItems;
    }
    public void addToBasket(String itemId, int price){
        basketItems.put(itemId, price);
    }
}

