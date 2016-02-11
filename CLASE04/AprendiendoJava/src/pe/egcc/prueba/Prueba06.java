package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Lista Generica
 * 
 * @author Gustavo Coronel
 */
public class Prueba06 {

  public static void main(String[] args) {
    List lista = new ArrayList<>();
    
    lista.add(456);
    lista.add(453.12);
    lista.add("Gustavo");
    lista.add(new Date());
    
    for (Object obj : lista) {
      System.out.println(obj);
    }
    
  }
  
}
