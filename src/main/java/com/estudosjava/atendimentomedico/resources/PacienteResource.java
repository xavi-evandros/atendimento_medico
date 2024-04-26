package com.estudosjava.atendimentomedico.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosjava.atendimentomedico.entities.Paciente;

@RestController
@RequestMapping(value="/pacientes")
public class PacienteResource {
	
	@GetMapping
	public ResponseEntity<Paciente> findAll(){
		Paciente p = new Paciente(1L, "00379000125680017", "Evandro Xavier");
		return ResponseEntity.ok().body(p);
	}

}
