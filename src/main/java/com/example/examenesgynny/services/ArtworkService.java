package com.example.examenesgynny.services;

import java.util.ArrayList;

import com.example.examenesgynny.model.ArtworkDTO;

public interface ArtworkService {
	
	ArrayList< ArtworkDTO > getAllArtworks();
	
	void createArtwork(ArtworkDTO artworkDTO);
	
	

}
