package org.mvc.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

public class IndexControllerTester {

	private MockMvc mockMvc;
	private IndexController indexController;
	
	@Before
	public void setup(){
		indexController = new IndexController();
		mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
	}
	
	@Test
	public void testIndex() throws Exception{
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("index"));
	}
}
