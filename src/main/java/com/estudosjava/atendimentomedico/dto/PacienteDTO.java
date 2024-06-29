package com.estudosjava.atendimentomedico.dto;

import java.io.Serializable;

import com.estudosjava.atendimentomedico.entities.Paciente;

public class PacienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String matricula;
	private String name;

	public PacienteDTO() {

	}

	public PacienteDTO(Paciente pac) {
		this.id = pac.getId();
		this.matricula = pac.getMatricula();
		this.name = pac.getName();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
