package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rb on 29/05/2021.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
