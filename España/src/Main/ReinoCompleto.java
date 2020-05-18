package Main;

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


			return "La flota todavia puede transportar "+pesoDisponibleFlota;
		}else {
			throw new Exception("La flota no esta disponible ");
		}
	}

	/**
	 * Metodo encargado de enviar una flota con mercancias a una determinada zona
	 * @param destino
	 * @throws Exception 
	 */
	public void enviarFlota(Reinos reino ,String destino) throws Exception {

		if(reino instanceof Virreinatos) {

			if(reino.getFlota().isDisponible()) {

				switch (destino.toUpperCase()) {
				case "PERU":
					reino.getFlota().enviarMercancias(((Virreinatos) reino).getDistanciaPeru());
					break;
				case "PLATA":
					reino.getFlota().enviarMercancias(((Virreinatos) reino).getDistanciaPlata());
					break;
				case "CASTILLA":
					reino.getFlota().enviarMercancias(((Virreinatos) reino).getDistanciaCastilla());
					break;
				case "NUEVA GRANADA":
					reino.getFlota().enviarMercancias(((Virreinatos) reino).getDistanciaNuevaGranada());
					break;
				case "NUEVA ESPAÑA":
					reino.getFlota().enviarMercancias(((Virreinatos) reino).getDistanciaNuevaEspaña());
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}

		}else if(reino instanceof Europa) {

			if(reino.getFlota().isDisponible()) {

				switch (destino.toUpperCase()) {
				case "ARAGON":
					reino.getFlota().enviarMercancias(((Europa) reino).getDistanciaAragon());
					break;
				case "AUSTRIA":
					reino.getFlota().enviarMercancias(((Europa) reino).getDistanciaAustria());
					break;
				case "BORGOÑA":
					reino.getFlota().enviarMercancias(((Europa) reino).getDistanciaBorgoña());
					break;
				case "CASTILLA":
					reino.getFlota().enviarMercancias(((Europa) reino).getDistanciaCastilla());
					break;
				case "NUEVA ESPAÑA":
					reino.getFlota().enviarMercancias(((Europa) reino).getDistanciaNuevaEsapaña());
					break;
				default:
					throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+reino.getNombre());
				}
			}

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
