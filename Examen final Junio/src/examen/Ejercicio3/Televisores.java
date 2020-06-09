package examen.Ejercicio3;

public class Televisores extends Electrodomesticos{

	float tamaño;
	
	Sintonizador sintonizador;

	
	public Televisores(float precio_base, color color, Consumo consumo, float peso, float tamaño,
			Sintonizador sintonizador) {
		super(precio_base, color, consumo, peso);
		this.tamaño = tamaño;
		this.sintonizador = sintonizador;
	}

	public Televisores(float precio_base, float peso) {
		super(precio_base, peso);
		tamaño=20;
		sintonizador=Sintonizador.SINTONIZADOR_A;
		
		
		
		
	}

	public float getTamaño() {
		return tamaño;
	}

	public Sintonizador getSintonizador() {
		return sintonizador;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	public void setSintonizador(Sintonizador sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sintonizador == null) ? 0 : sintonizador.hashCode());
		result = prime * result + Float.floatToIntBits(tamaño);
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
		Televisores other = (Televisores) obj;
		if (sintonizador != other.sintonizador)
			return false;
		if (Float.floatToIntBits(tamaño) != Float.floatToIntBits(other.tamaño))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Televisores [tamaño=" + tamaño + ", sintonizador=" + sintonizador + super.toString();
	}
	
	
}
