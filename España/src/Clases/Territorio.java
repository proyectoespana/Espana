package Clases;
import java.util.HashMap;

public abstract class Territorio {
/**
 * 
 */
	private String continente;
	private String nombre;
	private Flota flota;

	public Territorio (String nombre,String continente){
		this.nombre=nombre;
		this.continente=continente;
		this.flota= new Flota(nombre);
	}

	public Territorio(Territorio obj) {
		this.continente=obj.getContinente();
		this.nombre=obj.getNombre();
		this.flota=obj.getFlota();
	}


	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Flota getFlota() {
		return flota;
	}

	public void setFlota(Flota flota) {
		this.flota = flota;
	}

	@Override
	public String toString() {
		return " Nombre : " + nombre+" ,continente : " + continente;
	}

}
