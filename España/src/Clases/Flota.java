package Clases;
import java.util.ArrayList;

public class Flota {

	private String nombre;
	private int numeroBarcos;
	private ArrayList<String>arrayMercancias;
	private boolean Seguridad;
	private int pesoMaximo;
	private int diasIda;
	private double precio;

	public Flota(String nombre,int numeroBarcos,ArrayList<String>arrayMercancias,boolean seguridad,int diasIda) {
		this.nombre=nombre;
		this.numeroBarcos=numeroBarcos;
		this.arrayMercancias=arrayMercancias;
		this.Seguridad = seguridad;
		this.diasIda=diasIda;
		this.pesoMaximo=numeroBarcos*700000;
		this.precio=calcularPrecio();
	}
	
	protected double calcularPrecio() {
		double precio;
		if(this.Seguridad==true) {
			precio=this.numeroBarcos*(100*(this.diasIda*100));
			return precio;
		}else {
			precio=this.numeroBarcos*(50*(this.diasIda*100));
			return precio;
		}
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

	public boolean isSeguridad() {
		return Seguridad;
	}

	public void setSeguridad(boolean seguridad) {
		Seguridad = seguridad;
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public int getDiasIda() {
		return diasIda;
	}

	public void setDiasIda(int diasIda) {
		this.diasIda = diasIda;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Flota [nombre=" + nombre + ", numeroBarcos=" + numeroBarcos + ", arrayMercancias=" + arrayMercancias
				+ ", Seguridad=" + Seguridad + ", pesoMaximo=" + pesoMaximo + ", diasIda=" + diasIda + ", precio="
				+ precio + "]";
	}

}
