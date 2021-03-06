/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vetspars.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClienteModel {
    
	private int id;
	private String dni;
	private String nombre;
	private String nombreSeg;
	private String apellidoPat;
	private String apellidoMat;
	private Date fechaNac;
	private Integer sexo;
	private String celular;
	private String direccion;
	private DistritoModel distrito;	
	
	public ClienteModel() {
	}

	public ClienteModel(int id, String dni, String nombre, String nombreSeg, String apellidoPat, String apellidoMat,
			Date fechaNac, Integer sexo, String celular, String direccion, DistritoModel distrito) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.nombreSeg = nombreSeg;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.celular = celular;
		this.direccion = direccion;
		this.distrito = distrito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreSeg() {
		return nombreSeg;
	}

	public void setNombreSeg(String nombreSeg) {
		this.nombreSeg = nombreSeg;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DistritoModel getDistrito() {
		return distrito;
	}

	public void setDistrito(DistritoModel distrito) {
		this.distrito = distrito;
	}
}
