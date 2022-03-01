package org.sid.compteservice.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.sid.compteservice.dtos.CompteDTO;
import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional

public  class SCompte implements ISCompte {
	
	@Autowired
	private CompteRepository repo;
	
	@Autowired
	ModelMapper mapper;
	Compte compte;
	
	public List<CompteDTO> listCompte() {
		List<Compte> L1=repo.findAll();
		List<CompteDTO>l2=L1.stream().map( x-> mapper.map(x,CompteDTO.class)).collect(Collectors.toList());
		
		
		return l2;
	}                            

	@Override
	public Compte save(Compte compte) {
		return repo.save(compte);
	}

	@Override
	public Compte getCompte(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Compte Update(Compte compte) {
		return repo.save(compte);
	}

}
