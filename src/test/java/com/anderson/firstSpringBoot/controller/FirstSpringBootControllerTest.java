package com.anderson.firstSpringBoot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstSpringBootControllerTest {

	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() throws Exception {
		
		this.mockMvc.perform(MockMvcRequestBuilders.get("/salarios")).
		andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.redirectedUrl(""));
	}

}
