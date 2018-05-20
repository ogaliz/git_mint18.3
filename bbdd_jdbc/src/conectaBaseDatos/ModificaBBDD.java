package conectaBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {
		try {
			
			//1. tenemos que crear un objeto de tipo connection, hemos añadido un ajuste para anular la conexion segura SSL
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/videoclub?autoReconnect=true&useSSL=false","root","");
			
			//2. Crear objeto Statement, a través del objeto Conexion. 
			Statement miStatement = miConexion.createStatement();
			
			//Sentencia de insercion, recordar de utilizar comilla distinta para los tipos VARCHAR
			String instruccionSql = "insert into videoclub.PELICULA (CodiPeli, Titol) " + 
					"values (1001 , 'Pinocho')";
			
			//Sentencia de actualizacion
			String sentenciaUpdate = "UPDATE PELICULA SET CodiGenere = 3 "
					+ "where CodiPeli = 1001";
			
			String eliminaRegistro = "DELETE from PELICULA "
					+ "where CodiPeli = 1001";
			
			//Dejo comentada la instruccion de insercion y actualizacion
			//miStatement.executeUpdate(instruccionSql);
			
			//miStatement.executeUpdate(sentenciaUpdate);
			
			miStatement.executeUpdate(eliminaRegistro);
			
			System.out.println("Cambios eliminados correctamente.");
			
			
		} catch (Exception e) {
			
			System.out.println("La consulta no se ha realizado correctamente.");
			e.printStackTrace();
		}

	}//cierre del main

}
