package com.example.controleponto;

import java.util.ArrayList;

import com.example.controleponto.model.Role;
import com.example.controleponto.model.User;
import com.example.controleponto.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	/**
	 * Popula as tabelas
	 * 
	 * @param userService
	 */
	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "SUPER_ADMIN", new ArrayList<>()));
			userService.saveRole(new Role(null, "ADMIN", new ArrayList<>()));
			userService.saveRole(new Role(null, "MANAGER", new ArrayList<>()));
			userService.saveRole(new Role(null, "USER", new ArrayList<>()));
			
			userService.saveUser(new User(null, "admin", "admin", "1234", new ArrayList<>()));
			userService.addRoleToUser("admin", "SUPER_ADMIN");
			
			userService.saveUser(new User(null, "Claudio Robin", "ClaudioRobin", "1234", new ArrayList<>()));
			userService.addRoleToUser("ClaudioRobin", "ADMIN");
			userService.addRoleToUser("ClaudioRobin", "MANAGER");
			userService.addRoleToUser("ClaudioRobin", "USER");

			userService.saveUser(new User(null, "John Doe", "JohnDoe", "1234", new ArrayList<>()));
			userService.addRoleToUser("JohnDoe", "MANAGER");

			userService.saveUser(new User(null, "Jane Doe", "JaneDoe", "1234", new ArrayList<>()));
			userService.addRoleToUser("JaneDoe", "USER");
		};
	}

}
