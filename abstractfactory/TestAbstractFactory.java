package abstractfactory;

public class TestAbstractFactory{

    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();
        IColor red = colorFactory.getColor("red");
        red.fill();

        IColor green = colorFactory.getColor("green");
        green.fill();

        CountryFactory countryFactory = new CountryFactory();
        ICountry country = countryFactory.getCountry("China");
        country.printCountryName();

        ICountry england = countryFactory.getCountry("England");
        england.printCountryName();

        ICountry canada = countryFactory.getCountry("Canada");
        canada.printCountryName();
    }
}
