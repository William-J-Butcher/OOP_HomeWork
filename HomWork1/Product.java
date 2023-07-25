package HomWork1;

public class Product {

    private String name;
    private Double cost;
    public Product(String name, Double cost){
        setName(name);
        this.cost = cost;
    }

    public String getName(){
        return name;
    }
    public Double getCost(){
        return cost;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setCost(Double cost){
        this.cost = cost;
    }

    public String toString(){
        return "Product{" +
                "name = " + name + '\'' +
                ", cost = " + cost +
                '}';
    }
}
