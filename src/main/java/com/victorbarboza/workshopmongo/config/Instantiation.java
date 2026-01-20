package com.victorbarboza.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.victorbarboza.workshopmongo.domain.User;
import com.victorbarboza.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();	
		
		User luiz = new User(null, "Luiz Felipe", "luiz@gmail.com"); 
		User alex = new User(null, "Alex Santos", "alex@gmail.com"); 
		User henrique = new User(null, "Henrique Silva", "henrique@gmail.com"); 
		
		userRepository.saveAll(Arrays.asList(luiz, alex, henrique));
	}

}
