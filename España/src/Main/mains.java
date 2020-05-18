package Main;

import Clases.Alimentos;
import Clases.MateriasPrimas;
import Clases.NuevaEspaña;
import Clases.ProductoNombre;

public class mains {

	public static void main(String[] args) throws Exception {
		
		Alimentos maiz = new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "Gramínea ", 0);

		Alimentos caco= new Alimentos(ProductoNombre.Cacao, 0, 0, 0, 0, "fruta", 0);
		
		Alimentos tomate = new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);
		
		MateriasPrimas oro= new MateriasPrimas(ProductoNombre.Oro, 0, 0, 0, 0, 0, 10);
		
		NuevaEspaña nueva = new NuevaEspaña("Nueva España", "Ameriaca", 100, maiz, caco, tomate, oro);
		
		System.out.println(nueva.verproduccionMensual());
		
		nueva.crearMercancia(ProductoNombre.Tomate, 100);
		
		nueva.crearMercancia(ProductoNombre.Cacao, 100);
		
		nueva.crearMercancia(ProductoNombre.Maiz, 100);
		
		System.out.println(nueva.verproduccionMensual());
		
		nueva.verMercancias();
		
		System.out.println(nueva.formarFlota(0));
		
		System.out.println(nueva.formarFlota(1));
		
		System.out.println(nueva.formarFlota(2));
		
		nueva.verMercancias();
		
		nueva.getFlota().verMercancias();
		
	}

}
