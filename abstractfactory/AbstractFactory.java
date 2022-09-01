package abstractfactory;

public abstract class AbstractFactory {
    abstract ICountry getCountry(String country);
    abstract IColor getColor(String color);
}
