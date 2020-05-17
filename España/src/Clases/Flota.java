package Clases;
import java.util.ArrayList;
import java.util.Iterator;

public class Flota {

	private String nombre;
	private int numeroBarcos;
	private ArrayList<String>arrayMercancias;
	private boolean Seguridad;
	private int pesoMaximo;
	private int diasIda;
	private int pesoTodasMercancias;
	private double precio;

	public Flota(String nombre,int numeroBarcos,boolean seguridad,int diasIda,ArrayList<String>arrayMercancias) throws Exception {
		this.nombre=nombre;
		this.numeroBarcos=numeroBarcos;
		this.Seguridad = seguridad;
		this.diasIda=diasIda;
		this.pesoMaximo=numeroBarcos*700000;
		this.precio=calcularPrecio();
		añadirMercancia(arrayMercancias);
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
	
	public void añadirMercancia(ArrayList<String>arrayMercancias) throws Exception {
		if(calcularPesoMercancias()==true) {
			this.arrayMercancias=arrayMercancias;
		}
	}
	
	public boolean calcularPesoMercancias() throws Exception {
		Iterator iterador = this.arrayMercancias.iterator();
		Mercancia mercancia;
		int pesoTodasMercancias=0;
		
		while(iterador.hasNext()) {
			mercancia=(Mercancia) iterador.next();
			
			pesoTodasMercancias=pesoTodasMercancias+mercancia.getTotalkg();
		}
		
		if(pesoTodasMercancias<this.pesoMaximo) {
			this.setPesoTodasMercancias(pesoTodasMercancias);
			return true;
		}else {
			throw new Exception("Esta flota no esta capacitada para tanto peso");
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

	public int getPesoTodasMercancias() {
		return pesoTodasMercancias;
	}

	public void setPesoTodasMercancias(int pesoTodasMercancias) {
		this.pesoTodasMercancias = pesoTodasMercancias;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Flota nombre "+this.nombre+" numero barcos"+this.numeroBarcos+" con un total de "+this.arrayMercancias.size();
	}


}
