package ar.edu.unlam.tallerweb1.modelo;

import java.util.List;

import javax.persistence.*;

@Entity
public class Comuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idComuna")
	public Long id;
	public String nombre;
	
	@OneToMany (mappedBy = "comuna")
	private List<Barrio> barrios;

	
	public Comuna( String nombre, List<Barrio> barrios) {
		
		this.nombre = nombre;
		this.barrios = barrios;
	}
	
	public Comuna(){
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Barrio> getBarrios() {
		return barrios;
	}
	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}
	
	
	
}
