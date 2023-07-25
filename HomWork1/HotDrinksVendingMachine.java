package HomWork1;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{
    private List<Product> products;
    public HotDrinksVendingMachine(List<Product> products){
        this.products = products;
    }

    public Product getProduct(String name){
        for (Product product : products){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s е найден.", name));
    }
    public boolean addProduct(List<Product> productlist) {
        if (products == null && productlist == null ){
            return false;
        }
        for (Product item : productlist) {
            products.add(item);
        }
        return true;
    }
}
