package pl.asseco.workshop.asseco.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asseco.workshop.asseco.market.model.Customer;

import java.math.BigInteger;

/**
 * Created by krzysztof.bogucki on 11 wrz 2017.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByFirstName(String FirstName);
    Customer findByNip(String nip);

}
