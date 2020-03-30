package com.kalapatids.pedigree.dao;

import org.springframework.stereotype.Repository;

import com.kalapatids.pedigree.model.Pet;

@Repository
public interface PedigreeDao {

	public Pet getPetInfo(String id, String name);
}
