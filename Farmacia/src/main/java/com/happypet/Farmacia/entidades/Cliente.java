package com.happypet.Farmacia.entidades;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotEmpty
	@Column(name = "nombre_cliente")
	private String nombre;
	
	@NotEmpty
	@Column(name = "apellido_cliente")
	private String Apellido;
	@NotEmpty
	@Column(name = "sexo_cliente")
	private String Sexo;
	
	@NotEmpty
	private String Direccion;

	public Cliente(int Id,String nombre,  String apellido,  String sexo,
			 String direccion) {
		this.Id = Id;
		this.nombre = nombre;
		this.Apellido = apellido;
		this.Sexo = sexo;
		this.Direccion = direccion;
	}
	public Cliente() {
		
	}

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
	
	
	
	
}
