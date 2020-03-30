package com.kalapatids.pedigree.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalapatids.pedigree.db.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, String> {

	public Pet findByPetIdAndName(String id, String name);
}
