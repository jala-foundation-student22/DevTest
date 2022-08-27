package com.example.DTO;

import java.io.Serializable;

import com.example.domain.Cat;

public class CatDataTransferObject implements Serializable {

	

		
	    private static final long serialVersionUID = 1L;
		private String id;
		private String name;
		private String description;

		public CatDataTransferObject() {

		}

		public CatDataTransferObject(Cat obj)
		{
			id = obj.getId();
			name = obj.getName();
			description = obj.getDescription();
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

		public String getEmail() {
			return description;
		}

		public void setEmail(String description) {
			this.description = description;
		}

	}


