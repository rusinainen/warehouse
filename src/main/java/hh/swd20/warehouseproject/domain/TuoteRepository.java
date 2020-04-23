package hh.swd20.warehouseproject.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface TuoteRepository extends CrudRepository<Tuote, Long> {
	List<Tuote> findById(@Param("id") long id);
	List<Tuote> findByNimi(@Param("nimi") String nimi);
	}
