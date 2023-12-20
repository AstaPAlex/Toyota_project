package factory.exeption;

import factory.AssemblyLine;
import factory.Country;

public class CountyFactoryNotEqualException extends Exception {
    public CountyFactoryNotEqualException(Country countryFabric, Country countryAssemblyLine) {
        super("Страна Конвеера: " + countryAssemblyLine
                + ", не совпадает со страной фабрики: " + countryFabric);
    }
}
