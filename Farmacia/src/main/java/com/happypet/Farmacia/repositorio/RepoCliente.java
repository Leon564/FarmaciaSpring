package com.happypet.Farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happypet.Farmacia.entidades.Cliente;



@Repository
public interface RepoCliente extends JpaRepository<Cliente,Integer> {
	//insert, update, delete, list
}
