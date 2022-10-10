package com.entra21.eventoapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "tabela", schema="eventosapp")

public class TabelaFiiProvento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CODIGO")
	private String CODIGO;
	private float DIVIDENDO;
//	private double cotas;
//	private double proventos;
	
//	@ManyToOne
//	private TabelaFiiProvento tabela;

	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String CODIGO) {
		CODIGO = CODIGO;
	}

	public float getDIVIDENDO() {
		return DIVIDENDO;
	}

	public void setDIVIDENDO(float DIVIDENDO) {
		DIVIDENDO = DIVIDENDO;
	}

//	public double getCotas() {
//		return cotas;
//	}
//
//	public void setCotas(double cotas) {
//		this.cotas = cotas;
//	}
//
//	public double getProventos() {
//		return proventos;
//	}
//
//	public void setProventos(double proventos) {
//		this.proventos = proventos;
//	}

	public TabelaFiiProvento() {
		super();
	}
		
	}
		

