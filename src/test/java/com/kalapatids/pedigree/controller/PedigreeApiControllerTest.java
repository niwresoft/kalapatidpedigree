package com.kalapatids.pedigree.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.kalapatids.pedigree.fixtures.PetFixtures;
import com.kalapatids.pedigree.service.PedigreeService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PedigreeApiControllerTest {

	@MockBean
	PedigreeService pedigreeservce;
	
	@Autowired
	MockMvc mockmvc;
	
	String petInfoRequest;
	String endpoint = "/kalapatids/pedigree/v1/petinfo?id=PHA-001&name=";
	
	@Before
	public void setUp() {
		petInfoRequest = "{  \"id\": \"PHA-1003\",  \"gender\": \"Cock\",  \"sire\": \"PHA-1001\",  \"dam\": \"PHA-1002\",  \"dateOfBirth\": \"March 19, 2020\",  \"remarks\": \"Good Pedigree\"}";
	}
	
	@Test
	public void testGetPet() throws Exception {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		httpHeaders.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		
		Mockito.when(pedigreeservce.getPidigree(ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(PetFixtures.getPetInfo());
		mockmvc.perform(get(endpoint).content(petInfoRequest).headers(httpHeaders)).andExpect(status().isOk());
	}
}
