package HomWork1;
// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
public class HotDrinks extends Product {
    private Double volume;
    private Integer temperature;

    public HotDrinks(String name, Double cost, Double volume, Integer temperature){
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }
    public Double getVolume(){
        return volume;
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }
    public Integer getTemperature(){
        return temperature;
    }
    public void setTemperature(Integer temperature){
        this.temperature = temperature;
    }
    public String toString(){
        return "HotDrinks{" +
                "name = '" + super.getName() + '\'' +
                "cost = '" + super.getCost() + '\'' +
                "volume = '" + this.volume + '\'' +
                "temperature = " + this.temperature + '}';
    }
}
