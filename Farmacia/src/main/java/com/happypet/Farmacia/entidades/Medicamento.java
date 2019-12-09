package com.happypet.Farmacia.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotEmpty
	@Column
	private String NombreMedicamento;
	
	
	@Column
	private String FechaAdquisicion;
	
	@Column
	private String FechaVencimiento;
	
	
	@Column
	private int Cantidad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProveedor")
	private Proveedor proveedor;
	
	@Column
	private double precio;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombreMedicamento() {
		return NombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		NombreMedicamento = nombreMedicamento;
	}

	public String getFechaAdquisicion() {
		return FechaAdquisicion;
	}

	public void setFechaAdquisicion(String fechaAdquisicion) {
		FechaAdquisicion = fechaAdquisicion;
	}

	public String getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Medicamento(@NotEmpty String nombreMedicamento, String fechaAdquisicion, String fechaVencimiento,
			int cantidad, Proveedor proveedor, double precio) {
		
		NombreMedicamento = nombreMedicamento;
		FechaAdquisicion = fechaAdquisicion;
		FechaVencimiento = fechaVencimiento;
		Cantidad = cantidad;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	public Medicamento() {
		
	}
	
	
	
	
}
