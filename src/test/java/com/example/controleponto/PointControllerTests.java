package com.example.controleponto;

import com.example.controleponto.controller.PointController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import net.minidev.json.JSONObject;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PointControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void add() throws Exception {
		JSONObject jsonRequest = new JSONObject();
		jsonRequest.put("dateTime", "2021-12-18 13:12");
		jsonRequest.put("note", "Início do expediente");
		jsonRequest.put("isEntry", true);

		JSONObject jsonResponse = new JSONObject();
		jsonResponse.put("id", 1);
		jsonResponse.putAll(jsonRequest);

		mvc.perform(post(PointController.URL)
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(jsonRequest.toJSONString()))
				.andExpect(status().isCreated())
				.andExpect(content().json(jsonResponse.toJSONString()));
	}

}
