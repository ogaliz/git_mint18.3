package aplicaciones;
/**
 * Este server tiene que recibir los datos y a la vez permanecer a la escucha del puerto que le 
 * especificamos en el lado cliente.
 * Para hacer estas dos cosas a la vez, deberemos utilizar threads.
 * */
import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		//Creamos un hilo
		Thread miHilo = new Thread(this);
		
		miHilo.start();
		
	}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		
		try {
			//1. Ponemos el servidor a la escucha
			ServerSocket servidor = new ServerSocket(9999);
			
			while(true) {
			
				//2. que acepte las conexiones que le vengan del exterior.
				Socket miSocket = servidor.accept();
				
				//3. Crear un flujo de entrada de datos
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				
				//4. Leemos el flujo de entrada
				String mensaje = flujoEntrada.readUTF();
				
				areatexto.append("\n "+ mensaje);
				
				flujoEntrada.close();
			
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
