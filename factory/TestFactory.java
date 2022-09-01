package factory;

public class TestFactory {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape shape1 = factory.getShape("circle");
        shape1.draw();

        IShape shape2 = factory.getShape("Rectangle");
        shape2.draw();

        IShape shape3 = factory.getShape("Square");
        shape3.draw();
    }
}
