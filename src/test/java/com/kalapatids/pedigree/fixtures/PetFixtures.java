package com.kalapatids.pedigree.fixtures;

import com.kalapatids.pedigree.model.Pet;

public class PetFixtures {

	public static Pet getPetInfo() {

		Pet pet = new Pet();
		pet.setDam("PHA-003");
		pet.setDateOfBirth("01/01/2020");
		pet.setGender("Cock");
		pet.setId("PHA-001");
		pet.setName("Astig");
		pet.setRemarks("Balance");		
		pet.setSire("PHA-002");
		return pet;
	}

}
