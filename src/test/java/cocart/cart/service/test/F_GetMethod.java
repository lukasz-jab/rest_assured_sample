package cocart.cart.service.test;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

public class F_GetMethod {

    ServiceHelper service = new ServiceHelper();

    @Test
    public void getCartContents() {
        String endpoint = "/cocart/v1/get-cart";
        Response response = service.sendGetRequest(endpoint);
        response.getBody().prettyPeek();
    }

    @Test
    public void getCountCartItems() {
        String endpoint = "/cocart/v1/count-items";
        Response response = service.sendGetRequest(endpoint);
        response.getBody().print();
    }

    @Test()
    public void getRestoreItemInCartWithParameters() {
        String endpoint = "/cocart/v1/item";
        boolean return_cart = true;
        String key = "013d407166ec4fa56eb1e1f8cbe183b9";
        String parameters = "?cart_item_key=" + key + "&return_cart=" + return_cart + "";
        Response response = service.sendGetRequest(endpoint + parameters);
        response.getBody().prettyPrint();
    }

    @Test()
    public void getRestoreItemInCartByBody() {
        String endpoint = "/cocart/v1/item";
        JSONObject body = new JSONObject();
        body.put("cart_item_key", "013d407166ec4fa56eb1e1f8cbe183b9");
        body.put("return_cart", true);
        Response response = service.sendGetRequest(body.toString(), endpoint);
        response.getBody().prettyPrint();
    }
}
