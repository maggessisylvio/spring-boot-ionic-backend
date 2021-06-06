package com.sylviomaggessi.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylviomaggessi.cursomc.domain.Cidade;
import com.sylviomaggessi.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findCidadesByEstadoId(Integer estadoId) {
		return repo.findCidadesByEstadoId(estadoId);
	}

}
