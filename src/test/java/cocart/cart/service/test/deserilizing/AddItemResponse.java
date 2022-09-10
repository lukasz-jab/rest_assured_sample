package cocart.cart.service.test.deserilizing;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
import java.util.ArrayList;

public class AddItemResponse {

    @JsonProperty
    public String key;
    @JsonProperty
    public int product_id;
    @JsonProperty
    public int variation_id;
    @JsonProperty
    public ArrayList<Object> variation;
    @JsonProperty
    public int quantity;
    @JsonProperty
    public String data_hash;
    @JsonProperty
    public LineTaxData line_tax_data;
    @JsonProperty
    public double line_subtotal;
    @JsonProperty
    public double line_subtotal_tax;
    @JsonProperty
    public double line_total;
    @JsonProperty
    public double line_tax;
    @JsonProperty
    public Object data;
    @JsonProperty
    public String product_name;
    @JsonProperty
    public String product_title;
    @JsonProperty
    public String product_price;

    public String getKey() {
        return key;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getVariation_id() {
        return variation_id;
    }

    public ArrayList<Object> getVariation() {
        return variation;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getData_hash() {
        return data_hash;
    }

    public LineTaxData getLine_tax_data() {
        return line_tax_data;
    }

    public double getLine_subtotal() {
        return line_subtotal;
    }

    public double getLine_subtotal_tax() {
        return line_subtotal_tax;
    }

    public double getLine_total() {
        return line_total;
    }

    public double getLine_tax() {
        return line_tax;
    }

    public Object getData() {
        return data;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_title() {
        return product_title;
    }

    public String getProduct_price() {
        return product_price;
    }
}
