package abstractfactory;

public class ColorFactory extends AbstractFactory{
    @Override
    ICountry getCountry(String country) {
        return null;
    }

    @Override
    IColor getColor(String color) {
        if (color == null)
            return null;
        else if (color.equalsIgnoreCase("Red"))
            return new Red();
        else if (color.equalsIgnoreCase("Green"))
            return new Green();
        return null;
    }
}
