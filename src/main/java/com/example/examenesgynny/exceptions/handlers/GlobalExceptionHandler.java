package com.example.examenesgynny.exceptions.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.examenesgynny.exceptions.ArtistNotFoundException;
import com.example.examenesgynny.exceptions.CreateArtworkExceptions;



@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ArtistNotFoundException.class )
	public ProblemDetail handleBookNotFoundException(ArtistNotFoundException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Artists Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Artist");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
	@ExceptionHandler( CreateArtworkExceptions.class )
	public ProblemDetail handleReservationConflictException(CreateArtworkExceptions e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
		problemDetail.setTitle("arte Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "arte");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	


}
