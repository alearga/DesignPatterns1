package builder;

public class VegBurger extends Burger {//concrete implementation of  the Burger abstract class
    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
