package hh.swd20.warehouseproject.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource 
public interface PaikkaRepository extends CrudRepository<Paikka, Long> {
	List<Paikka> findById(@Param("paikkaId") long paikkaId );
	List<Paikka> findByNumero(@Param("numero") String numero );

	}
