package cocart.cart.service.test;

import org.json.JSONObject;
import org.junit.Test;

public class D_PostMethodJSONBody {

    ServiceHelper service = new ServiceHelper();
    @Test
    public void addItemByJSONBody() {
        JSONObject body = new JSONObject();
        body.put( "product_id", "1690");
        body.put("quantity", 4);
        body.put("return_cart", true);
        String endpoint = "/cocart/v1/add-item";

        service.sendPostRequest(String.valueOf(body), endpoint);
    }

    @Test
    public void calculatetemByJSONBody() {
        JSONObject body = new JSONObject();
        body.put( "return", true);
        String endpoint = "/cocart/v1/calculate";
        System.out.println(service.sendPostRequest(body.toString(), endpoint));
    }
}
