package cocart.cart.service.test;

import io.restassured.config.RestAssuredConfig;
import org.junit.Test;

import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class RS {

    @Test
    public void testRestAssured() {
        assertThat(RestAssured.config(), instanceOf(RestAssuredConfig.class));
    }
}
