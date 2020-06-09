package examen.Ejercicio3;

public class Lavadoras extends Electrodomesticos {

	Carga carga;

	public Lavadoras(float precio_base, float peso) {
		super(precio_base, peso);
		this.carga = Carga.CINCO;
		
	}
     
	public Lavadoras(float precio_base, color color, Consumo consumo, float peso, Carga carga) {
		super(precio_base, color, consumo, peso);
		this.carga = carga;
		super.setPrecio_final(consumo, peso, carga);
		
		
	}


		
		
	
	
	

	public Carga getCarga() {
		return carga;
	}


	public void setCarga(Carga carga) {
		this.carga = carga;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((carga == null) ? 0 : carga.hashCode());
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
		Lavadoras other = (Lavadoras) obj;
		if (carga != other.carga)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Lavadoras [carga=" +carga+" - " + super.toString();
	}
	
	
	
	
}
