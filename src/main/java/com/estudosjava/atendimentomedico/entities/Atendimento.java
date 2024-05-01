package com.estudosjava.atendimentomedico.entities;

import java.io.Serializable;
import java.util.Date;

public class Atendimento implements Serializable {

	private static final long serialVersionUID = 1L;
	  
	private Long id;
	private String tipoAtendimento;
	private Date dataAtendimento;
	
}
