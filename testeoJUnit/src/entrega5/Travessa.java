package entrega5;

import java.io.*; 

public class Travessa {
		
	public static int[][] generarPartits(int numeroPartits){
    		int [][] matriu = new int[numeroPartits][2];
    		for(int p=0;p<numeroPartits;p++){
			matriu[p][0]=(int) (Math.random()*4);
			matriu[p][1]=(int) (Math.random()*4);
		}
		return matriu;
	}	
		
	public static String pintaJornada(int[][] partits){
		String cadena="{";
		for(int p=0;p<partits.length-1;p++){
			cadena+="{"+partits[p][0]+",";
			cadena+=partits[p][1]+"},";
		}
		cadena+="{"+partits[partits.length-1][0]+",";
		cadena+=partits[partits.length-1][1]+"}}";
		return cadena;
	}
	
    	public static int calcularVictoriesVisitants(int[][] partits){
		int victories=0;
		for(int p=0;p<partits.length;p++){
			if(partits[p][0]<=partits[p][1]){
			    victories++;
			}
		}	
		return victories;
    	}
    	
    	public static float mitjaGolsPartit(int[][] partits){
    		int gols=0;
    		for(int p=0;p<partits.length;p++){
    			if(partits[p][0]+partits[p][1] > 0){
    			    gols += partits[p][0]+partits[p][1]; 
    			}
    			else {
    				gols = 2;
    			}
    		}	
    		return gols/partits.length;
    }
    	
}



