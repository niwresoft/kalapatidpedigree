package com.kalapatids.pedigree.service;

import org.springframework.stereotype.Service;

import com.kalapatids.pedigree.model.Pet;

@Service
public interface PedigreeService {

	public Pet getPidigree(String id, String name);
}
