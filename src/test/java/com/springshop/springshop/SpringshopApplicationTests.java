package com.springshop.springshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class SpringshopApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void listsInMemoryProducts() throws Exception {
		mockMvc.perform(get("/productos"))
				.andExpect(status().isOk())
				.andExpect(view().name("productos/lista"))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Camiseta Spring")))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Taza Java")))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Mochila Developer")));
	}

	@Test
	void listsProductsAtHome() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("productos/lista"));
	}
}
