package com.estudosjava.atendimentomedico.entities;

import java.io.Serializable;
import java.util.Objects;

public class Servico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int codigo;
	private String descricao;
	private Double valor;
	
	public Servico() {
		
	}

	public Servico(Long id, int codigo, String descricao, Double valor) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return codigo == other.codigo;
	}
	
	
}
