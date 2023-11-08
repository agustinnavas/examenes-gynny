package com.example.examenesgynny.model;

public class ArtistDTO {
	
	//atributo
	private Integer id;
	private String name;
	
	//constructor
	public ArtistDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//getter y setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//to string
	@Override
	public String toString() {
		return "ArtistDTO [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
