package Main;

import Clases.Alimentos;
import Clases.Aragon;
import Clases.Austria;
import Clases.Borgoña;
import Clases.Castilla;
import Clases.MateriasPrimas;
import Clases.NuevaEspaña;
import Clases.NuevaGranada;
import Clases.Peru;
import Clases.Plata;
import Clases.ProductoNombre;
import Clases.Reinos;

public class mains {

	public static void main(String[] args) throws Exception {

		Alimentos maiz = new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "Gramínea ", 0);

		Alimentos caco= new Alimentos(ProductoNombre.Cacao, 0, 0, 0, 0, "fruta", 0);

		Alimentos tomate = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);

		Alimentos patata= new Alimentos(ProductoNombre.Patata, 0, 0, 0, 0, "tubérculo", 0);

		Alimentos arroz = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "gramíneas", 0);

		Alimentos uvas = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);

		Alimentos trigo = new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "cereal", 0);


		MateriasPrimas oro= new MateriasPrimas(ProductoNombre.Oro, 0, 0, 0, 0, 0, 10);

		MateriasPrimas hierro = new MateriasPrimas(ProductoNombre.Hierro, 0, 0, 0, 0, 0, 10);

		MateriasPrimas algodon = new MateriasPrimas(ProductoNombre.Algodon, 0, 0, 0, 0, 0, 10);

		MateriasPrimas Mplata = new MateriasPrimas(ProductoNombre.Plata, 0, 0, 0, 0, 0, 10);

		MateriasPrimas tabaco = new MateriasPrimas(ProductoNombre.Tabaco, 0, 0, 0, 0, 0, 10);

		MateriasPrimas cafe = new MateriasPrimas(ProductoNombre.Cafe, 0, 0, 0, 0, 0, 10);

		NuevaEspaña nuevaEspaña = new NuevaEspaña("Nueva España", "Ameriaca", 100, maiz, caco, tomate, oro);

		NuevaGranada nuevaGranada = new NuevaGranada("Nueva Granada", "America", 100, oro, Mplata, tabaco, cafe);

		Peru peru= new Peru("Peru","America", 100,oro,maiz,tomate,patata);		

		Plata plata = new Plata("Plata","America", 100,Mplata,tabaco,cafe,patata);


		Castilla castilla = new Castilla("Castilla","Europa", 100,  "Madrid",trigo,uvas,hierro );

		Aragon aragon = new Aragon("Aragon","Europa", 100, "Zaragoza",trigo,uvas);

		Borgoña borgoña = new Borgoña("Flandes","Europa", 100, "Flandes",hierro,arroz);

		Austria austria = new Austria("Austria","Europa", 100, "Austria",hierro,algodon,arroz);

		ReinoCompleto espana = new ReinoCompleto(nuevaEspaña, nuevaGranada, peru, plata, castilla, aragon, borgoña, austria);

		//Prueba crearMercancia / flormar Flota de Nueva Granada

		System.out.println(espana.getNuevaGranda().verproduccionMensual());

		espana.getNuevaGranda().crearMercancia(ProductoNombre.Tabaco, 50);

		espana.getNuevaGranda().crearMercancia(ProductoNombre.Oro, 10);

		espana.getNuevaGranda().crearMercancia(ProductoNombre.Plata, 20);

		espana.getNuevaGranda().verMercancias();

		System.out.println(espana.getNuevaGranda().verproduccionMensual());

		espana.formarFlota(nuevaGranada, 0);
		espana.formarFlota(nuevaGranada, 1);
		espana.formarFlota(nuevaGranada, 2);

		espana.enviarFlota(nuevaGranada, "peru");

		espana.getNuevaGranda().getFlota().verMercancias();

		System.out.println(espana.getNuevaGranda().getFlota().datosAvanzados());


		//Prueba 2

		System.out.println(espana.getPlata().verproduccionMensual());
		
		System.out.println(espana.getNuevaGranda().verproduccionMensual());

		espana.getPlata().crearMercancia(ProductoNombre.Plata, 30);

		espana.getPlata().crearMercancia(ProductoNombre.Tabaco, 100);

		espana.getPlata().crearMercancia(ProductoNombre.Plata, 10);

		espana.getPlata().verMercancias();

		System.out.println(espana.getPlata().verproduccionMensual());

		espana.formarFlota(plata, 0);
		espana.formarFlota(plata, 1);
		espana.formarFlota(plata, 2);

		espana.enviarFlota(plata, "peru");

		espana.getPlata().getFlota().verMercancias();

		System.out.println(espana.getPlata().getFlota().datosAvanzados());
		
		System.out.println(espana.getNuevaGranda().verproduccionMensual());
	}

}
