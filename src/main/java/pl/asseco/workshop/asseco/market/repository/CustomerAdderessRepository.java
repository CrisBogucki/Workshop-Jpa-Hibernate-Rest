package pl.asseco.workshop.asseco.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asseco.workshop.asseco.market.model.CustomerAddress;

/**
 * Created by krzysztof.bogucki on 12 wrz 2017.
 */
public interface CustomerAdderessRepository extends JpaRepository<CustomerAddress, Long> {



}
