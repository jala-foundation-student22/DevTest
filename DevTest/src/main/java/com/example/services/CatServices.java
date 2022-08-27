package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Cat;
import com.example.repository.CatRepository;

@Service

public class CatServices {
	
	
	@Autowired
	private CatRepository repo;
	
	public List<Cat> findAll(){
		
		return repo.findAll();
		
		
	}


}
