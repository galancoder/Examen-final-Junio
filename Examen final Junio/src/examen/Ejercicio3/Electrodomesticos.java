package examen.Ejercicio3;

import java.io.Serializable;

public abstract class Electrodomesticos implements Comparable<Electrodomesticos>,Serializable {

	private float Precio_base=100;

	private color Color=color.BLANCO;
	
	private Consumo consumo;
	
	private float Peso=5;
	
	private float Precio_final;
	
	
	public Electrodomesticos(float precio_base, color color, Consumo consumo, float peso) {

		Precio_base = precio_base;
		Color = color;
		this.consumo = consumo;
		Peso = peso;
		setPrecio_final(consumo,peso);
	}
	
	public Electrodomesticos(float precio_base,float peso) {

		Precio_base = precio_base;
		Color = color.BLANCO;
		this.consumo = Consumo.F;
		Peso = peso;
		setPrecio_final(consumo,peso);
	}


	public float getPrecio_base() {
		return Precio_base;
	}


	public color getColor() {
		return Color;
	}


	public Consumo getConsumo() {
		return consumo;
	}


	public float getPeso() {
		return Peso;
	}


	public float getPrecio_final() {
		return Precio_final;
	}


	public void setPrecio_base(float precio_base) {
		Precio_base = precio_base;
	}


	public void setColor(color color) {
		Color = color;
	}


	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}


	public void setPeso(float peso) {
		Peso = peso;
	}


	public void setPrecio_final(Consumo c,float p) {
		float resultado = Precio_base;
		int porcentaje=0;
		
		if(p>80) {
			porcentaje=20;
		}else if (p<80 & p>49) {
			porcentaje=15;
		}else if(p<50 & p>19) {
			porcentaje=10;
		}else if (p<20 & p>=0) {
			porcentaje=5;
		}
		
		 this.Precio_final=this.Precio_base*(1+(0.3f-(c.ordinal()*0.05f))+(porcentaje/100f));
	}
	
	public void setPrecio_final(Consumo c,float p,Carga carga) {
		float resultado = Precio_base;
		int porcentaje=0;
		int porcentaje_carga=0;
		
		if(p>80) {
			porcentaje=20;
		}else if (p<80 & p>49) {
			porcentaje=15;
		}else if(p<50 & p>19) {
			porcentaje=10;
		}else if (p<20 & p>=0) {
			porcentaje=5;
		}
		
		if(carga.getCarga()>8) {
			porcentaje_carga=10;
		}
		
		 this.Precio_final=this.Precio_base*(1+(0.3f-(c.ordinal()*0.05f))+(porcentaje/100f)+(porcentaje_carga/100f));
	}



	@Override
	public String toString() {
		return  Precio_base + "-" + Color + "-" + consumo + "-"
				+ Peso + "-" + Precio_final + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Color == null) ? 0 : Color.hashCode());
		result = prime * result + Float.floatToIntBits(Peso);
		result = prime * result + Float.floatToIntBits(Precio_base);
		result = prime * result + Float.floatToIntBits(Precio_final);
		result = prime * result + ((consumo == null) ? 0 : consumo.hashCode());
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
		Electrodomesticos other = (Electrodomesticos) obj;
		if (Color != other.Color)
			return false;
		if (Float.floatToIntBits(Peso) != Float.floatToIntBits(other.Peso))
			return false;
		if (Float.floatToIntBits(Precio_base) != Float.floatToIntBits(other.Precio_base))
			return false;
		if (Float.floatToIntBits(Precio_final) != Float.floatToIntBits(other.Precio_final))
			return false;
		if (consumo != other.consumo)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Electrodomesticos o) {
		// TODO Auto-generated method stub
	
		String tipo_objeto_A=this.getClass().getSimpleName();
		String tipo_objeto_B=o.getClass().getSimpleName();
		
		if(tipo_objeto_A.compareTo(tipo_objeto_B)==1) {
			return 1;
			
		}else if(tipo_objeto_A.compareTo(tipo_objeto_B)==-1) {
			return -1;
			
		}else {
			
			if(this.getPrecio_final()>o.getPrecio_final()) {
				return 1;
			}else if(this.getPrecio_final()<o.getPrecio_final()) {
				return -1;
			}else {
				
				return 0;
			}
			
				
			
		}
		
		
	}

	

	
	
}
