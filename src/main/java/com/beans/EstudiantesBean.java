package com.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EstudiantesBean implements Serializable
{

	private int estudiante_id;
	private String nombre;
	private String correo;
	private String telefono;
	
	public EstudiantesBean() {
		
	}

	public int getEstudiante_id() {
		return estudiante_id;
	}

	public void setEstudiante_id(int estudiante_id) {
		this.estudiante_id = estudiante_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
