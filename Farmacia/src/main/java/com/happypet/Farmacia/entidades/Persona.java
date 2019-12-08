package com.happypet.Farmacia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotEmpty
	@Column(name = "nombre_persona")
	private String nombre;
	
	@NotEmpty
	@Column(name = "apellido_persona")
	private String Apellido;
	
	
	//-------------------------------------------------------------------
	
	public Persona(String nombre, String apellido, String sexo,
			 String direccion) {
		
		this.nombre = nombre;
		Apellido = apellido;
		Sexo = sexo;
		Direccion = direccion;
	}

	//-------------------------------------------------------------------
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	@NotEmpty
	@Column(name = "sexo_persona")
	private String Sexo;
	
	@NotEmpty
	private String Direccion;
	
}
