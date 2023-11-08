package com.example.examenesgynny.services;

import java.util.ArrayList;

import com.example.examenesgynny.exceptions.createArtwork;
import com.example.examenesgynny.model.ArtworkDTO;

public class ArtworkServiceImpl implements ArtworkService {
	
	ArrayList<ArtworkDTO> obras = new ArrayList<>();
	ArtworkDTO ar = new ArtworkDTO(1, "Titulo1", "hola soy la descripción uno", 1);
	ArtworkDTO ar2 = new ArtworkDTO(2, "Titulo2", "hola soy la descripción dos", 2);
	ArtworkDTO ar3 = new ArtworkDTO(3, "Titulo3", "hola soy la descripción tres", 1);
	ArtworkDTO ar4 = new ArtworkDTO(4,"Titulo4", "hola soy la descripción cuatro",3);

	public ArtworkServiceImpl() {

	obras.add(ar);
	obras.add(ar2);
	obras.add(ar3);
	obras.add(ar4);

	}

	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		return obras;
	}

	@Override
	public void createArtwork(ArtworkDTO artworkDTO) {
		obras.add(artworkDTO);
		
		throw new createArtwork("el arte no se encuentra la obra de arte " );
	}			

}
