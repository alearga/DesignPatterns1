package builder;

public abstract class Burger implements Item {//provides functions
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
