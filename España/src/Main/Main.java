package Main;

import java.util.HashMap;
import java.util.HashSet;

import Clases.*;

public class Main {
	
	public static Alimentos maiz;
	
	public static void crearReinoCompleto() {
			
	}

	public static void main(String[] args) throws Exception {

		HashMap<Integer,Flota> mercader = new HashMap<Integer, Flota>();

		Mercancia importacion;

		Mercancia exportacion;

		//alimentos

		Alimentos maiz = new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "Gram�nea ", 0);

		Alimentos caco= new Alimentos(ProductoNombre.Cacao, 0, 0, 0, 0, "fruta", 0);

		Alimentos tomate = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);

		Alimentos patata= new Alimentos(ProductoNombre.Patata, 0, 0, 0, 0, "tub�rculo", 0);

		Alimentos arroz = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "gram�neas", 0);

		Alimentos uvas = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);

		Alimentos trigo = new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "cereal", 0);

		//fin alimentos

		//materias primas

		MateriasPrimas oro= new MateriasPrimas(ProductoNombre.Oro, 0, 0, 0, 0, 0, 10);

//		System.out.println(oro.toString());
//
//		System.out.println(oro.verDatosAvanzados());

		MateriasPrimas hierro = new MateriasPrimas(ProductoNombre.Hierro, 0, 0, 0, 0, 0, 10);

		MateriasPrimas algodon = new MateriasPrimas(ProductoNombre.Algodon, 0, 0, 0, 0, 0, 10);

		MateriasPrimas Mplata = new MateriasPrimas(ProductoNombre.Plata, 0, 0, 0, 0, 0, 10);

		MateriasPrimas tabaco = new MateriasPrimas(ProductoNombre.Tabaco, 0, 0, 0, 0, 0, 10);

		MateriasPrimas cafe = new MateriasPrimas(ProductoNombre.Cafe, 0, 0, 0, 0, 0, 10);

		//fin materias primas

		NuevaEspa�a nuevaEspa�a = new NuevaEspa�a("Nueva Espa�a","America", mercader, 6000000 ,0,maiz,caco,tomate,oro);
		
		System.out.println(nuevaEspa�a.verproduccionMensual());
		
		nuevaEspa�a.crearMercancia(ProductoNombre.Maiz, 5000, "maizMercancia", 20000);
		
		nuevaEspa�a.crearMercancia(ProductoNombre.Tomate, 2000, "tomate", 10000);
		
		nuevaEspa�a.crearMercancia(ProductoNombre.Oro, 10, 0);
		
		nuevaEspa�a.crearMercancia(ProductoNombre.Cacao, 1000, 1);
		
		nuevaEspa�a.verMercancias();
		
		System.out.println(nuevaEspa�a.verproduccionMensual());

		NuevaGranada nuevaGranda = new NuevaGranada("Nueva Granada","America", mercader, 2240054, 0,oro,Mplata,tabaco,cafe);

		Peru peru= new Peru("Peru","America", mercader, 1600000,0,oro,maiz,tomate,patata);		

		Plata plata = new Plata("Plata","America", mercader, 7000000, 0,Mplata,tabaco,cafe,patata);



		Castilla castilla = new Castilla("Castilla","Europa", mercader, 4200000,0,  "Madrid",trigo,uvas,hierro );

		Aragon aragon = new Aragon("Aragon","Europa", mercader, 1850000, 0, "Zaragoza",trigo,uvas);

		Borgo�a borgo�a = new Borgo�a("Flandes","Europa", mercader, 2050000,0, "Flandes",hierro,arroz);

		Austria austria = new Austria("Austria","Europa", mercader, 4050000,0, "Austria",hierro,algodon,arroz);



		ReinoCompleto espa�a= new ReinoCompleto(nuevaEspa�a, nuevaGranda, peru, plata, castilla, aragon, borgo�a, austria);

		//		System.out.println(espa�a.toString());

	}

}
