package cocart.cart.service.test.deserilizing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LineTaxData {
    @JsonProperty
    public Subtotal subtotal;
    @JsonProperty
    public Total total;

    public Subtotal getSubtotal() {
        return subtotal;
    }

    public Total getTotal() {
        return total;
    }
}