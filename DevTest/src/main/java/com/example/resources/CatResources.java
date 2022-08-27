package com.example.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cat;
import com.example.services.CatServices;

	
	//old responsebody
	@RestController
	// endpoint
	@RequestMapping(value = "/cats")
	public class CatResources {
		
		@Autowired
		private CatServices service;
	
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<Cat>> findALL(){
		List<Cat> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
		
		
	}
}
