package prac1ejercicio2;

public class Hora implements Relacions{

	public int hores, minuts, segons;
	
	public Hora(int hores, int minuts, int segons) {
		super();
		this.hores = hores;
		this.minuts = minuts;
		this.segons = segons;
	}

	@Override
	public boolean esMajor(Object b) {
	Hora auxiliar = (Hora)b;
	boolean esMayor;
		if(this.hores >= auxiliar.hores) {
			esMayor = true;
			if(this.minuts > auxiliar.minuts) {
				esMayor = true;
				if(this.segons > auxiliar.segons) {					
					esMayor = true;	
				}
			}
		}else {
			esMayor = false;
		}
		return esMayor;
	}//--------------------------------------------

	@Override
	public boolean esMenor(Object b) {
		Hora auxiliar = (Hora)b;
		if(this.hores < auxiliar.hores) {
			return true;
		}
		return false;
	}

	@Override
	public boolean esIgual(Object b) {
		Hora auxiliar=(Hora)b;
		if(this.hores == auxiliar.hores) {
			return true;		
		}				
		return false;
	}
}
