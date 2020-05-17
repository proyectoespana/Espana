import java.util.ArrayList;

public class Mercancia {

	private String nombre;
    private ArrayList<String>arrayProductos;
    private int totalkg;
    private boolean saqueo;
    private  Territorio destino;

    public Mercancia(String nombre,ArrayList<String>arrayProductos,int totalkg, boolean saqueo,Territorio destino) {
        this.nombre=nombre;
        this.arrayProductos=arrayProductos;
        this.totalkg=totalkg;
        this.saqueo=saqueo;
        this.destino=destino;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getArrayProductos() {
        return arrayProductos;
    }

    public void setArrayProductos(ArrayList<String> arrayProductos) {
        this.arrayProductos = arrayProductos;
    }

    public int getTotalkg() {
        return totalkg;
    }

    public void setTotalkg(int totalkg) {
        this.totalkg = totalkg;
    }

    public boolean isSaqueo() {
        return saqueo;
    }

    public void setSaqueo(boolean saqueo) {
        this.saqueo = saqueo;
    }

    public Territorio getDestino() {
        return destino;
    }

    public void setDestino(Territorio destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Mercancia [nombre=" + nombre + ", arrayProductos=" + arrayProductos + ", totalkg=" + totalkg
                + ", saqueo=" + saqueo + ", destino=" + destino + "]";
    }
	
}
