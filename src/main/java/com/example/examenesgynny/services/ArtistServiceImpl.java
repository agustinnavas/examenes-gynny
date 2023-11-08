package com.example.examenesgynny.services;

import com.example.examenesgynny.exceptions.ArtistNotFoundException;
import com.example.examenesgynny.model.ArtistDTO;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService{
	
	ArrayList<ArtistDTO> artists = new ArrayList<>();
	ArtistDTO ar = new ArtistDTO(1, "Goya");
	ArtistDTO ar2 = new ArtistDTO(2, "Picasso");
	ArtistDTO ar3 = new ArtistDTO(3, "Dalí");
	ArtistDTO ar4 = new ArtistDTO(4, "Miró");

	public ArtistServiceImpl(){

	artists.add(ar);

	artists.add(ar2);

	artists.add(ar3);

	artists.add(ar4);

	}
	

	public ArtistDTO getArtistById(Integer id) {
	    // Itera a través de la lista de artistas para buscar el que tenga el ID proporcionado
	    for (ArtistDTO artist : artists) {
	        if (artist.getId().equals(id)) {
	            // Si se encuentra un artista con el ID dado, lo retornamos
	            return artist;
	        }
	    }
	    // Si no se encuentra ningún artista con el ID, retornamos null
	    return null;
	}

	
	

}
