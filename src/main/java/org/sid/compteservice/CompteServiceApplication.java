package org.sid.compteservice;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.TypeCompte;
import org.sid.compteservice.repositories.CompteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CompteServiceApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CompteServiceApplication.class, args);

	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args->{
			compteRepository.save(new Compte(null,9999,new Date(),TypeCompte.COURANT));
			compteRepository.save(new Compte(null,7888,new Date(),TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null,2299,new Date(),TypeCompte.COURANT));
			
		compteRepository.findAll().forEach(cp->{
			System.out.println(cp.getType());
			System.out.println(cp.getSolde());
			System.out.println("test git hhcjtcu");
		});
		
				
	};
	
	
}
}
