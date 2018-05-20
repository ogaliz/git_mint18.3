package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;



public class Cliente {

	public static void main(String[] args) {
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto miEvento = new EnviaTexto();
		miboton.addActionListener(miEvento);
		
		add(miboton);			
	}
	
	private class EnviaTexto implements ActionListener{

		//Vamos a crear un Socket dentro de la accion ActionPerformed, para que al pulsar el boton, envie el contenido
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//En este bloque del try preparamos la aplicacion de cliente para que mande los datos
			try {
				Socket miSocket = new Socket("192.168.1.8", 9999);
				
				//Creamos un flujo de salida de datos
				DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
				
				flujoSalida.writeUTF(campo1.getText());
				
				flujoSalida.close();
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			} catch (IOException e1) {
				
				System.out.println(e1.getMessage());
			}
				
		}		
				
	}

	private JTextField campo1;
	
	private JButton miboton;
	
}