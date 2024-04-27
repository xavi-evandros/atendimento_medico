package com.estudosjava.atendimentomedico.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudosjava.atendimentomedico.entities.Paciente;
import com.estudosjava.atendimentomedico.repositories.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository respository;
	
	public List<Paciente> findAll() {
		return respository.findAll();
	}
	
	public Paciente findById(Long id) {
		Optional<Paciente> paciente = respository.findById(id);
		return paciente.get();
	}
	
}
