package prototype;

import java.util.Hashtable;

public class ShapeCache {//class to get concrete classes from database and store them in a Hashtable.

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape shapeCached = shapeMap.get(shapeId);
        return (Shape) shapeCached.clone();
    }

    public static void loadCache(){//put object into cache
        Circle circle = new Circle();//create new object
        circle.setId("1");//set it to 1
        shapeMap.put(circle.getId(), circle);//place it in storage

        Rectangle rect = new Rectangle();
        rect.setId("2");
        shapeMap.put(rect.getId(), rect);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
