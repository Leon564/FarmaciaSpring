package com.happypet.Farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happypet.Farmacia.entidades.Medicamento;


@Repository
public interface RepoMedicamento extends JpaRepository<Medicamento, Integer> {

}
