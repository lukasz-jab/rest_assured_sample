package cocart.cart.service.test;

import cocart.cart.service.test.serilizing.AddItemToCartPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.GetPropertyValues;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ServiceHelper {

    GetPropertyValues getPropertyValues = new GetPropertyValues();

    private final String LOGIN = getPropertyValues.getPropertyValue("login");
    private  final String PASSWORD = getPropertyValues.getPropertyValue("password");
    private final String BASE_URI = getPropertyValues.getPropertyValue("shopServerURL");
    private final SampleRest SAMPLE_REST = new SampleRest();

    public Response sendGetRequest(String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .baseUri(BASE_URI)
                .get(endpoint);
        return SAMPLE_REST.response;
    }

    public Response sendGetRequest(String body, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .get(endpoint);
        return SAMPLE_REST.response;
    }

    public Response sendPostRequest(Map<String, Object> queryParams, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParams(queryParams)
                .baseUri(BASE_URI)
                .post(endpoint);
        return SAMPLE_REST.response;
    }

    public Response sendPostRequest(String body, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                //.header("Content-Type", "application/json")
                //.contentType("application/json")
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .post(endpoint);
        return SAMPLE_REST.response;
    }

    public Response sendPostRequest(AddItemToCartPOJO body, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                //.header("Content-Type", "application/json")
                //.contentType("application/json")
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .post(endpoint);
        return SAMPLE_REST.response;
    }

    public void addItem(int product_id, int quantity, boolean return_cart, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParam("product_id", product_id)
                .queryParam("quantity", quantity)
                .queryParam("return_cart", return_cart)
                .baseUri(BASE_URI)
                .post(endpoint);
    }

    public Response sendDeleteRequest(String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .baseUri(BASE_URI)
                .delete(endpoint);
        return SAMPLE_REST.response;
    }

    public Response sendDeleteRequest(String body, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .delete(endpoint);
        return SAMPLE_REST.response;
    }
}//

class SampleRest {
    public Response response;
}