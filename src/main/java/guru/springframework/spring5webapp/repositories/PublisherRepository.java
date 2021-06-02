package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rb on 30/05/2021.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
