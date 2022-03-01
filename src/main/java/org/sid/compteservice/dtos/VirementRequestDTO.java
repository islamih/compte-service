package org.sid.compteservice.dtos;

import lombok.Data;

@Data
public class VirementRequestDTO {
	private Long CodeSource;
	private Long CodeDestinsation;
	double montant;


}
