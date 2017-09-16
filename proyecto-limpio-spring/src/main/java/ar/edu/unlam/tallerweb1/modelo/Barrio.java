package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;


@Entity
public class Barrio {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdBarrio")
	public Long id;
	public String nombre;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "idComuna")
	private Comuna comuna;
	
	
	public Barrio( String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public Barrio(){
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
	
	
}
