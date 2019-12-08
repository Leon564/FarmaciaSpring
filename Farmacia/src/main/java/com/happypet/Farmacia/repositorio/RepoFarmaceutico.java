package com.happypet.Farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happypet.Farmacia.entidades.Farmaceutico;

public interface RepoFarmaceutico extends  JpaRepository<Farmaceutico, Integer> {

}
