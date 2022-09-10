package cocart.cart.service.test;

import org.junit.Test;

public class C_PostMethodBodyString {

    ServiceHelper service = new ServiceHelper();

    @Test
    public void addItemWithBodyString() {
        String bodyString = "{\n" +
                "    \"product_id\": \"138\",\n" +
                "    \"quantity\": 3,\n" +
                "    \"return_cart\": true\n" +
                "}";
        String endpoint = "/cocart/v1/add-item";
        System.out.println(service.sendPostRequest(bodyString, endpoint));
    }
}
