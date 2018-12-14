package flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();//a list

    public static Shape getCircle(String color) {//to create circles based on a color
        Circle circle = (Circle)circleMap.get(color);//checking if the key 'color = eg. Red' is in hashmap
        System.out.println("random color : " + color);

        if(circle == null) { // if not in hash make new circle with color
            circle = new Circle(color);
            circleMap.put(color, circle); // put it in the hashmap
            System.out.println("Created circle of color : " + color);
        }else{
            System.out.println("Coloured Circle already in hashmap");
        }

        System.out.println(circleMap);
        return circle;
    }
}
