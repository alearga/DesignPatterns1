package builder;

public class ChickenBurger extends Burger {//concrete implementation of  the Burger abstract class
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
