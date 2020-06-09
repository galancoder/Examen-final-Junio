package examen.Ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


import examen.Ejercicio3.Carga;
import examen.Ejercicio3.Consumo;
import examen.Ejercicio3.Electrodomesticos;
import examen.Ejercicio3.Figorificos;
import examen.Ejercicio3.Lavadoras;
import examen.Ejercicio3.Televisores;
import examen.Ejercicio3.color;



public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Electrodomesticos> coleccion= new ArrayList();
		
		Electrodomesticos lavadora= new Lavadoras (2000,color.BLANCO,Consumo.C,400,Carga.CUATRO);
		
		Electrodomesticos lavadora_2= new Lavadoras (3000,color.BLANCO,Consumo.C,400,Carga.CUATRO);
		
		Electrodomesticos frigorifico= new Figorificos(200, color.NEGRO, Consumo.C, 50, true);
		
		Electrodomesticos televisor= new Televisores (300,  12);
		
	
		coleccion.add(lavadora);
		coleccion.add(frigorifico);
		coleccion.add(televisor);
		coleccion.add(lavadora_2);
		
		Collections.sort(coleccion);
		
		System.out.println(coleccion);

        //ESCRIBIMOS FICHERO DE TEXTO CON CONTENIDO DE ARRAYLIST
		
		PrintWriter flujo_escritura=null;
		
		 try {
				flujo_escritura= new PrintWriter(new FileWriter("c:/ELECTRODOMESTICOS.txt",true));
				
				for (Electrodomesticos p:coleccion) {
					
					flujo_escritura.println(p.toString());  
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				flujo_escritura.close();
			}
			 
		
		//ORDENAMOS CON UN COMPARATOR
		 
		 List<Electrodomesticos> coleccion_ordenada_comparator=coleccion;
		
		Collections.sort(coleccion_ordenada_comparator, new Comparator_electrodomesticos());
		
		//ESCBRIBIMOS EN UN FICHERO LOS OBJETOS DEL ARRAYLIST
		
		ObjectOutputStream flujo_salida=null;
		 
		 try {
			flujo_salida= new ObjectOutputStream(new FileOutputStream(new File("c:/Electrodomesticos_ordenados_comparator.txt")));
			
			Iterator<Electrodomesticos> i=coleccion_ordenada_comparator.iterator();
			
			while(i.hasNext()) {
				
				Electrodomesticos objeto=i.next();
				
				
				flujo_salida.writeObject(objeto);
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(flujo_salida!=null) {
				
				try {
					flujo_salida.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
