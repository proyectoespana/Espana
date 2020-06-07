package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.ProductoNombre;

public class IntroducirDatos {
	
	private static String bd = "XE";
	private static String login="españa";
	private static String password="españa";
	private static Statement st;
	private static ResultSet rs;
	
	private static String url="jdbc:oracle:thin:@localhost:1521:"+bd;
	static Connection connection=null;
	
	public static void conectar() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url,login,password);
			if(connection!=null) {
				System.out.println("Conexion realizada correctamente");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertarDatosProduccion(int turno, String zona, String productoNombre, int produccionTotal, int consumoInterno, int excedente) throws SQLException {

        PreparedStatement ps = connection.prepareStatement("INSERT INTO PRODUCCION_ANUAL (TURNO, ZONA, NOMBRE_PRODUCTO, PRODUCCION_TOTAL, CONSUMO_INTERNO, EXCEDENTE) VALUES (?, ?, ?, ?, ?, ?)");

        ps.setInt(1, turno);
        ps.setString(2, zona);
        ps.setString(3, productoNombre);
        ps.setInt(4, produccionTotal);
        ps.setInt(5, consumoInterno);
        ps.setInt(6, excedente);
        ps.executeUpdate();

        ps.close();
//        cerrar();
    }
	
	public static void insertarDatosMercancias(String codigo_pais, String nombreProducto, int pesoMercancia, int turno, String zona) throws SQLException {
		
        PreparedStatement ps = connection.prepareStatement("INSERT INTO MERCANCIAS (COD_PAIS, NOMBRE_PRODUCTO, PESO, TURNO, ZONA) VALUES (?, ?, ?, ?, ?)");

        ps.setString(1, codigo_pais);
        ps.setString(2, nombreProducto);
        ps.setInt(3, pesoMercancia);
        ps.setInt(4, turno);
        ps.setString(5, zona);
        ps.executeUpdate();

        ps.close();
//        cerrar();
    }
	
	public static void insertarImportaciones(String id_mercancia, String origen, String destino, int turno) throws SQLException {
		
        PreparedStatement ps = connection.prepareStatement("INSERT INTO IMPORTACIONES (ID_MERCANCIA, ORIGEN, DESTINO, TURNO) VALUES (?, ?, ?, ?)");

        ps.setString(1, id_mercancia);
        ps.setString(2, origen);
        ps.setString(3, destino);
        ps.setInt(4, turno);
        ps.executeUpdate();

        ps.close();
//        cerrar();
    }
	
	public static void borrar() throws SQLException{
		st=connection.createStatement();
		st.executeUpdate("DELETE FROM PRODUCCION_ANUAL");
		st.executeUpdate("DELETE FROM MERCANCIAS");
		st.executeUpdate("DELETE FROM IMPORTACIONES");
	}
	
	public static void cerrar() throws SQLException {
		
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(connection!=null)
			connection.close();
	}


}
