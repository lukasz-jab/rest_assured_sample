package utils;

import io.restassured.path.json.JsonPath;
import net.minidev.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JSONRequestBodyHelper {
    public static JSONObject getJSONFromFile(String fileName, String jsonDataKey) {
        JSONObject bodyRequest = new JSONObject();
        try {
            InputStream is = new FileInputStream("src/test/resources/requests/" + fileName + ".json");
            JsonPath jsonPath = JsonPath.from(is);
            bodyRequest.putAll(jsonPath.get(jsonDataKey));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bodyRequest;
    }
}
