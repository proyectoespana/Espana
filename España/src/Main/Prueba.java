package Main;

import java.util.HashSet;

public class Prueba {

	public static void main(String[] args) {
		
		HashSet<String> ad= new HashSet<String>();
		HashSet<String> od= new HashSet<String>();
		
		od.add("asd");
		od.add("dasfg");
		
		ad.add("hola");
		ad.add(null);
		ad.add(null);
		ad.add(null);
		ad.add(null);

		
		ad.remove(null);
		od.addAll(ad);
		System.out.println(od.toString());
		

		boolean gs= true;
		
		if(!gs) {
			System.out.println("ofdas");
		}else {
			System.out.println("bien");
		}
		
		String [] hola = new String  [1];
		
		hola[0]=null;
		
		System.out.println(hola[0]);
		
		
		
	}

}
