package factory;

public enum Country {
    RUSSIAN("Россия"), USA("США"), GERMANY("Германия"), CHINA("Китай"), JAPAN("Япония");

    private final String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
