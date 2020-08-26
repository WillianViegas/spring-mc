package com.willian.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.springmc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
