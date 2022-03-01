package org.sid.compteservice.web;

import java.util.List;

import org.sid.compteservice.dtos.CompteDTO;
import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.repositories.CompteRepository;
import org.sid.compteservice.service.ISCompte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteRestController {
	@Autowired
	private ISCompte Service;
	
	@GetMapping(path = "/comptes")
	public List<CompteDTO> listCompte(){
		
		return Service.listCompte();
	}
	@GetMapping(path = "/comptes/{id}")
	public Compte getCompte(@PathVariable(name="id") Long code){
		
		return Service.getCompte(code);
	}
	@PostMapping(path = "/comptes")
	public Compte save(@RequestBody Compte compte) {
		return Service.save(compte);
	}
	
	@PutMapping(path = "/comptes/{code}")

	public Compte Update(@PathVariable Long code, @RequestBody Compte compte) {
		compte.setCode(code);
		return Service.save(compte);
	}
	@DeleteMapping(path = "/comptes/{code}")
	public void delete(@PathVariable Long code) {
		Service.delete(code);
	}

//	@Autowired
//	private CompteRepository compteRepository;
//	
//	@GetMapping(path = "/comptes")
//	public List<Compte> listCompte(){
//		
//		return compteRepository.findAll();
//	}
//	@GetMapping(path = "/comptes/{id}")
//	public Compte getCompte(@PathVariable(name="id") Long code){
//		
//		return compteRepository.findById(code).get();
//	}
//	@PostMapping(path = "/comptes")
//	public Compte save(@RequestBody Compte compte) {
//		return compteRepository.save(compte);
//	}
//	
//	@PutMapping(path = "/comptes/{code}")
//
//	public Compte Update(@PathVariable Long code, @RequestBody Compte compte) {
//		compte.setCode(code);
//		return compteRepository.save(compte);
//	}
//	@DeleteMapping(path = "/comptes/{code}")
//	public void delete(@PathVariable Long code) {
//		 compteRepository.deleteById(code);
//	}
}

