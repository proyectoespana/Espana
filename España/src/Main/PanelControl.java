package Main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

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
import Clases.ProductoNombre;
import Clases.Reinos;
import Clases.Virreinatos;
import Vista.Ventana_Principal;

public class PanelControl {
	
	private HashSet<String> zonasSinProductosDemandados ;
	private HashSet<String> zonasSinFlotaTrue ;
	private static int contadorTurnos;		
	private ReinoCompleto espana ;
	private Ventana_Principal principal;
	private IntroducirDatos base;


	public PanelControl() throws Exception {
//		IntroducirDatos.conectar();
//		IntroducirDatos.borrar();
		this.espana= new ReinoCompleto();
		this.contadorTurnos=0;
		this.zonasSinProductosDemandados= new HashSet<String>();
		this.zonasSinFlotaTrue= new HashSet<String>();
		
		cambiarTruno();
	}
	
	/**
	 * Metodo encargado de resetear los objetos de la clase 
	 * (se utilizara para cambiar de turnos y que cada zona pida nuevos producotos y los genere)
	 * @throws Exception
	 */
	protected void constructor() throws Exception {

		this.espana= new ReinoCompleto();
	}


	/**
	 * Metodo encargado de recargar los constructores y poner si alguna zona tiene sublevaciones
	 * @throws Exception
	 */
	public void cambiarTruno() throws Exception {		

		if(contadorTurnos!=0) {
			contadorTurnos++;
			
			pasarTurno(espana);

			constructor();

			recorrerLista(espana);
			
			recorrerListaFlotas();
			
			this.zonasSinFlotaTrue.clear();
			
			this.principal.dispose();

		}else {
			contadorTurnos++;
		}
				
		System.out.println("Nueva España"+this.espana.getNuevaEspaña().isSublevaciones());
		System.out.println("Nueva Granada"+this.espana.getNuevaGranda().isSublevaciones());
		System.out.println("Peru"+this.espana.getPeru().isSublevaciones());
		System.out.println("Plata"+this.espana.getPlata().isSublevaciones());
		System.out.println("Aragon"+this.espana.getAragon().isSublevaciones());
		System.out.println("Castilla"+this.espana.getCastilla().isSublevaciones());
		System.out.println("Austria"+this.espana.getAustria().isSublevaciones());
		System.out.println("Borgoña"+this.espana.getBorgoña().isSublevaciones());
		
		this.principal= new Ventana_Principal(this);
//		IntroducirDatos.insertarDatosProduccion("xqfeff", 3, 2, 3, this.contadorTurnos);
		principal.setVisible(true);
		
		if(zonasSinProductosDemandados.size()==8) {
			System.out.println(" Has aguantado "+contadorTurnos+" turnos");
			
			this.principal.dispose();
		}
	
	}

	
	/**
	 * Metodo encargado de meter en una lista el nombre de las zonas en las que no se ha podido transpasar los productos que demandaban
	 * @param espana
	 */
	public void pasarTurno(ReinoCompleto espana) {
		zonasSinProductosDemandados.addAll(espana.pasarTurno());
//		zonasSinFlotaTrue.addAll(espana.comprobarFlotasRetornadas());
	}

	
	/**
	 * Metodo encargado de recorrer la lista de Zonas en la que no se han satisfecho las demandas y una vez pasado el turno poner las sublevaciones a true
	 * y las posibles demandas que tuviesen cancelarlas
	 * @param espana
	 */
	public void recorrerLista(ReinoCompleto espana) {
		Iterator it= zonasSinProductosDemandados.iterator();
		String nombreZona;

		while(it.hasNext()) {
			nombreZona=(String) it.next();
			
			switch (nombreZona.toUpperCase()) {
			case "PERU":
				/**
				 * Una vez sabemos las zonas donde no se ha podido satifacer la demanda de productos se procede a poner las
				 * sublevaciones a true y quitar las posibles demandas de productos que tuviese
				 */
				espana.getPeru().setSublevaciones(true);
				recorrer(espana.getPeru());
				break;
			case "PLATA":
				espana.getPlata().setSublevaciones(true);
				recorrer(espana.getPlata());
				break;
			case "CASTILLA":
				espana.getCastilla().setSublevaciones(true);
				recorrer(espana.getCastilla());
				break;
			case "NUEVA GRANADA":
				espana.getNuevaGranda().setSublevaciones(true);
				recorrer(espana.getNuevaGranda());
				break;
			case "NUEVA ESPAÑA":
				espana.getNuevaEspaña().setSublevaciones(true);
				recorrer(espana.getNuevaEspaña());
				break;
			case "ARAGON":
				espana.getAragon().setSublevaciones(true);
				recorrer(espana.getAragon());
				break;
			case "AUSTRIA":
				espana.getAustria().setSublevaciones(true);
				recorrer(espana.getAustria());
				break;
			case "BORGOÑA":
				espana.getBorgoña().setSublevaciones(true);
				recorrer(espana.getBorgoña());
				break;
			default:
				throw new IllegalArgumentException(nombreZona+" no esta disponible");
			}
		}
	}
	
