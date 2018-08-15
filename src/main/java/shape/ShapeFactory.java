package shape;

public class ShapeFactory  {
    private ShapeFactory() {
    }

    private static ShapeFactory shapeFactory = new ShapeFactory();

    public static ShapeFactory createFactory() {
        return shapeFactory;
    }

    public Shape getShape (String shapeType){
        switch (shapeType.toLowerCase()) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
                default:
                    return null;
        }
    }
}
