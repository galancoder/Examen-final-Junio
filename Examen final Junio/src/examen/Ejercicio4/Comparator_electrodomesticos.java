package examen.Ejercicio4;

import java.util.Comparator;


import examen.Ejercicio3.Electrodomesticos;

public class Comparator_electrodomesticos implements Comparator<Electrodomesticos> {

	@Override
	public int compare(Electrodomesticos A, Electrodomesticos B) {
		// TODO Auto-generated method stub
		
		if(A.getConsumo().compareTo(B.getConsumo())==1) {
			
			return 1;
			
		}else if(A.getConsumo().compareTo(B.getConsumo())==-1) {
			return -1;
			
		}else {
			
			if(A.getPrecio_final()>B.getPrecio_final()) {
				return 1;
			}else if(A.getPrecio_final()<B.getPrecio_final()) {
				return -1;
			}else {
				
				return 0;
			}
		}
		
		
		
	}

}
