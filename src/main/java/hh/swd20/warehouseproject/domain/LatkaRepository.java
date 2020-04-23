
package hh.swd20.warehouseproject.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface LatkaRepository extends CrudRepository<Latka, Long> {
	List<Latka> findById(@Param("latkaId") long latkaId);
	List<Latka> findByViivakoodi(@Param("viivakoodi") String viivakoodi);
	List<Latka> findByTuote(@Param("Tuote") Tuote tuote);
	}
