package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de Map
 * @author Gustavo Coronel
 */
public class Prueba08 {
  
  public static void main(String[] args) {
    Map<String,Object> datos = new HashMap<>();
    
    datos.put("001", "Gustavo Coronel");
    datos.put("002", "Claudia Ramos");
    datos.put("003", "Hugo Valencia");
    datos.put("004", "Laura Torres");
    datos.put("005", "Andrea Silva");
    
    for (String key : datos.keySet()) {
      System.out.println(key + " | " +datos.get(key));
    }
    
    System.out.println("-------------------");
    datos.put("002", "Karla Torres");
    for (String key : datos.keySet()) {
      System.out.println(key + " | " +datos.get(key));
    }
    
  }
}
