package com.happypet.Farmacia.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotEmpty
	@Column
	private String Nombre;
	
	@NotEmpty
	@Column
	private String Ciudad;
	@NotEmpty
	@Column
	private String Direccion;
	
	@NotEmpty
	@Column
	private String Telefono;
	
	@NotEmpty
	@Column
	private String Fax;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public Proveedor( String nombre,  String ciudad,  String direccion,
			 String telefono,  String fax) {
		
		Nombre = nombre;
		Ciudad = ciudad;
		Direccion = direccion;
		Telefono = telefono;
		Fax = fax;
	}

	
	
}
