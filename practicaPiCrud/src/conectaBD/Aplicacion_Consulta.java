	package conectaBD;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Aplicacion_Consulta {
	
	public static void main(String[] args) {
		
		JFrame mimarco=new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		secciones=new JComboBox();
		
		secciones.setEditable(false);
		
		secciones.addItem("Todos");
		
		paises=new JComboBox();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(secciones);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		add(botonConsulta, BorderLayout.SOUTH);
		
	
		
		try {
			
			//1. tenemos que crear un objeto de tipo connection
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/jardineria?autoReconnect=true&useSSL=false","root","");
			//2. Crear objeto Statement, a través del objeto Conexion. 
			Statement sentencia = miConexion.createStatement();
			
			//construir la sentencia SQL que nos permita extraer los datos de la BBDD
			String consulta = "select distinct NombreCliente from Clientes";
			
			//Construye el result set para ir leyendo lo que nos devuelve la consulta, esto es como un Buffer.
			ResultSet rs = sentencia.executeQuery(consulta);
			
			//Recorrremos el resultset registro a registro para que lo incluya en el comboBox.
			while (rs.next()) {
				
				secciones.addItem(rs.getString(1));
			}
			//cerramos el bufferr de tipo resultSet.
			rs.close();
			
			//CARGAMOS AHORA LOS REGISTROS AL OTRO JCOMBOBOX
			
			consulta = "select distinct Pais from Clientes";
						
			rs = sentencia.executeQuery(consulta);
					
			while (rs.next()) {
				
				paises.addItem(rs.getString(1));
			}
			rs.close();
			
		}catch(Exception e){
			
			System.out.println("Problemas con la conexion a la base de datos");
			
		}
		
}	
	
	private JComboBox secciones;
	
	private JComboBox paises;
	
	private JTextArea resultado;	
	
	
}