	/**
	 * Metodo encargado de recorrer la lista de las zonas donde no se a retornado las flotas y poner estas a false en los paises correspondientes
	 */
	public void recorrerListaFlotas() {
		Iterator it= zonasSinFlotaTrue.iterator();
		String nombreZona;
		String palabra[];

		while(it.hasNext()) {
			nombreZona=(String) it.next();
			
			palabra=this.StringToken(nombreZona);
			
			switch (palabra[0].toUpperCase()) {
			case "PERU":
				espana.getPeru().getFlota().setDisponible(false);
				espana.getPeru().getFlota().setDestino(Integer.parseInt(palabra[1]));
				
				break;
			case "PLATA":
				espana.getPlata().getFlota().setDisponible(false);
				espana.getPlata().getFlota().setDestino(Integer.parseInt(palabra[1]));
				
				break;
			case "CASTILLA":
				espana.getCastilla().getFlota().setDisponible(false);
				espana.getCastilla().getFlota().setDestino(Integer.parseInt(palabra[1]));
				
				break;
			case "NUEVA GRANADA":
				espana.getNuevaGranda().getFlota().setDisponible(false);
				espana.getNuevaEspaña().getFlota().setDestino(Integer.parseInt(palabra[1]));

				break;
			case "NUEVA ESPAÑA":
				espana.getNuevaEspaña().getFlota().setDisponible(false);
				espana.getNuevaEspaña().getFlota().setDestino(Integer.parseInt(palabra[1]));

				break;
			case "ARAGON":
				espana.getAragon().getFlota().setDisponible(false);
				espana.getAragon().getFlota().setDestino(Integer.parseInt(palabra[1]));

				break;
			case "AUSTRIA":
				espana.getAustria().getFlota().setDisponible(false);
				espana.getAustria().getFlota().setDestino(Integer.parseInt(palabra[1]));

				break;
			case "BORGOÑA":
				espana.getBorgoña().getFlota().setDisponible(false);
				espana.getBorgoña().getFlota().setDestino(Integer.parseInt(palabra[1]));

				break;
			default:
				throw new IllegalArgumentException(nombreZona+" no esta disponible");
			}
		}
	}
	
	/**
	 * Metodo hermano de RecorreListaFlotas se encarga de separar del String generado el nombre del reino que no tiene la flota disponible y la distancia a
	 * la que esta se encuentra
	 * @param palabra
	 * @return retorna una array de String donde la primera posicion es el Reino y la Segunda la distancia
	 */
	private String[] StringToken(String palabra) {
		StringTokenizer st = new StringTokenizer(palabra,",");
		String division []= new String [2];
		int i=0;
		
		while(st.hasMoreTokens()) {
			division[i]=st.nextToken();
			i++;
		}
		return division;
	}
	
	private void recorrer(Reinos reino) {
		for(int i=0;i<reino.getProductosDemandados().length;i++) {
			if(reino.getProductosDemandados()[i]!=null) {
//				reino.getProductosDemandados()[i]=null;
				reino.zonaNoDisponibleDemanda();
			}
		}
	}
	
	public void crearMercancias(Reinos pais,int cantidad,ProductoNombre producto) throws Exception {
		String codigoPais;
		pais.crearMercancia(producto, cantidad);
		int turno;

		turno= PanelControl.getContadorTurnos();
		
		if(pais.getNombre().equals("Nueva España")) {
			codigoPais="NE";
		}else if(pais.getNombre().equals("Nueva Granada")) {
			codigoPais="NG";
		}else {
			codigoPais=pais.getNombre().substring(0,2);
		}	
		
		codigoPais=codigoPais+pais.getMercancia().size();
		
//		IntroducirDatos.insertarDatosMercancias(codigoPais.toUpperCase(),producto.toString(),cantidad,turno,pais.getNombre().toString());
		
		pais.verMercancias();
	}
	
	public void meterZonaSinFlota(String nombre) {
		this.zonasSinFlotaTrue.add(nombre);
	}
	
	public void quitarReinoDeZonasSinFlota(String nombre) {
			
		if(this.zonasSinFlotaTrue.contains(nombre)) {
				this.zonasSinFlotaTrue.remove(nombre);
			}
		}
	
	/**
	 * Iterador para ver las flotas que no van a ser True el siguiente turno
	 */
	public void iteradorZonasSinFLota() {
		Iterator it = this.zonasSinFlotaTrue.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	//getter setter

	public HashSet<String> getZonasSinProductosDemandados() {
		return zonasSinProductosDemandados;
	}

	public void setZonasSinProductosDemandados(HashSet<String> zonasSinProductosDemandados) {
		this.zonasSinProductosDemandados = zonasSinProductosDemandados;
	}

	public HashSet<String> getZonasSinFlotaTrue() {
		return zonasSinFlotaTrue;
	}

	public void setZonasSinFlotaTrue(HashSet<String> zonasSinFlotaTrue) {
		this.zonasSinFlotaTrue = zonasSinFlotaTrue;
	}

	public static int getContadorTurnos() {
		return contadorTurnos;
	}

	public static void setContadorTurnos(int contadorTurnos) {
		PanelControl.contadorTurnos = contadorTurnos;
	}

	public ReinoCompleto getEspana() {
		return espana;
	}

	public void setEspana(ReinoCompleto espana) {
		this.espana = espana;
	}

	public Ventana_Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Ventana_Principal principal) {
		this.principal = principal;
	}

	public IntroducirDatos getBase() {
		return base;
	}

	public void setBase(IntroducirDatos base) {
		this.base = base;
	}
	

	


}
