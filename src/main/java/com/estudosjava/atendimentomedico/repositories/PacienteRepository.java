package com.estudosjava.atendimentomedico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.atendimentomedico.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
