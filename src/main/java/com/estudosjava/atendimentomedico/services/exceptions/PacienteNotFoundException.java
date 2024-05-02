package com.estudosjava.atendimentomedico.services.exceptions;

public class PacienteNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public PacienteNotFoundException (String msg) {
		super(msg);
	}

}
