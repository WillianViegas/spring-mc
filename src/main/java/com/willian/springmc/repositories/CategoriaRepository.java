package com.willian.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.springmc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
