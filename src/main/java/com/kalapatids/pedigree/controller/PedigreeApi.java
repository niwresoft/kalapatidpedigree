package com.kalapatids.pedigree.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kalapatids.pedigree.model.Pet;

@RequestMapping(value="/kalapatids/pedigree/v1")
@Validated
public interface PedigreeApi {
	
	@GetMapping(value="/petinfo", 
			produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	ResponseEntity<Pet> getPetInfo (@RequestParam(required = false) String id,
			@RequestParam(required = false) String name);
	
}
