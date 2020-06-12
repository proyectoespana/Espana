package Main;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;

import BaseDeDatos.IntroducirDatos;
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
	/**
	 * Reino Nueva España
	 */
	private NuevaGranada nuevaGranda;
	/**
	 * Reino Nueva Granada
	 */
	private Peru peru;
	/**
	 * Reino Peru
	 */
	private Plata plata;
	/**
	 * Reino Plata
	 */
	private Castilla castilla;
	/**
	 * Reino Castilla
	 */
	private Aragon aragon;
	/**
	 * Reino Aragon
	 */
	private Borgoña borgoña;
	/**
	 * Reino Borgoña
	 */
	private Austria austria;
	/**
	 * Reino Austria
	 */

	/**
	 * 
	 * @throws Exception envia una Excepcion si no encuentra un Producto
	 */

	public ReinoCompleto() throws Exception {
		this.nuevaEspaña= new NuevaEspaña("Nueva España", "Ameriaca", 100);
		this.nuevaGranda=new NuevaGranada("Nueva Granada", "America", 100);
		this.peru=new Peru("Peru","America", 100);
		this.plata= new Plata("Plata","America", 100);
		this.castilla=new Castilla("Castilla","Europa", 100,  "Madrid");
		this.aragon= new Aragon("Aragon","Europa", 100, "Zaragoza");
		this.borgoña= new Borgoña("Borgoña","Europa", 100, "Flandes");
		this.austria=new Austria("Austria","Europa", 100, "Austria");
	}

	/**
	 * Método encargado de meter mercancías en una flota determinada
	 * @param reino objeto del Reino
	 * @param idMercancia el identificador de la Mercancía
	 * @return el número de kg que todavía puede transportar
	 * @throws Exception envía excepcion si la Flota no puede transportar determinados kg
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
	 * Método encargado de enviar una flota con mercancías a una determinada zona depositar toda la mercancía de la misma 
	 * @param destino zona a la que se envía la flota
	 * @param reino zona desde la que se envía la flota
	 * @throws Exception envío de Excepcion si no se introduce el nombre correctamente
	 */
	public void enviarFlota(Reinos reino ,Reinos destino) throws Exception {

		if(reino instanceof Virreinatos) {

			if(reino.getFlota().isDisponible()) {
				
				enviarBaseDatosIdMercancias(reino,destino);

				switch (destino.getNombre().toUpperCase()) {
				case "PERU":
//					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaPeru());
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaPeru());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "PLATA":
//					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaPlata());
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaPlata());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "CASTILLA":
//					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaCastilla());
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaCastilla());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA GRANADA":
//					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaNuevaGranada());
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaNuevaGranada());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA ESPAÑA":
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaNuevaEspaña());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "ARAGON":
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaAragon());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "AUSTRIA":
//					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaAustria());
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaAustria());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "BORGOÑA":
//					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaBorgoña());
					reino.getFlota().enviarFLota(((Virreinatos) reino).getDistanciaBorgoña());
					this.llegadaFlotaDestino(reino, destino);
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}
			else {
				throw new IllegalArgumentException(reino+"No esta disponible debido a revueltas");
			}

		}else if(reino instanceof Europa) {

			if(reino.getFlota().isDisponible()) {
				
				enviarBaseDatosIdMercancias(reino,destino);

				switch (destino.getNombre().toUpperCase()) {
				case "PERU":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaPeru());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaPeru());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "PLATA":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaPlata());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaPlata());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "CASTILLA":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaCastilla());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaCastilla());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA GRANADA":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaNuevaGranada());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaNuevaGranada());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "NUEVA ESPAÑA":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaPeru());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaNuevaEsapaña());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "ARAGON":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaAragon());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaAragon());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "AUSTRIA":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaAustria());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaAustria());
					this.llegadaFlotaDestino(reino, destino);
					break;
				case "BORGOÑA":
//					reino.getFlota().setDestino(((Europa) reino).getDistanciaBorgoña());
					reino.getFlota().enviarFLota(((Europa) reino).getDistanciaBorgoña());
					this.llegadaFlotaDestino(reino, destino);
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}
			else {
				throw new IllegalArgumentException(reino+"No esta disponible debido a revueltas");
			}
		}
	}
	
	/**
	 * Metodo encargado de instertar las importaciones a la Base de datos
	 * @param origen
	 * @param destino
	 * @throws SQLException
	 */
	protected void enviarBaseDatosIdMercancias(Reinos origen,Reinos destino) throws SQLException {
		Iterator it = origen.getFlota().getArrayMercancias().keySet().iterator();
		int id;
		int turno;
		String codigoPais;
		String aux;
		
		turno=PanelControl.getContadorTurnos();
		
		if(origen.getNombre().equals("Nueva España")) {
			codigoPais="NE";
		}else if(origen.getNombre().equals("Nueva Granada")) {
			codigoPais="NG";
		}else {
			codigoPais=origen.getNombre().substring(0,2);
		}
		
		aux=codigoPais;
		
		while(it.hasNext()) {
			codigoPais=aux;
			id=(int) it.next();
			
			codigoPais+=id;
			System.out.println(codigoPais);
			
//			IntroducirDatos.insertarImportaciones(codigoPais.toUpperCase(),origen.getNombre().toString(),destino.getNombre().toString(),turno);
		}
			
	}

	/**
	 * Método encargado de poner disponible la flota de un determinado territorio
	 * @param reino parámetro encargado de introducir el país en cuestión del que se quiere que se ponga la flota disponible
	 */
	public void devolverFlota(Reinos reino) {
		reino.getFlota().setDisponible(true);
		reino.getFlota().setDestino(0);
	}

	/**
	 * Método encargado de la importación de las Mercancias
	 * @param origen Desde donde se envía la Importación
	 * @param destino Lugar al que se envía 
	 * @throws Exception 
	 */
	private void llegadaFlotaDestino(Reinos origen,Reinos destino) throws Exception {
		if(!origen.equals(destino)) {
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
	 * Método encargado de comprobar si todas las regiones tienen los productos demandados por las mismas
	 * @return retorna una lista que contiene las zonas donde no se han satisfecho las necesidades que pedían
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
	 * Método hermano del  "PasarTurno", su principal función es ir al método "comprobarProductosDemandados" de cada zona y comprobar si es "true" or "false"
	 * @param reino  se pasa como parámetro el país en cuestión del que se quiere comprobar su método 
	 * @return retorna el nombre de la zona, si en la misma no se han satisfecho las necesidades y en cambio "nada", si en esa zona no hay necesidad de productos
	 */
	private String comprobarProducotosDemandadosZonas(Reinos reino) {
		
		if(reino.getProductosDemandados().length>0) {
			
			if(reino.getProductosDemandados()[0]!=null) {
				return reino.getNombre();
			}else {
				return null;
			}
			
		}else {
			return null;
		}
		


	}
	

	/**
	 * Método que se encarga de retornar las distancias de cada Reino del resto 
	 * @param zona  se introduce el Reino en cuestión del que queremos saber sus distancias 
	 * @return distancia
	 * @throws Exception envío de Excepcion si no existe la zona
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
	 * Método encargado de ver hacer una manera mas visual todos los productos del Reino Demandados
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
	 * Método encargado de ver hacer una manera mas visual todas las flotas creadas en el Reino
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
