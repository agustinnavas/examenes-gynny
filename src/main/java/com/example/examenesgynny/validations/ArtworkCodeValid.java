package com.example.examenesgynny.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ArtworkCodeValid implements ConstraintValidator<ArtworkCodeValidators, String>{

	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if (value == null || value.trim().isEmpty()) {
            return false;
        }

   String[] palabras = value.trim().split("\\s+");
   return palabras.length >= 5;


		
		
	}

}
