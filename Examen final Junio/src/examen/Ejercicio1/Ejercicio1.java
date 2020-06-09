package examen.Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Map<String,List<String>>> datos = new HashMap<String, Map<String, List<String>>>();
		
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      try {
	         
	         archivo = new File ("c:/log.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         String linea;
	         
	         
	         while((linea=br.readLine())!=null) {
	        	 
	        	 String[] ip_mensaje_usuario=linea.split(";");
	        	 
	        	 String[] extraccion_usuario=ip_mensaje_usuario[2].split("=");
	        	 
	        	 String[] extraccion_ip=ip_mensaje_usuario[0].split("=");
	        	 
	        	 String[] extraccion_mensaje=ip_mensaje_usuario[1].split("=");
	        	 
	        	 String usuario=extraccion_usuario[1];
	        	 
	        	 String ip=extraccion_ip[1];
	        	 
	        	 String mensaje=extraccion_mensaje[1];
	        	 
	        	 //AÑADO LOS DATOS AL MAPA Y AL SUBMAPA
	        	 
	        	 datos.put(usuario, new HashMap<String,List<String>>());
	        	 
	        	 
	        	 datos.get(usuario).put(ip, new ArrayList<String>());
	        	 
	        	 datos.get(usuario).get(ip).add(mensaje);
	        	 
	            
	        	 
	        	
	        	
	        	
	        	 
	         }
	           
	        	 
	         
	         
	         System.out.println(datos);
        	  
	         
	         
	         
	         
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

		
		
		
		
		
	}

}
