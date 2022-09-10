package cocart.cart.service.test.serilizing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItemToCartPOJO {

    @JsonProperty
    private Integer product_id;

    @JsonProperty
    private Integer quantity;

    @JsonProperty
    private boolean return_cart;

    public AddItemToCartPOJO(Integer product_id, Integer quantity, boolean return_cart) {
        this.product_id =product_id;
        this.quantity = quantity;
        this.return_cart = return_cart;
    }
}
