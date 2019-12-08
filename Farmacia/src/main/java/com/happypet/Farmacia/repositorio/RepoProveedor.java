package com.happypet.Farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happypet.Farmacia.entidades.Proveedor;



@Repository
public interface RepoProveedor extends JpaRepository<Proveedor, Integer> {

}
