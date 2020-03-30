package com.kalapatids.pedigree.mapper;

import org.springframework.util.StringUtils;

import com.kalapatids.pedigree.model.Pet;

public class PetToPetMapper {
	
	public Pet map(com.kalapatids.pedigree.db.model.Pet source) {
		
		Pet pet = new Pet();
		pet.setDam(StringUtils.trimWhitespace(source.getDamId()));
		pet.setDateOfBirth(StringUtils.trimWhitespace(source.getDob().toString()));
		pet.setGender(StringUtils.trimWhitespace(source.getGender()));
		pet.setId(StringUtils.trimWhitespace(source.getPetId()));
		pet.setName(StringUtils.trimWhitespace(source.getName()));
		pet.setRemarks(StringUtils.trimWhitespace(source.getRemarks()));		
		pet.setSire(source.getSireId());
		
		return pet;
		
	}

}
