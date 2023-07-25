package HomWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>(Arrays.asList(
        new HotDrinks("Еспрессо", 120.0, 70.0, 60),
        new HotDrinks("Американо", 170.0, 70.0, 70),
        new HotDrinks("Латте", 250.0, 200.0, 60)));
        System.out.println(products);
    }
}
