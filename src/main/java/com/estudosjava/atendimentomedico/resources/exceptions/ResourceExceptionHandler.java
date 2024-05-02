package com.estudosjava.atendimentomedico.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.estudosjava.atendimentomedico.services.exceptions.PacienteNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(PacienteNotFoundException.class)
	public ResponseEntity<StandardError> pacienteNotFound (PacienteNotFoundException e, HttpServletRequest request) {
		StandardError standError = new StandardError();
		standError.setTimestamp(Instant.now());
		standError.setStatus(HttpStatus.NOT_FOUND.value());
		standError.setError("Id incorreto ou não encontrado");
		standError.setMessage(e.getMessage());
		standError.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standError);
		
	}
	
}
