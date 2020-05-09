package com.uca.laboratorio4.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(message="El nombre no debe tener mas de 15 caracteres",max=15)
	@NotEmpty(message="Campo Obligatorio")
	private String nombre;
	
	@Size(message="El nombre no debe tener mas de 15 caracteres",max=30)
	@NotEmpty(message="Campo Obligatorio")
	private String descripcion;
	
	
	@NotNull(message="Campo Obligatorio")
	@Min(value=0,message="El precio no debe ser negativo")
	private Double precio;
	
	@NotEmpty(message="Campo Obligatorio")
	@Pattern(regexp="^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$",message="El formato es dd//mm/aa")
	private String vencimiento;
	
	
	//SETTERS Y GETTERS
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	
	
}
