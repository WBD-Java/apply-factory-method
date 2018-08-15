import shape.Shape;
import shape.ShapeFactory;

public class Application {
    public static void main(String[] args) throws Exception{
        ShapeFactory factory = ShapeFactory.createFactory();

        Shape shape = factory.getShape("rectangle");
        Shape shape2 = factory.getShape("square");
        Shape shape3 = factory.getShape("circle");
        Shape shape4 = factory.getShape("triangle");
        try {
            shape.draw();
            shape2.draw();
            shape3.draw();
            shape4.draw();
        } catch (NullPointerException e) {
            System.out.println("We don't have draw this shap type");
        }

    }
}
