package builder;

public class Coke extends ColdDrink {//concrete implementation of  the ColdDrink abstract class
    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
