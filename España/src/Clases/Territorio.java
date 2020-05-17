package Clases;
import java.util.HashMap;

public abstract class Territorio {
	
	private String continente;
	private String nombre;
	private HashMap<Integer,Flota> arrayFlota;

 public Territorio (String nombre,String continente,HashMap<Integer,Flota>flota) {
	 
	 this.nombre=nombre;
	 this.continente=continente;
	 this.arrayFlota=flota;
	 }

public Territorio(Territorio obj) {
	this.continente=obj.getContinente();
	this.nombre=obj.getNombre();
	this.arrayFlota=obj.getArrayFlota();
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

public HashMap<Integer, Flota> getArrayFlota() {
	return arrayFlota;
}

public void setArrayFlota(HashMap<Integer, Flota> arrayFlota) {
	this.arrayFlota = arrayFlota;
}

@Override
public String toString() {
	return " Nombre : " + nombre+" ,continente : " + continente;
}

}
