package pl.asseco.workshop.asseco.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asseco.workshop.asseco.market.model.Document;

/**
 * Created by krzysztof.bogucki on 11 wrz 2017.
 */
public interface DocumentRepository extends JpaRepository<Document, Long> {


}
