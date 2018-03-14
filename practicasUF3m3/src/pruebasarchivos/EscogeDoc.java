package pruebasarchivos;

import javax.swing.JFileChooser;

public class EscogeDoc {

	public static void main(String[] args) {
		
		JFileChooser ruta = new JFileChooser();
		
		ruta.showOpenDialog(ruta);
		
		String path = ruta.getSelectedFile().getAbsolutePath();
		
		System.out.println(path);
		
		

	}

}
