package Clases;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Flota {

	private String nombre;
	private LinkedHashMap <Integer,Mercancia>arrayMercancias;
	private int pesoMaximo;
	private String destino;
	private int pesoTodasMercancias;

	public Flota(String nombre){
		this.nombre=nombre;
		this.arrayMercancias= new LinkedHashMap<Integer, Mercancia>();
		this.pesoMaximo=700000;
		this.destino= null;
		this.pesoTodasMercancias=0;
	}

	/**
	 * Metodo encargado de meter el Array de mercancias dentro de flota
	 * @param arrayMercancias
	 * @throws Exception
	 */
	public int añadirMercancia(Mercancia mercancia) throws Exception {
		int pesoDisponible;

		pesoDisponible=calcularPesoMercancias();
		if(pesoDisponible>mercancia.getTotalkg()) {
			this.arrayMercancias.put(this.arrayMercancias.size()+1, mercancia);
		}
		return pesoDisponible-mercancia.getTotalkg();
	}

	/**
	 * Se encarga de recorrer todas las mercancias almacenas para comprobar la cantidad de peso disponible
	 * @return
	 * @throws Exception
	 */
	protected int calcularPesoMercancias() throws Exception {
		Iterator iterador = this.arrayMercancias.keySet().iterator();
		int idMercancias;
		int pesoTodasMercancias=0;

		while(iterador.hasNext()) {

			idMercancias=(int) iterador.next();

			pesoTodasMercancias=pesoTodasMercancias+this.arrayMercancias.get(idMercancias).getTotalkg();

		}
		this.setPesoTodasMercancias(pesoTodasMercancias);

		return this.pesoMaximo-pesoTodasMercancias;
	}

	public void verMercancias() {
		Iterator iterador = this.arrayMercancias.keySet().iterator();
		int idmerca;

		while(iterador.hasNext()) {
			idmerca=(int) iterador.next();

			System.out.println(this.nombre+" almacena "+this.arrayMercancias.get(idmerca).toString());

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedHashMap<Integer, Mercancia> getArrayMercancias() {
		return arrayMercancias;
	}

	public void setArrayMercancias(LinkedHashMap<Integer, Mercancia> arrayMercancias) {
		this.arrayMercancias = arrayMercancias;
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPesoTodasMercancias() {
		return pesoTodasMercancias;
	}

	public void setPesoTodasMercancias(int pesoTodasMercancias) {
		this.pesoTodasMercancias = pesoTodasMercancias;
	}

	@Override
	public String toString() {
		return "Flota nombre "+this.nombre+" con un total de "+this.arrayMercancias.size();
	}


}
