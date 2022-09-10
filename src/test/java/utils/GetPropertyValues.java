package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyValues {

    String property;

    public String getPropertyValue(String key) {
        try (InputStream inputStream = new FileInputStream("src/test/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(inputStream);
            property = prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property;
    }
}
