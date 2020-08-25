package com.willian.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.springmc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
