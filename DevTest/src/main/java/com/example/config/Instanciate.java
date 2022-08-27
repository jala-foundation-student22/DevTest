package com.example.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.domain.Cat;
import com.example.repository.CatRepository;

@Configuration
	public class Instanciate implements CommandLineRunner {
		
		
		@Autowired
		private CatRepository userrepository;
		
		@Override
		public void run(String...arg0) throws Exception {
			
			userrepository.deleteAll();
			Cat maria = new Cat(null, "fluffy", "fat");
			Cat alex = new Cat(null, "bottoms", "skinny");
			
			
			userrepository.saveAll(Arrays.asList(maria, alex));
		}
		
	
	}
