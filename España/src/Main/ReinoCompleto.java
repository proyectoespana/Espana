package Main;

import java.util.HashSet;

import Clases.Aragon;
import Clases.Austria;
import Clases.Borgoña;
import Clases.Castilla;
import Clases.Europa;
import Clases.NuevaEspaña;
import Clases.NuevaGranada;
import Clases.Peru;
import Clases.Plata;
import Clases.Reinos;
import Clases.Territorio;
import Clases.Virreinatos;
/**
 * 
 * @author Grupo
 *
 */

public class ReinoCompleto {

	private NuevaEspaña nuevaEspaña;
	private NuevaGranada nuevaGranda;
	private Peru peru;
	private Plata plata;
	private Castilla castilla;
	private Aragon aragon;
	private Borgoña borgoña;
	private Austria austria;

	/**
	 * 
	 * @param nuevaEspaña se introduce el objeto de nueva España preciamente creado
	 * @param nuevaGranda  se introduce el objeto de nueva Granada preciamente creado
	 * @param peru se introduce el objeto de Peru preciamente creado
	 * @param plata se introduce el objeto de Plata preciamente creado
	 * @param castilla se introduce el objeto de Castilla preciamente creado
	 * @param aragon se introduce el objeto de Aragon preciamente creado
	 * @param borgoña se introduce el objeto de Borgoña preciamente creado
	 * @param astria se introduce el objeto de Austria  preciamente creado
	 */

	public ReinoCompleto(NuevaEspaña nuevaEspaña,NuevaGranada nuevaGranda ,Peru peru,Plata plata,Castilla castilla,Aragon aragon,Borgoña borgoña,Austria astria) {
		this.nuevaEspaña= nuevaEspaña;
		this.nuevaGranda=nuevaGranda;
		this.peru=peru;
		this.plata=plata;
		this.castilla=castilla;
		this.aragon=aragon;
		this.borgoña=borgoña;
		this.austria=astria;
	}

	/**
	 * Metodo encargado de meter mercancias en una flota determinada
	 * @param reino
	 * @param idMercancia
	 * @return
	 * @throws Exception
	 */
	public String formarFlota(Reinos reino,int idMercancia) throws Exception {
		int pesoDisponibleFlota;

		if(reino.getFlota().isDisponible()) {
			pesoDisponibleFlota=reino.getFlota().añadirMercancia(reino.getMercancia().get(idMercancia));
			reino.getMercancia().remove(idMercancia);


			return "La flota todavia puede transportar "+pesoDisponibleFlota;
		}else {
			throw new Exception("La flota no esta disponible ");
		}
	}

