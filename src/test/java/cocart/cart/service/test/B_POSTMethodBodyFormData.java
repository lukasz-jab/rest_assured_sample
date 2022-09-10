package cocart.cart.service.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class B_POSTMethodBodyFormData {

    private final ServiceHelper service = new ServiceHelper();

    @Test
    public void addItemWithBodyFormData() {
        int product_id = 138;
        int quantity = 5;
        boolean return_cart = true;
        String endpoint = "/cocart/v1/add-item";

        service.addItem(product_id, quantity, return_cart, endpoint);
    }

    @Test
    public void addItemWithBodyFormMap() {
        Map<String, Object> queryParams = new HashMap<>();
                queryParams.put("product_id", 138);
                queryParams.put("quantity", 5);
                queryParams.put("return_cart", true);
        String endpoint = "/cocart/v1/add-item";

        service.sendPostRequest(queryParams, endpoint);
    }

    @Test
    public void calculateWithBodyParams() {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("return", true);
        String endpoint = "/cocart/v1/calculate";
        service.sendPostRequest(queryParams, endpoint);
    }
}
