package cocart.cart.service.test;

import cocart.cart.service.test.serilizing.AddItemToCartPOJO;
import io.restassured.response.Response;
import org.junit.Test;

public class K_Serializing {

    ServiceHelper service = new ServiceHelper();

    @Test
    public void serializing() {
        Integer product_id = 140;
        Integer quantity = 1;
        boolean returnCart = false;

        AddItemToCartPOJO bodyRequest = new AddItemToCartPOJO(product_id, quantity, returnCart);
        String endpoint = "/cocart/v1/add-item";

        Response response = service.sendPostRequest(bodyRequest, endpoint);
        response.prettyPrint();
    }
}
