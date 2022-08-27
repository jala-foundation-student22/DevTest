package com.example.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cat;

	
	//old responsebody
	@RestController
	// endpoint
	@RequestMapping (value="/cats")
	public class CatResources {
		
		@Autowired
		private CatService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Cat>> findALL(){
	List<User> list = service.findAll();
	return ResponseEntity.ok().body(list);
		
		
		
	}
}
