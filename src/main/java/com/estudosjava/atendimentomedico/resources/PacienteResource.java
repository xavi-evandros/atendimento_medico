package com.estudosjava.atendimentomedico.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.estudosjava.atendimentomedico.entities.Paciente;
import com.estudosjava.atendimentomedico.services.PacienteService;

@RestController
@RequestMapping(value="/pacientes")
public class PacienteResource {
	
	@Autowired
	private PacienteService service;
	
	@GetMapping
	public ResponseEntity<List<Paciente> >findAll(){
		List<Paciente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping (value = "/{id}")
	public ResponseEntity <Paciente> findById(@PathVariable Long id){
		Paciente paciente = service.findById(id);
		return ResponseEntity.ok().body(paciente);
	}
	
	@PostMapping
	public ResponseEntity<Paciente> insert (@RequestBody Paciente paciente) {
		paciente = service.insert(paciente);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(paciente.getId()).toUri();	
		return ResponseEntity.created(uri).body(paciente);
	}
	@DeleteMapping (value = "/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
	
	@PutMapping (value = "/{id}")
	public ResponseEntity<Paciente>update (@PathVariable Long id, @RequestBody Paciente paciente) {
		Paciente pacAtual = service.update(id, paciente);
		return ResponseEntity.ok(pacAtual);
		
		
	}
	
	

}
