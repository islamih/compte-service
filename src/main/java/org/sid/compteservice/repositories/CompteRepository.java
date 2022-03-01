package org.sid.compteservice.repositories;

//import java.util.List;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


//@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long>{

//	@RestResource(path = "/bytype")
//	List<Compte> findByType(@Param(value ="type") TypeCompte typeCompte);

	
}
