package com.willian.springmc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.willian.springmc.domain.Categoria;
import com.willian.springmc.repositories.CategoriaRepository;
import com.willian.springmc.services.exceptions.DataIntegrityException;
import com.willian.springmc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repository;
	
	public List<Categoria> findAll(){
		List<Categoria> list = repository.findAll();
		return list;
	}
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(id));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		findById(obj.getId());
		return repository.save(obj);
	}
	
	public void deleteById(Integer id) {
		findById(id);
		
		try {
			repository.deleteById(id);			
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que tenha produtos");
		}
	}
}
