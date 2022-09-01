package abstractfactory;

public class CountryFactory extends AbstractFactory{
    @Override
    ICountry getCountry(String country) {
        if (country == null)
            return null;
        else if (country.equalsIgnoreCase("China"))
            return new China();
        else if (country.equalsIgnoreCase("Canada"))
            return new Canada();
        else if (country.equalsIgnoreCase("England"))
            return new England();
        return null;
    }

    @Override
    IColor getColor(String color) {
        return null;
    }
}
