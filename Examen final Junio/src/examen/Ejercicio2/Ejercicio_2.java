package examen.Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeSet;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      TreeSet<Compuesto_quimico> compuestos= new TreeSet();
	      
	      try {
	         
	         archivo = new File ("c:/quimicos.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         String linea;
	         
	         
	         while((linea=br.readLine())!=null) {
	        	 
	               String [] nombre_y_elementos=linea.split(":");
	               
	               Compuesto_quimico compuesto= new Compuesto_quimico(nombre_y_elementos[0]);
	               
	               compuestos.add(compuesto);
	        	    
	              
	         }
	           
     
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      
	      System.out.println(compuestos);
	}

}
