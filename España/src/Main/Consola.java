package Main;

import java.util.Scanner;

import Clases.Aragon;
import Clases.Austria;
import Clases.Borgo�a;
import Clases.Castilla;
import Clases.NuevaEspa�a;
import Clases.NuevaGranada;
import Clases.Peru;
import Clases.Plata;
import Clases.ProductoNombre;
import Clases.Reinos;

public class Consola {

	public Consola(ReinoCompleto espana) throws Exception {
		PrimeraPantalla(espana);
	}

	public void PrimeraPantalla(ReinoCompleto espana) throws Exception {
		int i;
		int zona ;

		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Introduzca 0 para salir");
			i= src.nextInt();
			if(i!=0) {
				System.out.println("1 -Reino Completo");
				System.out.println("2 -Nueva Espana");
				System.out.println("3 -Nueva Granada");
				System.out.println("4 -Peru");
				System.out.println("5 -Plata");
				System.out.println("6 -Castilla");
				System.out.println("7 -Aragon");
				System.out.println("8 -Austria");

				Scanner src2 = new Scanner(System.in);
				zona= src.nextInt();

				switch (zona) {
				case 1: 
					verMetodosReinoCompleto(espana);
					break;
				case 2:
					verZona(espana.getNuevaEspa�a());
					break;
				case 3: 
					verZona(espana.getNuevaGranda());
					break;
				case 4:
					verZona(espana.getPeru());
					break;
				case 5: 
					verZona(espana.getPlata());
					break;
				case 6:
					verZona(espana.getCastilla());
					break;
				case 7:
					verZona(espana.getAragon());
					break;
				case 8:
					verZona(espana.getAustria());
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + zona);
				}

			}
		}while(i!=0);
	}
	
	public void verZona(Reinos pais) throws Exception {
		int i;
		int metodo;
		
		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Introduzca 0 para salir al menu anterior");
			i= src.nextInt();

			if(i!=0) {
				System.out.println("1 -Ver Produccion Mensual");
				System.out.println("2 -Crear Mercancia");
				System.out.println("3 -Ver Mercancia");
				System.out.println("4 -Ver Mercancias Importacion");
				System.out.println("5 -Flota ver datos");
				System.out.println("6 -Ver Productos demandados");
				System.out.println("7 -Ver Mercancia Flota");

				Scanner src2 = new Scanner(System.in);
				metodo= src.nextInt();

				switch (metodo) {
				case 1: 
					pais.verproduccionMensual();
					break;
				case 2:
					crearMercancias(pais);
					break;
				case 3: 
					pais.verMercancias();
					break;
				case 4:
					pais.verMercanciasImportacion();
					break;
				case 5: 
					pais.getFlota().datosAvanzados();
					break;
				case 6:
					pais.verProductosDemandados();
					break;
				case 7:
					pais.getFlota().verMercancias();
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + metodo);
				}
			}
		}while(i!=0);
		
	}
	
	public void crearMercancias(Reinos pais) throws Exception {
		int i;
		int producto;
		int cantidad;
		
		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Introduzca 0 para salir al menu anterior");
			i= src.nextInt();
			
			if(i!=0) {
				System.out.println("1 -Patata");
				System.out.println("2 -Tomate");
				System.out.println("3 -Cacao");
				System.out.println("4 -Maiz");
				System.out.println("5 -Trigo");
				System.out.println("6 -arroz");
				System.out.println("7 -Uvas");
				System.out.println("8 -Hierro");
				System.out.println("9 -Algodon");
				System.out.println("10 -Oro");
				System.out.println("11 -Plata");
				System.out.println("12 -Tabaco");
				System.out.println("13 -Cafe");

				Scanner src2 = new Scanner(System.in);
				producto= src.nextInt();
				
				Scanner src3 = new Scanner(System.in);
				System.out.println("Introduzca una cantidad");
				cantidad= src.nextInt();

				switch (producto) {
				case 1: 
					pais.crearMercancia(ProductoNombre.Patata, cantidad);
					break;
				case 2:
					pais.crearMercancia(ProductoNombre.Tomate, cantidad);
					break;
				case 3: 
					pais.crearMercancia(ProductoNombre.Cacao, cantidad);
					break;
				case 4:
					pais.crearMercancia(ProductoNombre.Maiz, cantidad);
					break;
				case 5: 
					pais.crearMercancia(ProductoNombre.Trigo, cantidad);
					break;
				case 6:
					pais.crearMercancia(ProductoNombre.Arroz, cantidad);
					break;
				case 7: 
					pais.crearMercancia(ProductoNombre.Uvas, cantidad);
					break;
				case 8:
					pais.crearMercancia(ProductoNombre.Hierro, cantidad);
					break;
				case 9: 
					pais.crearMercancia(ProductoNombre.Algodon, cantidad);
					break;
				case 10:
					pais.crearMercancia(ProductoNombre.Oro, cantidad);
					break;
				case 11: 
					pais.crearMercancia(ProductoNombre.Plata, cantidad);
					break;
				case 12:
					pais.crearMercancia(ProductoNombre.Tabaco, cantidad);
					break;
				case 13:
					pais.crearMercancia(ProductoNombre.Cafe, cantidad);
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + producto);
				}

			}
		}while(i!=0);
	}
	
	public void verMetodosReinoCompleto(ReinoCompleto espana) throws Exception {
		int i;
		int metodo ;

		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Introduzca 0 para salir");
			i= src.nextInt();
			if(i!=0) {
				System.out.println("1 -Formar flota");
				System.out.println("2 -Enviar flota");

				Scanner src2 = new Scanner(System.in);
				metodo= src.nextInt();

				switch (metodo) {
				case 1: 
					formarFlota(espana);
					break;
				case 2:
					enviarFlota(espana);
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + metodo);
				}

			}
		}while(i!=0);
	}
	
	public void formarFlota(ReinoCompleto espana) throws Exception {
		int i;
		int zona ;
		int id;

		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Introduzca 0 para salir");
			i= src.nextInt();
			if(i!=0) {
				System.out.println("-----Seleccione el pais donde quiere formar una flota----");
				System.out.println("1 -Nueva Espana");
				System.out.println("2 -Nueva Granada");
				System.out.println("3 -Peru");
				System.out.println("4 -Plata");
				System.out.println("5 -Castilla");
				System.out.println("6 -Aragon");
				System.out.println("7 -Austria");

				Scanner src2 = new Scanner(System.in);
				zona= src.nextInt();
				
				Scanner src3 = new Scanner(System.in);
				System.out.println("---Seleccione el id de la mercancia perteneciente a su zona----");
				id= src.nextInt();
				

				switch (zona) {
				case 1:
					espana.formarFlota(espana.getNuevaEspa�a(), id);
					break;
				case 2: 
					espana.formarFlota(espana.getNuevaGranda(), id);
					break;
				case 3:
					espana.formarFlota(espana.getPeru(), id);
					break;
				case 4: 
					espana.formarFlota(espana.getPlata(), id);
					break;
				case 5:
					espana.formarFlota(espana.getCastilla(), id);
					break;
				case 6:
					espana.formarFlota(espana.getAragon(), id);
					break;
				case 7:
					espana.formarFlota(espana.getAustria(), id);
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + zona);
				}
			}
		}while(i!=0);
	}
	
	public void enviarFlota(ReinoCompleto espana) throws Exception {
		int i;
		int zona1 ;
		int zona2;
		Reinos reino;

		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Introduzca 0 para salir");
			i= src.nextInt();
			if(i!=0) {
				System.out.println("-----Seleccione el pais del que quiere que salga una flota----");
				System.out.println("1 -Nueva Espana");
				System.out.println("2 -Nueva Granada");
				System.out.println("3 -Peru");
				System.out.println("4 -Plata");
				System.out.println("5 -Castilla");
				System.out.println("6 -Aragon");
				System.out.println("7 -Austria");

				Scanner src2 = new Scanner(System.in);
				zona1= src.nextInt();
				
				Scanner src3 = new Scanner(System.in);
				System.out.println("-----Seleccione el pais al que quiere vaya dicha flota anterior----");
				System.out.println("1 -Nueva Espana");
				System.out.println("2 -Nueva Granada");
				System.out.println("3 -Peru");
				System.out.println("4 -Plata");
				System.out.println("5 -Castilla");
				System.out.println("6 -Aragon");
				System.out.println("7 -Austria");
				zona2= src.nextInt();
				

				switch (zona1) {
				case 1:
					reino=espana.getNuevaEspa�a();
					break;
				case 2: 
					reino=espana.getNuevaGranda();
					break;
				case 3:
					reino=espana.getPeru();
					break;
				case 4: 
					reino=espana.getPlata();
					break;
				case 5:
					reino=espana.getCastilla();
					break;
				case 6:
					reino=espana.getAragon();
					break;
				case 7:
					reino=espana.getAustria();
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + zona1);
				}
				
				switch (zona2) {
				case 1:
					espana.enviarFlota(reino, espana.getNuevaEspa�a());
					break;
				case 2: 
					espana.enviarFlota(reino, espana.getNuevaGranda());
					break;
				case 3:
					espana.enviarFlota(reino, espana.getPeru());
					break;
				case 4: 
					espana.enviarFlota(reino, espana.getPlata());
					break;
				case 5:
					espana.enviarFlota(reino, espana.getCastilla());
					break;
				case 6:
					espana.enviarFlota(reino, espana.getAragon());
					break;
				case 7:
					espana.enviarFlota(reino, espana.getAustria());
					break;
				default:
					throw new IllegalArgumentException("valor no valido " + zona2);
				}
			}
		}while(i!=0);
	}
	
	
	public static void main(String[] args) throws Exception {

		NuevaEspa�a nuevaEspa�a = new NuevaEspa�a("Nueva Espa�a", "Ameriaca", 100);

		NuevaGranada nuevaGranada = new NuevaGranada("Nueva Granada", "America", 100);

		Peru peru= new Peru("Peru","America", 100);		

		Plata plata = new Plata("Plata","America", 100);


		Castilla castilla = new Castilla("Castilla","Europa", 100,  "Madrid");

		Aragon aragon = new Aragon("Aragon","Europa", 100, "Zaragoza");

		Borgo�a borgo�a = new Borgo�a("Flandes","Europa", 100, "Flandes");

		Austria austria = new Austria("Austria","Europa", 100, "Austria");

		ReinoCompleto espana = new ReinoCompleto(nuevaEspa�a, nuevaGranada, peru, plata, castilla, aragon, borgo�a, austria);

		
		
		//Prueba de consola
		
		Consola consol = new Consola(espana);
	}

}
