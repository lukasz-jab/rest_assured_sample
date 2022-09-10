package cocart.cart.service.test;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class I_ReadValueFromResponse {

    ServiceHelper service = new ServiceHelper();
    String endpoint;

    @Test
    public void readValuesFromResponseByJSONPath() {
        endpoint = "/cocart/v1/calculate";
        JSONObject body = new JSONObject();
        body.put("return", true);
        Response response = service.sendPostRequest(body.toString(), endpoint);
        response.prettyPrint();

        String subtotal = response.getBody().jsonPath().getString("subtotal");
        Double subtotal_tax = response.getBody().jsonPath().getDouble("subtotal_tax");

        Object cart_contents_taxes_object = response.getBody().jsonPath().getMap("cart_contents_taxes").get("1");
        Double cart_contents_taxes = Double.parseDouble(cart_contents_taxes_object.toString());
        System.out.println(cart_contents_taxes + subtotal_tax);

        Map<String, Double> cart_contents_taxes_map = response.getBody().jsonPath().getMap("cart_contents_taxes");
        System.out.println(cart_contents_taxes_map.get("1"));
    }

    @Test
    public void readValesAddItemByJSONObject() {
        endpoint = "/cocart/v1/add-item";
        JSONObject body = new JSONObject();
        body.put( "product_id", 138);
        body.put("quantity", 1);
        body.put("return_cart", false);
        Response response = service.sendPostRequest(body.toString(), endpoint);
        String jsonString = response.getBody().print();

        JSONObject jsonResponse = new JSONObject(jsonString);
        System.out.println(jsonResponse.getString("key"));
        Double total = jsonResponse.getJSONObject("line_tax_data").getJSONObject("total").getDouble("1");
        System.out.println(total);
    }

    @Test
    public void readValesAddItemByJSONObjectKey() {
        endpoint = "/cocart/v1/add-item";
        JSONObject body = new JSONObject();
        body.put( "product_id", 140);
        body.put("quantity", 1);
        body.put("return_cart", true);
        Response response = service.sendPostRequest(body.toString(), endpoint);
        String jsonString = response.getBody().print();

        JSONObject jsonResponse = new JSONObject(jsonString);
        jsonResponse.getJSONObject("1385974ed5904a438616ff7bdb3f7439").getString("key");
    }

    @Test
    public void getCartContentsByMap() {
        String endpoint = "/cocart/v1/get-cart";
        Response response = service.sendGetRequest(endpoint);

        Map<String, Object> products = response.getBody().jsonPath().get();

        for(Map.Entry<String, Object> product : products.entrySet()) {
            //product.getKey();
            Map<String, Object> p = (Map<String, Object>) product.getValue();
            System.out.println(p.get("product_id"));
            System.out.println(p.get("line_tax_data"));

            Map<String, Object> line_tax_data = (Map<String, Object>) p.get("line_tax_data");
            Map<String, Object> total = (Map<String, Object>) line_tax_data.get("total");
            System.out.println(total.get("1"));
        }

    }
}
