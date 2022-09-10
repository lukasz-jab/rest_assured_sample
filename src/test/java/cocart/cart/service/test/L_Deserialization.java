package cocart.cart.service.test;

import cocart.cart.service.test.deserilizing.AddItemResponse;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

public class L_Deserialization {

    ServiceHelper service = new ServiceHelper();

    @Test
    public void addItemDeserialization() {
        JSONObject body = new JSONObject();
        body.put("product_id", 140);
        body.put("quantity", 4);
        body.put("return_cart", false);
        String endpoint = "/cocart/v1/add-item";

        Response response = service.sendPostRequest(String.valueOf(body), endpoint);
        AddItemResponse responseBody = response.as(AddItemResponse.class);
        System.out.println(responseBody.getKey());

        System.out.println(responseBody.getLine_tax_data().getTotal().get_1());
        System.out.println(responseBody.getLine_tax_data().getSubtotal().get_1());

    }
}
