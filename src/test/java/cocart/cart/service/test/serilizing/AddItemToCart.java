package cocart.cart.service.test.serilizing;

public class AddItemToCart {
    private Integer product_id;
    private Integer quantity;
    private boolean returnCart;


    public AddItemToCart(Integer product_id, Integer quantity, boolean returnCart) {
        this.product_id = product_id;
        this.quantity = quantity;
        this.returnCart = returnCart;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public AddItemToCart withProduct_id(Integer product_id) {
        this.product_id = product_id;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public AddItemToCart withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public boolean isReturnCart() {
        return returnCart;
    }

    public AddItemToCart withReturnCart(boolean returnCart) {
        this.returnCart = returnCart;
        return this;
    }
}
