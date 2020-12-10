package pl.pozadr.datauiapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pozadr.datauiapp.models.Sail;

@Repository
public interface SailRepository extends CrudRepository<Sail, Integer> {
}
