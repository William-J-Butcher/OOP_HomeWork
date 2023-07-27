package HomWork2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final List<Actor> queue;
    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for ( Actor actor: queue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " cделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for ( Actor actor: queue) {
            if (!actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket();
    }

    @Override
    public void acceptToMarket(Actor actor){
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(){
        for (Actor actor: queue) {
            queue.remove(actor);
            System.out.println(actor.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
        releaseFromMarket();
    }

}
