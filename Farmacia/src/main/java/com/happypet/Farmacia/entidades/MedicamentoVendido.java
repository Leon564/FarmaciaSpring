package com.happypet.Farmacia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MedicamentoVendido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	@Column(name = "CantidadVendida")
	private int Cantidad;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMedicamento")
	private Medicamento Medicamento;
	
	@ManyToOne
	@JoinColumn(name = "FK_INVOICE")
	private Venta Venta;
	
	
}
