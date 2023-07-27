package HomWork2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Пётр");
        Human human2 = new Human("Мария");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
