package com.example.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cat;

	
	//old responsebody
	@RestController
	// endpoint
	@RequestMapping (value = "/cats")
	public class CatResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Cat> findALL(){
	
	Cat fluffy = new Cat ("1" , "Fluffy");
	Cat bottoms = new Cat ("2" , "Bottoms");
	List<Cat> list = new ArrayList<>();
	list.addAll(Arrays.asList(fluffy, bottoms));
	return list;
	
	}
}
