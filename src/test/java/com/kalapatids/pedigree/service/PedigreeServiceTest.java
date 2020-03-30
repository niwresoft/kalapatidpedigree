package com.kalapatids.pedigree.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.kalapatids.pedigree.dao.PedigreeDao;
import com.kalapatids.pedigree.fixtures.PetFixtures;
import com.kalapatids.pedigree.model.Pet;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class PedigreeServiceTest {
	
	@Mock
	PedigreeDao pedigreeDao;
	
	@InjectMocks
	PedigreeServiceImpl pedigreeService;
	
	@Test
	public void testGetPetInfo() {
		Mockito.when(pedigreeDao.getPetInfo(ArgumentMatchers.anyString(), ArgumentMatchers.anyString()))
		.thenReturn(PetFixtures.getPetInfo());
		Pet pet = new Pet();
		pet = pedigreeService.getPidigree("PHA-001", "Brusko");
		assertThat(pet).isNotNull();
		assertEquals("PHA-001", pet.getId());
	}

}
