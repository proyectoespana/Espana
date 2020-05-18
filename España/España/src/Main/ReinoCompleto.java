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
import Clases.Virreinatos;

public class ReinoCompleto {

	private NuevaEspaña nuevaEspaña;
	private NuevaGranada nuevaGranda;
	private Peru peru;
	private Plata plata;
	private Castilla castilla;
	private Aragon aragon;
	private Borgoña borgoña;
	private Austria austria;

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
	
	public void verImportaciones(Reinos zona) {
		zona.verMercanciasImportacion();
	}
	
	public void verExportaciones(Reinos zona) {
		zona.verMercanciasExportacion();
	}
	
	public double verDinero(Reinos zona) {
		return zona.getDineroTotal();
	}

	public void sublevaciones(Reinos zona) {

	}
	
	public String verDistancias(Reinos zona) throws Exception {
		
		if(zona instanceof Virreinatos) {
			return ((Virreinatos)zona).mostrarDistancias();
			
		}else if(zona instanceof Europa) {
			
			return ((Europa)zona).mostrarDistancias();
		}else {
			
			throw new Exception();
		}
	}
	
	public void verMercancias(Reinos zona) {
		zona.verMercancias();
	}
	
	public void verProduccionMensual(Reinos zona) {
		
		 zona.verProduccionMensual();
	}
	
	public NuevaEspaña getNuevaEspaña() {
		return nuevaEspaña;
	}

	public void setNuevaEspaña(NuevaEspaña nuevaEspaña) {
		this.nuevaEspaña = nuevaEspaña;
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
