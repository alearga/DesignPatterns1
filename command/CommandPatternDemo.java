package command;

public class CommandPatternDemo {
    public static void main(String[] args){

        Stock aStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(aStock);
        SellStock sellStockOrder = new SellStock(aStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

    }
}
