package com.example.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cats")


public class Cat implements Serializable{
	
   
	private static final long serialVersionUID=1l;
	private String id;
	private String name;
	private String description;
	
	public Cat () {}

	

	public Cat(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}


//Create an API that supports all of the following endpoints. The response should be
//mocked, i.e. Database persistence is not required at this point.
//1. List all cats
//2. Get a cat by id
//3. Create a new cat
