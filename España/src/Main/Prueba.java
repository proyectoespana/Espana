package Main;

import java.util.LinkedHashMap;

public class Prueba {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lista = new LinkedHashMap<Integer, String>();
		
		LinkedHashMap<Integer, String>lista2= new LinkedHashMap<Integer, String>();
		
		
		lista.put(1, "primero");
		lista.put(2, "segundo");
		lista.put(3, "tercero");
		lista.put(4, "cuato");
		lista.put(5, "quinto");
		lista.put(6, "ultimo");
		
		lista2.putAll(lista);
	
		System.out.println(lista2.toString());
		
		lista2.clear();
		
		System.out.println(lista2.toString());
		
	}

}
