package Main;

import Clases.Alimentos;
import Clases.Aragon;
import Clases.Austria;
import Clases.Borgo�a;
import Clases.Castilla;
import Clases.MateriasPrimas;
import Clases.NuevaEspa�a;
import Clases.NuevaGranada;
import Clases.Peru;
import Clases.Plata;
import Clases.ProductoNombre;
import Clases.Reinos;

public class mains {

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
