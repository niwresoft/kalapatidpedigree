package com.kalapatids.pedigree.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;

import com.kalapatids.pedigree.dao.repository.PetRepository;
import com.kalapatids.pedigree.db.model.Pet;
import com.kalapatids.pedigree.mapper.PetToPetMapper;

@Repository
public class PedigreeDaoImpl implements PedigreeDao {
	
	@Autowired
	PetRepository petRepo;

	@Override
	public com.kalapatids.pedigree.model.Pet getPetInfo(String id, String name) {

		Pet pet = new Pet();
		pet = Optional.of(petRepo.findByPetIdAndName(id, name)).orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
		com.kalapatids.pedigree.model.Pet petRes = new com.kalapatids.pedigree.model.Pet();
		
		//Map to model
		PetToPetMapper petDbToModelMapper = new PetToPetMapper();
		petRes = petDbToModelMapper.map(pet);

		return petRes;
	}

}
