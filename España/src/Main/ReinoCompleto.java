package Main;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;

import BaseDeDatos.IntroducirDatos;
import Clases.Aragon;
import Clases.Austria;
import Clases.Borgo�a;
import Clases.Castilla;
import Clases.Europa;
import Clases.NuevaEspa�a;
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

	private NuevaEspa�a nuevaEspa�a;
	private NuevaGranada nuevaGranda;
	private Peru peru;
	private Plata plata;
	private Castilla castilla;
	private Aragon aragon;
	private Borgo�a borgo�a;
	private Austria austria;
	private IntroducirDatos base;

	/**
	 * 
	 * @param nuevaEspa�a se introduce el objeto de nueva Espa�a preciamente creado
	 * @param nuevaGranda  se introduce el objeto de nueva Granada preciamente creado
	 * @param peru se introduce el objeto de Peru preciamente creado
	 * @param plata se introduce el objeto de Plata preciamente creado
	 * @param castilla se introduce el objeto de Castilla preciamente creado
	 * @param aragon se introduce el objeto de Aragon preciamente creado
	 * @param borgo�a se introduce el objeto de Borgo�a preciamente creado
	 * @param astria se introduce el objeto de Austria  preciamente creado
	 * @throws Exception 
	 */

	public ReinoCompleto() throws Exception {
		this.nuevaEspa�a= new NuevaEspa�a("Nueva Espa�a", "Ameriaca", 100);
		this.nuevaGranda=new NuevaGranada("Nueva Granada", "America", 100);
		this.peru=new Peru("Peru","America", 100);
		this.plata= new Plata("Plata","America", 100);
		this.castilla=new Castilla("Castilla","Europa", 100,  "Madrid");
		this.aragon= new Aragon("Aragon","Europa", 100, "Zaragoza");
		this.borgo�a= new Borgo�a("Borgo�a","Europa", 100, "Flandes");
		this.austria=new Austria("Austria","Europa", 100, "Austria");
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
			pesoDisponibleFlota=reino.getFlota().a�adirMercancia(reino.getMercancia().get(idMercancia));
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
				
				enviarBaseDatosIdMercancias(reino,destino);

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
				case "NUEVA ESPA�A":
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
				case "BORGO�A":
					reino.getFlota().setDestino(((Virreinatos) reino).getDistanciaBorgo�a());
					this.llegadaFlotaDestino(reino, destino);
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}

		}else if(reino instanceof Europa) {

			if(reino.getFlota().isDisponible()) {
				
				enviarBaseDatosIdMercancias(reino,destino);

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
				case "NUEVA ESPA�A":
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
				case "BORGO�A":
					reino.getFlota().setDestino(((Europa) reino).getDistanciaBorgo�a());
					this.llegadaFlotaDestino(reino, destino);
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}

		}
	}
	
	protected void enviarBaseDatosIdMercancias(Reinos origen,Reinos destino) throws SQLException {
		Iterator it = origen.getFlota().getArrayMercancias().keySet().iterator();
		int id;
		int turno;
		String codigoPais;
		String aux;
		
		turno=PanelControl.getContadorTurnos();
		
		if(origen.getNombre().equals("Nueva Espa�a")) {
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
		System.out.println("hola");
			
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
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(nuevaEspa�a));
	
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(nuevaGranda));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(peru));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(plata));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(castilla));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(aragon));
		
		zonasSinProductosDemandados.add(this.comprobarProducotosDemandadosZonas(borgo�a));
		
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
		System.out.println("--- Nueva Espa�a ");
		nuevaEspa�a.verProductosDemandados();
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
		System.out.println("--- Borgo�a ");
		borgo�a.verProductosDemandados();
		System.out.println("--- Austria ");
		austria.verProductosDemandados();
	}

	/**
	 * Metodo encargado de ver hacer una manera mas visual todas las flotas creadas en el Reino
	 */
	public void verFlotasConMercancias() {
		System.out.println("--- Nueva Espa�a ");
		nuevaEspa�a.getFlota().verMercancias();
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
		System.out.println("--- Borgo�a ");
		borgo�a.getFlota().verMercancias();
		System.out.println("--- Austria ");
		austria.getFlota().verMercancias();
	}

	public NuevaEspa�a getNuevaEspa�a() {
		return nuevaEspa�a;
	}

	public void setNuevaEspa�a(NuevaEspa�a nuevaEspa�a) {
		this.nuevaEspa�a = nuevaEspa�a;
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

	public Borgo�a getBorgo�a() {
		return borgo�a;
	}

	public void setBorgo�a(Borgo�a borgo�a) {
		this.borgo�a = borgo�a;
	}

	public Austria getAustria() {
		return austria;
	}

	public void setAustria(Austria austria) {
		this.austria = austria;
	}

	@Override
	public String toString() {
		return "ReinoCompleto =" + nuevaEspa�a + " / " + peru + " / " + plata + " / "	+ castilla + " / " + aragon + " / " + borgo�a + " / " + austria ;
	}

}
