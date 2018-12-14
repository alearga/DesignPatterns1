package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {//Creates a Meal class having Item objects defined in the otehr classes
    private List<Item> itemList = new ArrayList<Item>();//make of list of items

    public void addItem(Item item){//method to add to the list of items
        itemList.add(item);
    }

    public float getCost(){//method to add the cost of individual items to the bill
        float cost = 0.0f;//initial value of bill

        for (Item item : itemList){//for loop to add the cost of selected items
            cost+=item.price();
        }
        return cost;
    }

    public void showItems(){//method to present the list of selected items and the bill

        for(Item item : itemList){
            System.out.println("Item: " + item.name());
            System.out.println(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
