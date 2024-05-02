package com.estudosjava.atendimentomedico.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudosjava.atendimentomedico.entities.Paciente;
import com.estudosjava.atendimentomedico.repositories.PacienteRepository;
import com.estudosjava.atendimentomedico.services.exceptions.PacienteNotFoundException;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository repository;
	
	public List<Paciente> findAll() {
		return repository.findAll();
	}
	
	public Paciente findById(Long id) {
		Optional<Paciente> paciente = repository.findById(id);
		return paciente.orElseThrow(()-> 
		new PacienteNotFoundException("Paciente não encontrado para o id informado."));
	}
	
	public Paciente insert (Paciente paciente) {
		return repository.save(paciente);
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Paciente update (Long id, Paciente paciente) {
		Paciente pac = repository.getReferenceById(id);
		updateData(pac, paciente);
		return repository.save(pac);
		
	}

	private void updateData(Paciente pac, Paciente paciente) {
		pac.setMatricula(paciente.getMatricula());
		pac.setName(paciente.getName());
		
	}
}
