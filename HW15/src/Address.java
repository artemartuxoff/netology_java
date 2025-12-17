import java.util.Objects;

public class Address {

    protected String country;
    protected String city;

    public Address(String country, String city) {

        this.country = country;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {

        if (country.equals(this.country) && city.equals(this.city)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }
}
