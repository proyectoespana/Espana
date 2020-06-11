package Pruebas;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Clases.Alimentos;
import Clases.Borgo�a;
import Clases.Flota;
import Clases.Mercancia;
import Clases.ProductoNombre;
import Clases.Reinos;
import Main.ReinoCompleto;

@RunWith(Parameterized.class)
public class PruebaEnviarFlotaParametrizada {
	private ReinoCompleto espana;
	private Alimentos alimento;
	private Reinos pais;
	private ProductoNombre nombre;
	private  LinkedHashMap <Integer,Mercancia> importacion;
	private int cantidad;

/**
 * Busco comprobar si con el m�todo "enviarFlota" haga que todas las mercanc�as metidas en un barco, se env�en al atributo "importacionMercancias" del Pa�s seleccionado
 * @param paiss nombre del pa�s al que quiero importar una o varias mercanc�as
 * @param name nombre del producto que quiero enviar
 * @param cantida cantidad del producto que quiero enviar
 * @param send La lista de mercanc�as impotadas que quiero comparar con las del pa�s seleccionado
 * @throws Exception
 */
	public PruebaEnviarFlotaParametrizada(Reinos paiss,ProductoNombre name,int cantida,LinkedHashMap <Integer,Mercancia> send) throws Exception {
		this.pais=paiss;
		this.nombre=name;
		this.cantidad=cantida;
		this.importacion=send;
		espana= new ReinoCompleto();
		espana.getAragon().getRecoleccionArroz().setCantidad(1000);
		espana.getAragon().getRecoleccionMaiz().setCantidad(1000);
		espana.getAragon().getRecoleccionTrigo().setCantidad(1000);
		espana.getAragon().getRecoleccionUvas().setCantidad(1000);	
	}

	@Parameters
	public static Iterable<Object[]>resul() throws Exception{
		LinkedHashMap <Integer,Mercancia> send= new LinkedHashMap<Integer, Mercancia>();
		Mercancia merca =new Mercancia("Mercancia Arroz", "Aragon");
		Alimentos ali=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "X", 0);
		ali.setCantidad(500);
		merca.a�adirProducto(ali);
		send.put(1, merca);

		LinkedHashMap <Integer,Mercancia> send2= new LinkedHashMap<Integer, Mercancia>();
		Mercancia merca2 =new Mercancia("Mercancia Maiz", "Aragon");
		Alimentos ali2=new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "X", 0);
		ali2.setCantidad(600);
		merca2.a�adirProducto(ali2);
		send2.put(1, merca2);

		LinkedHashMap <Integer,Mercancia> send3= new LinkedHashMap<Integer, Mercancia>();
		Mercancia merca3 =new Mercancia("Mercancia Trigo", "Aragon");
		Alimentos ali3=new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "X", 0);
		ali3.setCantidad(800);
		merca3.a�adirProducto(ali3);
		send3.put(1, merca3);
		
		return Arrays.asList(new Object [][] {{(new Borgo�a("Borgo�a", "Europa", 100, "Europa")),ProductoNombre.Arroz,500,send},{(new Borgo�a("Borgo�a", "Europa", 100, "Europa")),ProductoNombre.Maiz,600,send2},{(new Borgo�a("Borgo�a", "Europa", 100, "Europa")),ProductoNombre.Trigo,800,send3}});
	}


	@Test
	public void CrearMercanciaPara() throws Exception {

		this.espana.getAragon().crearMercancia(this.nombre, this.cantidad);
		
		espana.formarFlota(espana.getAragon(), 1);
		
		espana.enviarFlota(espana.getAragon(),this.pais);
		
		assertEquals(this.pais.getImportacionMercancia(), this.importacion);
	}

}