	/**
	 * Metodo encargado de enviar una flota con mercancias a una determinada zona depositar toda la mercancia de la misma 
	 * @param destino
	 * @throws Exception 
	 */
	public void enviarFlota(Reinos reino ,Reinos destino) throws Exception {

		if(reino instanceof Virreinatos) {

			if(reino.getFlota().isDisponible()) {

				switch (destino.getNombre().toUpperCase()) {
				case "PERU":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaPeru());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "PLATA":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaPlata());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "CASTILLA":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaCastilla());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA GRANADA":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaNuevaGranada());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA ESPAÑA":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaPeru());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "ARAGON":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaAragon());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "AUSTRIA":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaAustria());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "BORGOÑA":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaBorgoña());
					this.llegadaFlotaDestino(reino, destino);
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}

		}else if(reino instanceof Europa) {

			if(reino.getFlota().isDisponible()) {

				switch (destino.getNombre().toUpperCase()) {
				case "PERU":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaPeru());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "PLATA":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaPlata());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "CASTILLA":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaCastilla());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA GRANADA":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaNuevaGranada());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA ESPAÑA":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaPeru());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "ARAGON":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaAragon());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "AUSTRIA":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaAustria());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "BORGOÑA":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaBorgoña());
					this.llegadaFlotaDestino(reino, destino);
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}

		}
	}

	/**
	 * Metodo encargado de poner disponible la flota de un determinado territorio
	 * @param reino parametro encargado de introducir el pais en cuestion del que se quiere que se ponga la flota disponible
	 */
	public void devolverFlota(Reinos reino) {
		reino.getFlota().setDisponible(true);
		reino.getFlota().setDestino(0);
	}

	private void llegadaFlotaDestino(Reinos origen,Reinos destino) throws Exception {
		if(!origen.equals(destino)) {
			origen.getFlota().setDisponible(false);

			destino.llegadaImpotacion(origen.getFlota());
		}else {
			throw new Exception("Esa ruta comercial esta demasiado cerca no es necesario mandar una flota");
		}
	}

	public void verImportaciones(Reinos zona) {
		zona.verMercanciasImportacion();
	}


	public double verDinero(Reinos zona) {
		return zona.getDineroTotal();
	}

	public void sublevaciones(Reinos zona) {

	}
	
	/**
	 * Metodo encargado de comprobar si todas las regiones tienen los productos demandados por las mismas
	 * @return retorna una lista que contiene las zonas donde no se han satisfacido las necesidades que pedian
	 */
	public HashSet pasarTurno() {
		//uso de HashSet para que no haya repeticiones
		HashSet<String> zonasSinProductosDemandados= new HashSet<String>();
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(nuevaEspaña));
	
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(nuevaGranda));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(peru));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(plata));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(castilla));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(aragon));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(borgoña));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(austria));
		
		zonasSinProductosDemandados.remove(null);
		
		return zonasSinProductosDemandados;
	}
	
	/**
	 * Metodo hermano del de PasarTurno, su principal funcion es ir al metodo "comprobarProductosDemandados" de cada zona y comprobar si es true or false
	 * @param reino  se pasa como parametro el pais en cuestion del que se quiere comprobar su metodo 
	 * @return retorna el nombre de la zona si en la misma no se han satisfacido las necesidades y en cambio "nada" si en esa zona no hay necesidad de productos
	 */
	private String comprobarProducotosDemandadosZonas(Reinos reino) {
		
		if(!reino.comprobarProductosDemandados()) {
			return reino.getNombre();
		}else {
			return null;
		}
	}
	

	/**
	 * Metodo que se encarga de retornar las distancias de cada Reino del resto 
	 * @param zona  se introduce el Reino en cuestion del que queremos saber sus distancias 
	 * @return
	 * @throws Exception
	 */
	public String verDistancias(Reinos zona) throws Exception {

		if(zona instanceof Virreinatos) {
			return ((Virreinatos)zona).mostrarDistancias();

		}else if(zona instanceof Europa) {

			return ((Europa)zona).mostrarDistancias();
		}else {

			throw new Exception();
		}
	}

	/**
	 * Metodo encargado de ver hacer una manera mas visual todos los productos del Reino Demandados
	 */
	public void verProductosDemandadosElReino() {
		System.out.println("--- Nueva España ");
		nuevaEspaña.verProductosDemandados();
		System.out.println("--- Nueva Granada ");
		nuevaGranda.verProductosDemandados();
		System.out.println("--- Peru ");
		peru.verProductosDemandados();
		System.out.println("--- Plata ");
		plata.verProductosDemandados();
		System.out.println("--- Castilla ");
		castilla.verProductosDemandados();
		System.out.println("--- Aragon ");
		aragon.verProductosDemandados();
		System.out.println("--- Borgoña ");
		borgoña.verProductosDemandados();
		System.out.println("--- Austria ");
		austria.verProductosDemandados();
	}

	/**
	 * Metodo encargado de ver hacer una manera mas visual todas las flotas creadas en el Reino
	 */
	public void verFlotasConMercancias() {
		System.out.println("--- Nueva España ");
		nuevaEspaña.getFlota().verMercancias();
		System.out.println("--- Nueva Granada ");
		nuevaGranda.getFlota().verMercancias();
		System.out.println("--- Peru ");
		peru.getFlota().verMercancias();
		System.out.println("--- Plata ");
		plata.getFlota().verMercancias();
		System.out.println("--- Castilla ");
		castilla.getFlota().verMercancias();
		System.out.println("--- Aragon ");
		aragon.getFlota().verMercancias();
		System.out.println("--- Borgoña ");
		borgoña.getFlota().verMercancias();
		System.out.println("--- Austria ");
		austria.getFlota().verMercancias();
	}

	public NuevaEspaña getNuevaEspaña() {
		return nuevaEspaña;
	}

	public void setNuevaEspaña(NuevaEspaña nuevaEspaña) {
		this.nuevaEspaña = nuevaEspaña;
	}

	public NuevaGranada getNuevaGranda() {
		return nuevaGranda;
	}

	public void setNuevaGranda(NuevaGranada nuevaGranda) {
		this.nuevaGranda = nuevaGranda;
	}

	public Peru getPeru() {
		return peru;
	}

	public void setPeru(Peru peru) {
		this.peru = peru;
	}

	public Plata getPlata() {
		return plata;
	}

	public void setPlata(Plata plata) {
		this.plata = plata;
	}

	public Castilla getCastilla() {
		return castilla;
	}

	public void setCastilla(Castilla castilla) {
		this.castilla = castilla;
	}

	public Aragon getAragon() {
		return aragon;
	}

	public void setAragon(Aragon aragon) {
		this.aragon = aragon;
	}

	public Borgoña getBorgoña() {
		return borgoña;
	}

	public void setBorgoña(Borgoña borgoña) {
		this.borgoña = borgoña;
	}

	public Austria getAustria() {
		return austria;
	}

	public void setAustria(Austria austria) {
		this.austria = austria;
	}

	@Override
	public String toString() {
		return "ReinoCompleto =" + nuevaEspaña + " / " + peru + " / " + plata + " / "	+ castilla + " / " + aragon + " / " + borgoña + " / " + austria ;
	}

}
