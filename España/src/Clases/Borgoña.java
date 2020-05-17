package Clases;
import java.util.HashMap;

public class Borgoña extends Europa{

        private MateriasPrimas recoleccionHierro;
        private Alimentos recoleccionArroz;



        public Borgoña(String nombre,String continente, HashMap<Integer,Flota> flota,int poblacion,double dinero,String territorio,MateriasPrimas hierro,Alimentos arroz) throws Exception {
            super(nombre,continente, flota, poblacion, dinero ,territorio, 1566, 1147, 0, 1776, 9210);
            this.recoleccionHierro=hierro;
            calcularProduccionMensual(hierro);
            this.recoleccionArroz=arroz;
            calcularProduccionMensual(arroz);
        }

        public Borgoña(Borgoña a) {
            super(a);
            this.recoleccionArroz=a.getRecoleccionArroz();
            this.recoleccionHierro=a.getRecoleccionHierro();
        }
               
    	public String  verproduccionMensual() {
    		return "Produccion de : "+this.recoleccionHierro.toString() + "/ Produccion de de : "+ this.recoleccionArroz.toString();
    	}

        public MateriasPrimas getRecoleccionHierro() {
            return recoleccionHierro;
        }

        public void setRecoleccionHierro(MateriasPrimas recoleccionHierro) {
            this.recoleccionHierro = recoleccionHierro;
        }

        public Alimentos getRecoleccionArroz() {
            return recoleccionArroz;
        }

        public void setRecoleccionArroz(Alimentos recoleccionArroz) {
            this.recoleccionArroz = recoleccionArroz;
        }

		@Override
		public String toString() {
			return super.toString();
		}
    
        

}
