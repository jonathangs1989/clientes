package com.telefonos.jonathan.model;

import java.io.Serializable;


public class ProductoModel implements Serializable{

 private Integer id;
 private String nombre;
 private String correo;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
 
 
 
 
}
