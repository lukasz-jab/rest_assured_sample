package cocart.cart.service.test;

import net.minidev.json.JSONObject;
import org.junit.Test;

import static utils.JSONRequestBodyHelper.getJSONFromFile;

public class E_PostMethodBodyFromFile {

    ServiceHelper service = new ServiceHelper();

    @Test
    public void addItemByJSONFile() {
        String endpoint = "/cocart/v1/add-item";
        JSONObject body = getJSONFromFile("cocart_add_item_to_cart", "add_item_body");
        service.sendPostRequest(body.toString(), endpoint);
    }
}
