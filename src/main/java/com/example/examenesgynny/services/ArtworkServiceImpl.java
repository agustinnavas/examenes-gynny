package com.example.examenesgynny.services;

import java.util.ArrayList;

import com.example.examenesgynny.exceptions.CreateArtworkExceptions;
import com.example.examenesgynny.model.ArtworkDTO;

import org.springframework.stereotype.Service;

@Service
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
	    // Obtenemos el título y la descripción de la obra de arte desde el objeto ArtworkDTO
	    String title = artworkDTO.getTitulo();
	    String description = artworkDTO.getDescripcion();

	    // Verificamos si tanto el título como la descripción son válidos
	    if (isInputValid(title) && isInputValid(description)) {
	        // Si ambos son válidos, agregamos la obra de arte a la lista de obras
	        obras.add(artworkDTO);
	    } else {
	        // Si alguno de los campos no es válido, lanzamos una excepción con un mensaje de error
	        throw new CreateArtworkExceptions("El arte no se ha creado: el título y la descripción deben contener al menos 5 palabras.");
	    }
	}

	// Función para validar una cadena de texto
	private boolean isInputValid(String input) {
	    // Verificamos si la cadena es nula o está vacía
	    if (input == null || input.trim().isEmpty()) {//el imput.trip elimina los espacios
	        return false;
	    }

	    // Dividimos la cadena en palabras y verificamos si hay al menos 5 palabras
	    String[] palabras = input.trim().split("\\s+");//.split divide la cadena 
	    return palabras.length >= 5;
	}

}
