package org.sid.compteservice.service;

import java.util.List;

import org.sid.compteservice.dtos.CompteDTO;
import org.sid.compteservice.entities.Compte;

public interface ISCompte {
	  
	    public List<CompteDTO> listCompte();
	     
	    public Compte save(Compte compte) ;
	     
	    public Compte getCompte(Long id) ;
	     
	    public void delete(Long id);
	    
	    public Compte Update(Compte compte) ;
	    
}
