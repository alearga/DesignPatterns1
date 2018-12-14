package prototype;

public abstract class Shape implements Cloneable{//https://www.javacodegeeks.com/2018/03/understanding-cloneable-interface-in-java.html
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone(){
        //https://www.geeksforgeeks.org/clone-method-in-java-2/
        //https://www.javatpoint.com/object-cloning
        //https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
        //https://dzone.com/articles/java-cloning-with-example
        //https://www.baeldung.com/java-deep-copy
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
