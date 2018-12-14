package builder;

public interface Item {//related to item name, type of packing and price of item; implemented in different classes
    public String name();//method
    public Packing packing();//this relates to the Packing interface
    public float price();//method
}
