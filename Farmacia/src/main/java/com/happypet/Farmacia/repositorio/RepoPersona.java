package com.happypet.Farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happypet.Farmacia.entidades.Persona;

@Repository
public interface RepoPersona extends  JpaRepository<Persona, Integer> {

}
