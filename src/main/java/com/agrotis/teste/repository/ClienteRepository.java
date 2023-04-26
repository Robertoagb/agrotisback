package com.agrotis.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agrotis.teste.entidade.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long >{

}
