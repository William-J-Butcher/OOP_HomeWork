package HomWork1;

import java.util.List;

public interface VendingMachine {
     Product getProduct(String name) throws IllegalAccessException;
     boolean addProduct(List<Product> productlist);
}
