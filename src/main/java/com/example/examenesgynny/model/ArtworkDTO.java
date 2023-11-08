package com.example.examenesgynny.model;

import com.example.examenesgynny.validations.ArtworkCodeValidators;

public class ArtworkDTO {
	
	//atributos
	private Integer id;
	private String titulo;
	@ArtworkCodeValidators
	private String descripcion;
	private Integer artistld;
	
	//constructor
	public ArtworkDTO(Integer id, String titulo, String descripcion, Integer artistld) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.artistld = artistld;
	}
	
	//getter y setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getArtistld() {
		return artistld;
	}

	public void setArtistld(Integer artistld) {
		this.artistld = artistld;
	}
	//toString
	@Override
	public String toString() {
		return "ArtworkDTO [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", artistld=" + artistld
				+ "]";
	}
	
	
	
	
	
	
	
}
