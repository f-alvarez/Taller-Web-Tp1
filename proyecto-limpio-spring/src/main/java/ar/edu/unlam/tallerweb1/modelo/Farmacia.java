package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.*;

@Entity
public class Farmacia {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idFarmacia")
	public Long id;
	public String nombre;
	public String telefono;
	public String diaDeTurno;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Iddireccion")
	private Direccion direccion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Idpunto")
	private Punto geoLocalizacion;
	
	
	public Farmacia(String nombre, String diaDeTurno, String telefono){
		
		this.nombre = nombre;
		this.diaDeTurno = diaDeTurno;
		this.telefono = telefono;
	}
	
	public Farmacia(){
		
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDiaDeTurno() {
		return diaDeTurno;
	}
	public void setDiaDeTurno(String diaDeTurno) {
		this.diaDeTurno = diaDeTurno;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Punto getGeoLocalizacion() {
		return geoLocalizacion;
	}

	public void setGeoLocalizacion(Punto geoLocalizacion) {
		this.geoLocalizacion = geoLocalizacion;
	}
	
	
}
