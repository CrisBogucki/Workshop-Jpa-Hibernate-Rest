package pl.asseco.workshop.asseco.market.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by krzysztof.bogucki on 12 wrz 2017.
 */
@Entity
public class CustomerAddress {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String city;

    private String street;

    private String number;

    private String code;


    public CustomerAddress() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerAddress)) return false;

        CustomerAddress that = (CustomerAddress) o;

        if (!getId().equals(that.getId())) return false;
        if (!getCity().equals(that.getCity())) return false;
        if (!getStreet().equals(that.getStreet())) return false;
        if (!getNumber().equals(that.getNumber())) return false;
        return getCode().equals(that.getCode());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getNumber().hashCode();
        result = 31 * result + getCode().hashCode();
        return result;
    }
}
