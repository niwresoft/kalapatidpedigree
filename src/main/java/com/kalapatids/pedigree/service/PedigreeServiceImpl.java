package com.kalapatids.pedigree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalapatids.pedigree.dao.PedigreeDao;
import com.kalapatids.pedigree.model.Pet;

@Service
public class PedigreeServiceImpl implements PedigreeService {
	
	@Autowired PedigreeDao pedigreeDao;

	@Override
	public Pet getPidigree(String id, String name) {
		return pedigreeDao.getPetInfo(id, name);
	}

	
}
