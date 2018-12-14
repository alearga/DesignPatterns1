package builder;

public class Bottle implements Packing {//implementation of the packing interface
    @Override
    public String pack() {
        return "Bottle";
    }
}
