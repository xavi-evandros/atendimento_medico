package com.estudosjava.atendimentomedico.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudosjava.atendimentomedico.entities.Paciente;
import com.estudosjava.atendimentomedico.repositories.PacienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PacienteRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		Paciente p = new Paciente(1L, "00379000125680017", "Evandro Xavier");
		Paciente p2 = new Paciente(2L, "00379000125680104", "Rafael Xavier");
		userRepository.saveAll(Arrays.asList(p,p2));
		
	}
}
