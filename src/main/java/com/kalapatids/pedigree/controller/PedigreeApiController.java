package com.kalapatids.pedigree.controller;

import java.util.function.BiPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kalapatids.pedigree.model.Pet;
import com.kalapatids.pedigree.service.PedigreeService;

@RestController
public class PedigreeApiController implements PedigreeApi {
	
	@Autowired PedigreeService pedigreeService;
	
    BiPredicate<String, String> isParamEmpty = (x, y) -> {
        return (x!=null && !x.isEmpty())||
        		(y!=null && !y.isEmpty());
    };
	
	@Override
	public ResponseEntity<Pet> getPetInfo(@RequestParam(required = false) String id,
			@RequestParam(required = false) String name) {
		
		HttpStatus httpStatus = HttpStatus.OK;
		Pet pet = null;
		if(!isParamEmpty.test(id, name)) {
			httpStatus = HttpStatus.BAD_REQUEST;
		}else {
			pet = pedigreeService.getPidigree(id, name);
			httpStatus = HttpStatus.OK;
		}
		return new ResponseEntity<>(pet, httpStatus);
	}
}
