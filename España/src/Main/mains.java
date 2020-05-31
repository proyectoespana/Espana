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

		NuevaEspaña nuevaEspaña = new NuevaEspaña("Nueva España", "Ameriaca", 100);

		NuevaGranada nuevaGranada = new NuevaGranada("Nueva Granada", "America", 100);

		Peru peru= new Peru("Peru","America", 100);		

		Plata plata = new Plata("Plata","America", 100);


		Castilla castilla = new Castilla("Castilla","Europa", 100,  "Madrid");

		Aragon aragon = new Aragon("Aragon","Europa", 100, "Zaragoza");

		Borgoña borgoña = new Borgoña("Borgoña","Europa", 100, "Flandes");

		Austria austria = new Austria("Austria","Europa", 100, "Austria");

		ReinoCompleto espana = new ReinoCompleto(nuevaEspaña, nuevaGranada, peru, plata, castilla, aragon, borgoña, austria);
		
//		Prueba crearMercancia / flormar Flota de Nueva Granada

//		System.out.println(espana.getNuevaGranda().verproduccionMensual());
//
//		espana.getNuevaGranda().crearMercancia(ProductoNombre.Tabaco, 50);
//
//		espana.getNuevaGranda().crearMercancia(ProductoNombre.Oro, 10);
//
//		espana.getNuevaGranda().crearMercancia(ProductoNombre.Plata, 20);
//
//		espana.getNuevaGranda().verMercancias();
//
//		System.out.println(espana.getNuevaGranda().verproduccionMensual());
//
//		espana.formarFlota(nuevaGranada, 0);
//		espana.formarFlota(nuevaGranada, 1);
//		espana.formarFlota(nuevaGranada, 2);
//		
//		espana.getNuevaGranda().verMercancias();
//		//mercancia 0
//		espana.getNuevaGranda().getFlota().verMercancias();
//		//3 mercancias
//
//		espana.enviarFlota(nuevaGranada, peru);
//		
//		peru.verMercanciasImportacion();
////		mercancia tabaco, oro ,plata
//
//		espana.getNuevaGranda().getFlota().verMercancias();
//		//nada
//
//		System.out.println(espana.getNuevaGranda().getFlota().datosAvanzados());
		//disponible false

		//Prueba 2

//		System.out.println(espana.getPlata().verproduccionMensual());
//		
//		System.out.println(espana.getNuevaGranda().verproduccionMensual());
//
//		espana.getPlata().crearMercancia(ProductoNombre.Plata, 30);
//
//		espana.getPlata().crearMercancia(ProductoNombre.Tabaco, 100);
//
//		espana.getPlata().crearMercancia(ProductoNombre.Plata, 10);
//
//		espana.getPlata().verMercancias();
//
//		System.out.println(espana.getPlata().verproduccionMensual());
//
//		espana.formarFlota(plata, 0);
//		espana.formarFlota(plata, 1);
//		espana.formarFlota(plata, 2);
//
//		espana.enviarFlota(plata, peru);
//
//		espana.getPlata().getFlota().verMercancias();
//
//		System.out.println(espana.getPlata().getFlota().datosAvanzados());
//		
//		System.out.println(espana.getNuevaGranda().verproduccionMensual());
		
		espana.getPeru().crearMercancia(ProductoNombre.Oro, 5);
		
		espana.formarFlota(peru, 1);
		
		espana.enviarFlota(peru, borgoña);
		
		espana.getNuevaEspaña().verProductosDemandados();
		
		espana.getNuevaGranda().verProductosDemandados();
		
		espana.getPeru().verProductosDemandados();
		
		espana.getPlata().verProductosDemandados();
		
		espana.getCastilla().verProductosDemandados();
		
		espana.getAragon().verProductosDemandados();
		
		espana.getBorgoña().verProductosDemandados();
		
		espana.getAustria().verProductosDemandados();
	}

}
