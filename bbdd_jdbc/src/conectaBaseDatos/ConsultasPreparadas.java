package conectaBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		
		
		try {
			
			//1. Crear la conexion con la BBDD
			Connection miConexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/videoclub?autoReconnect=true&useSSL=false","root","");
			
			//2. Preparar consulta
			java.sql.PreparedStatement miSentencia = miConexion.prepareStatement("select Nom from ACTOR "
					+ "where CodiActor = ?");
			
			//3. Establecer parametros de consulta con los metodos de la interfaz
			miSentencia.setInt(1, 2);
			
			//4. Ejecutar, recorrer y cerrar la consulta.
			ResultSet rs = miSentencia.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			rs.close();
			
			//Reutilizamos la consulta preparada.
			System.out.println("Segunda consulta a continuación:\n");
			
			//Ahora pedimos el nombre del cliente con codigo 3
			miSentencia.setInt(1, 3);
			
			rs = miSentencia.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			rs.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
