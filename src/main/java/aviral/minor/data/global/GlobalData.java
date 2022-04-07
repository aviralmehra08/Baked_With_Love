package aviral.minor.data.global;
import java.util.ArrayList;
import java.util.List;
import aviral.minor.data.model.Product;
public class GlobalData {
    public static List<Product> cart;
    static
    {
        cart = new ArrayList<Product>();
    }
}
