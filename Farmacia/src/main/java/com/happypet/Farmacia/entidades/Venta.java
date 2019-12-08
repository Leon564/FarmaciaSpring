package com.happypet.Farmacia.entidades;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	//@Autowired
	//@ManyToOne(fetch = FetchType.LAZY)
	//private List<MedicamentoVendido> MedicamentosVendidos;

	
	//private HashMap <Medicamento , MedicamentoVendido > medicamento = new HashSet<>();
	
	
	

	
}
