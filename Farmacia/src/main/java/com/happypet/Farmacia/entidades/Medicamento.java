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
	private String Medicamento;
	
	@NotEmpty
	@Column
	private Date FechaAdquisicion;
	@NotEmpty
	@Column
	private Date FechaVencimiento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProveedor")
	private Proveedor proveedor;
	
	@Column
	private double precio;
	
	public String getMedicamento() {
		return Medicamento;
	}
	public void setMedicamento(String medicamento) {
		Medicamento = medicamento;
	}
	public Date getFechaAdquisicion() {
		return FechaAdquisicion;
	}
	public void setFechaAdquisicion(Date fechaAdquisicion) {
		FechaAdquisicion = fechaAdquisicion;
	}
	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public Medicamento(String medicamento,  Date fechaAdquisicion,  Date fechaVencimiento, double precio) {
		
		Medicamento = medicamento;
		FechaAdquisicion = fechaAdquisicion;
		FechaVencimiento = fechaVencimiento;
		this.precio = precio;
	}
	public Medicamento() {
		
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
