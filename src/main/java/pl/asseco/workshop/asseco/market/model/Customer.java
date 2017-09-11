package pl.asseco.workshop.asseco.market.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by krzysztof.bogucki on 5 wrz 2017.
 */
@Entity
public class Customer {

    private static final long serialVersionUID = 1L;

    public Customer() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    private String nip;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!getId().equals(customer.getId())) return false;
        if (!getFirstName().equals(customer.getFirstName())) return false;
        if (!getLastName().equals(customer.getLastName())) return false;
        return getNip().equals(customer.getNip());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getNip().hashCode();
        return result;
    }
}
