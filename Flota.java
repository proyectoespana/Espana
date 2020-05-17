import java.util.ArrayList;

public class Flota {

	private String nombre;
	private int numeroBarcos;
	private ArrayList<String>arrayMercancias;
	private int nivelSeguridad;
	private int perdidas;
	private int diasIda;

	public Flota(String nombre,int numeroBarcos,ArrayList<String>arrayMercancias,int nivelSeguridad,int perdidas,int diasIda) {
		this.nombre=nombre;
		this.numeroBarcos=numeroBarcos;
		this.arrayMercancias=arrayMercancias;
		this.nivelSeguridad=nivelSeguridad;
		this.perdidas=perdidas;
		this.diasIda=diasIda;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroBarcos() {
		return numeroBarcos;
	}

	public void setNumeroBarcos(int numeroBarcos) {
		this.numeroBarcos = numeroBarcos;
	}

	public ArrayList<String> getArrayMercancias() {
		return arrayMercancias;
	}

	public void setArrayMercancias(ArrayList<String> arrayMercancias) {
		this.arrayMercancias = arrayMercancias;
	}

	public int getNivelSeguridad() {
		return nivelSeguridad;
	}

	public void setNivelSeguridad(int nivelSeguridad) {
		this.nivelSeguridad = nivelSeguridad;
	}

	public int getPerdidas() {
		return perdidas;
	}

	public void setPerdidas(int perdidas) {
		this.perdidas = perdidas;
	}

	public int getDiasIda() {
		return diasIda;
	}

	public void setDiasIda(int diasIda) {
		this.diasIda = diasIda;
	}

	@Override
	public String toString() {
		return "Flota [nombre=" + nombre + ", numeroBarcos=" + numeroBarcos + ", arrayMercancias=" + arrayMercancias
				+ ", nivelSeguridad=" + nivelSeguridad + ", perdidas=" + perdidas + ", diasIda=" + diasIda + "]";
	}
}
