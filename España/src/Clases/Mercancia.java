package Clases;
import java.util.Iterator;
import java.util.TreeMap;

public class Mercancia {

	private String nombre;
    private TreeMap<Integer,Productos>arrayProductos;
    private int totalkg;
    private boolean saqueo;
    private  Territorio destino;

    public Mercancia(String nombre,int totalkg) {
        this.nombre=nombre;
        this.arrayProductos= new TreeMap<Integer, Productos>();
        this.totalkg=totalkg;
        this.saqueo=false;
        this.destino=null;
    }
    
    public void verProductos() {
    	Iterator iterador = this.arrayProductos.keySet().iterator();
    	int id;
    	
    	while(iterador.hasNext()) {
    		id=(int) iterador.next();
    		
    		System.out.println("Mercancia numero "+id+" con contenido "+this.arrayProductos.get(id).toString());
    	}
    }
    
    public void enviarDestino(Territorio destino) {
    	
    }
    
    public void añadirProducto(Productos producto) {
    	this.arrayProductos.put(this.arrayProductos.size()+1, producto);
    	this.setTotalkg(this.totalkg-producto.getCantidad());
    }
 
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeMap<Integer, Productos> getArrayProductos() {
		return arrayProductos;
	}

	public void setArrayProductos(TreeMap<Integer, Productos> arrayProductos) {
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
        return "Merca nombre : "+nombre+" con un contenido disponible de "+totalkg+" kg y un contenido de "+arrayProductos.size()+" productos";
    }
	
}
