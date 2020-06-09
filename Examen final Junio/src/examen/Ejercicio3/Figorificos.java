package examen.Ejercicio3;

public class Figorificos extends Electrodomesticos {

	boolean Froost=false;



	public Figorificos(float precio_base, color color, Consumo consumo, float peso, boolean froost) {
		super(precio_base, color, consumo, peso);
		Froost = froost;
	}
	
	public Figorificos(float precio_base, float peso) {
		super(precio_base,  peso);
		Froost = false;
	}

	public boolean isFroost() {
		return Froost;
	}

	public void setFroost(boolean froost) {
		Froost = froost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Froost ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figorificos other = (Figorificos) obj;
		if (Froost != other.Froost)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Figorificos [" + Froost +super.toString();
	}
	
	
}
