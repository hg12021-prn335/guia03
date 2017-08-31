
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;



@LocalBean
@Dependent
public class Utilities {
    
  
    /**
     * Este metodo cuenta los primeros 30 caracteres y los junta para crear un resumen
     
      
     */
   public String getresumen(String resumen){
        
        return resumen.substring(0,20);
    }
    /**
     * Este metodo capitaliza el texto ya introducido quita dobles espacios y pone mayuscula la primera letra de cada palabra
    
     */
   public String capitalizar(String resumen){
       String nuevacadena="";
       for(String palabra : resumen.split(" ")){
          nuevacadena +=palabra.substring(0,1).toUpperCase()+palabra.substring(1,palabra.length()).toLowerCase()+" ";
       }
       nuevacadena = nuevacadena.trim();
       resumen=nuevacadena;
       return resumen;
   }
   
   /**
    * Este metodo cuenta la cantidad de veces que una palabra esta repetida en el texto
    
    */
   public int contarCoincidencias(String frase, String resumen){
       int posicion , contador=0;
       posicion=resumen.indexOf(frase);
       while(posicion!= -1 ){
           contador++;
           posicion=resumen.indexOf(frase,posicion+1);
       }
       return contador;
       
   }
        
      
}