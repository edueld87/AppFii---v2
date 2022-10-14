package com.entra21.eventoapp.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entra21.eventoapp.models.Evento;
import com.entra21.eventoapp.models.TabelaFii;

@Repository
	public interface TabelaFiiRepository extends JpaRepository<TabelaFii, String> {

		void save(@Valid Evento evento); 
		
	//	List<TabelaFii> findByCODIGO(String CODIGO);
		
		TabelaFii findByCODIGO(String CODIGO);
	//	TabelaFii findByPRECO_ATUAL(String CODIGO);
		
}
