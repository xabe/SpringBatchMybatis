package es.spring.batch.model;

import java.util.Date;

public class Prueba {
	
	private Integer id;
	private String nombre;
	private Date fecha;
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return"El nombre es: "+getNombre()+" el id es: "+getId()+" la fecha es: "+getFecha();
	}
}
