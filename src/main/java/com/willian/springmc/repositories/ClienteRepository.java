package com.willian.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.springmc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
