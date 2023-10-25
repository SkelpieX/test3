import java.util.ArrayList;
import java.util.List;

//Class Cash Register

public class CashRegister {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product scanProduct(String upcCode) {
        for (Product product : products) {
            if (product.getUpcCode().equals(upcCode)) {
                return product;
            }
        }
        return null;
    }
}


