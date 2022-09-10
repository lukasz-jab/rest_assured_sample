package cocart.cart.service.test.deserilizing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Total {
    @JsonProperty("1")
    private Double _1;

    public Double get_1() {
        return _1;
    }
}
