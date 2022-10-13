package com.entra21.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Convidado {
	
	@Id
	@NotEmpty
	private String nomeConvidado;
	@NotBlank
	private String rg;
	
	private double proventos;
	
	private double soma;
	
	@ManyToOne
	private Evento evento;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getProventos() {
		return proventos;
	}
	public void setProventos(double proventos) {
		this.proventos = proventos;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
		
		
	}
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	

	}
		

