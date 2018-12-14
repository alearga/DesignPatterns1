package singleton;

public class SinglePatternDemo {
    public static void main(String[] args){//used for logger
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
