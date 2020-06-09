package examen.Ejercicio2;

import java.util.TreeSet;

public class Compuesto_quimico extends TreeSet<String> implements Comparable<Compuesto_quimico> {

	String nombre;
	


	public Compuesto_quimico(String nombre) {
		
		this.nombre = nombre;
	
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();

		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compuesto_quimico other = (Compuesto_quimico) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	
	

	public String getNombre() {
		return nombre;
	}






	@Override
	public int compareTo(Compuesto_quimico o) {
		// TODO Auto-generated method stub
		if(this.nombre.compareTo(o.getNombre())==1) {
			
			return 1;
		}else if (this.nombre.compareTo(o.getNombre())==-1) {
			return -1;
		}else {
			return 0;
		}
	}



	@Override
	public String toString() {
		return "Compuesto_quimico [nombre=" + nombre ;
	}
	
	
	
	
	
	
}
