package com.sylviomaggessi.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylviomaggessi.cursomc.domain.Estado;
import com.sylviomaggessi.cursomc.repositories.EstadoRepository;


@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAllByOrderByNome() {
		return repo.findAllByOrderByNome();		
	}
}
