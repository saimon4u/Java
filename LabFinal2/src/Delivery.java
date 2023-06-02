public class Delivery implements RoutePlanner{
    public RoutePlanner routePlanner;
    public Delivery(Order order){
        deliver(order);
    }

    @Override
    public void calculateRoute(String address1, String address2) {
        System.out.println("This is the shortest distance!");
    }
    public void deliver(Order order){
        calculateRoute(order.seller.address,order.buyer.address);
        double totalPrice = 0.0;
        for(Fruit fruit : order.getList()){
            fruit.setTotalQuantityKg(fruit.getTotalQuantityKg()-order.quantityInKg);
            totalPrice += (fruit.getPricePerKg() * order.quantityInKg);
        }
        order.buyer.setRewards(order.buyer.getRewards()+(totalPrice*0.01));
//        order.fruit.setTotalQuantityKg(order.fruit.getTotalQuantityKg() - order.quantityInKg);
//        order.buyer.setRewards(order.buyer.getRewards() +(order.fruit.getPricePerKg() * order.quantityInKg * 0.01));
    }
}
