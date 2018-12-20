package com.example.springboot.rabbit.demo;

import java.io.Serializable;

public class SimpleMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1297405765823906781L;
	String name;
	String description;

	public SimpleMessage() {
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


}
