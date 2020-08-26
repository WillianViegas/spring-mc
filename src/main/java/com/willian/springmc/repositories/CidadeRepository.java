package com.willian.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.springmc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
