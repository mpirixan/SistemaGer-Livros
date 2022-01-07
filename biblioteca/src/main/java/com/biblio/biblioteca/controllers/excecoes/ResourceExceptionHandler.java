package com.biblio.biblioteca.controllers.excecoes;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.biblio.biblioteca.controllers.services.excecoes.BusinessException;
import com.biblio.biblioteca.controllers.services.excecoes.ConstraintSQLException;
import com.biblio.biblioteca.controllers.services.excecoes.DatabaseException;
import com.biblio.biblioteca.controllers.services.excecoes.ResourceNotFoundException;

@ControllerAdvice
	public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)	
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
		

	@ExceptionHandler(DatabaseException.class)	
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
		String error = "Database Error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(BusinessException.class)	
	public ResponseEntity<StandardError> business(BusinessException e, HttpServletRequest request){
		String error = "Erro de negócio";
		HttpStatus status = HttpStatus.ACCEPTED;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(ConstraintSQLException.class)	
	public ResponseEntity<StandardError> business(ConstraintSQLException e, HttpServletRequest request){
		String error = "Erro de Banco de Dados";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	}
