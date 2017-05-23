package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class Basket extends DomainObject {

    private HashMap<String, Integer> basketItems;

    Basket() {
    }

    public HashMap getBasketItems() {
        return basketItems;
    }

    public void addToBasket(String itemId, int price) {
        basketItems.put(itemId, price);
    }

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }
}

