package Main;

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
import Clases.Virreinatos;

public class ReinoCompleto {

	private NuevaEspa�a nuevaEspa�a;
	private NuevaGranada nuevaGranda;
	private Peru peru;
	private Plata plata;
	private Castilla castilla;
	private Aragon aragon;
	private Borgo�a borgo�a;
	private Austria austria;

	public ReinoCompleto(NuevaEspa�a nuevaEspa�a,NuevaGranada nuevaGranda ,Peru peru,Plata plata,Castilla castilla,Aragon aragon,Borgo�a borgo�a,Austria astria) {
		this.nuevaEspa�a= nuevaEspa�a;
		this.nuevaGranda=nuevaGranda;
		this.peru=peru;
		this.plata=plata;
		this.castilla=castilla;
		this.aragon=aragon;
		this.borgo�a=borgo�a;
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
	
	public NuevaEspa�a getNuevaEspa�a() {
		return nuevaEspa�a;
	}

	public void setNuevaEspa�a(NuevaEspa�a nuevaEspa�a) {
		this.nuevaEspa�a = nuevaEspa�a;
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
