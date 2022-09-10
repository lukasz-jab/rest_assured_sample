package cocart.cart.service.test;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

public class J_UseValueFromResponse {

    ServiceHelper service = new ServiceHelper();
    String key;
    String endpoint;

    @Test
    public void agetResponseValueToUpdate() {
        JSONObject body = new JSONObject();
        body.put( "product_id", 138);
        body.put("quantity", 4);
        body.put("return_cart", false);
        endpoint = "/cocart/v1/add-item";

        Response addItem = service.sendPostRequest(body.toString(), endpoint);
        key = addItem.getBody().jsonPath().getString("key");
        System.out.println(key);

        String endpoint2 = "/cocart/v1/item";
        JSONObject body2 = new JSONObject();
        System.out.println("????????????????????????????????   "+key);
        body2.put("cart_item_key", key);
        body2.put("quantity", 7);
        body2.put("return", false);

        Response updateItem = service.sendPostRequest(body2.toString(), endpoint2);
        updateItem.prettyPrint();
    }
}
