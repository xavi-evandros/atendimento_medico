package com.estudosjava.atendimentomedico.entities;

import java.io.Serializable;
import java.util.Objects;

public class Local implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String codigoLocal;
	private String nomeFantasia;
	
	public Local() {
		
	}
	
	
	public Local(Long id, String codigoLocal, String nomeFantasia) {
		super();
		this.id = id;
		this.codigoLocal = codigoLocal;
		this.nomeFantasia = nomeFantasia;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoLocal() {
		return codigoLocal;
	}
	public void setCodigoLocal(String codigoLocal) {
		this.codigoLocal = codigoLocal;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigoLocal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Local other = (Local) obj;
		return Objects.equals(codigoLocal, other.codigoLocal);
	}
	
	
	
	
}
