package builder;

public abstract class ColdDrink implements Item{//provides functions
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
