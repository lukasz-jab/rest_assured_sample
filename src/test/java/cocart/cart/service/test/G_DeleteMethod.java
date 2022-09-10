package cocart.cart.service.test;

import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.junit.Test;

import static utils.JSONRequestBodyHelper.getJSONFromFile;

public class G_DeleteMethod {

    ServiceHelper service = new ServiceHelper();

    @Test
    public void deleteItemFromCartWithParameters() {
        String endpoint = "/cocart/v1/item";
        String productKey = "013d407166ec4fa56eb1e1f8cbe183b9";
        boolean return_cart = true;
        Response response = service.sendDeleteRequest(endpoint + "?cart_item_key=" + productKey + "&return_cart=" + return_cart);
        response.asPrettyString();
    }

    @Test
    public void deleteItemFromCartByFile() {
        String endpoint = "/cocart/v1/item";
        JSONObject body = getJSONFromFile("items", "pencil");
        Response response = service.sendDeleteRequest(body.toString(), endpoint);
    }
}
