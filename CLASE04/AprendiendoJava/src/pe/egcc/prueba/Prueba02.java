package pe.egcc.prueba;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    int notas[];
    notas = new int[5];
    
    // Recorrido indexado
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }
    System.out.println("------------------");
    
    notas[3] = 600;
    // Recorrido tipo colección
    for (int nota : notas) {
      System.out.println(nota);
    }
    System.out.println("------------------");
    
    
    notas[1] = notas[3] / 3;
    // Recorrido unsando lambda
    Arrays.stream(notas).forEach(n -> System.out.println(n));
    System.out.println("------------------");
    
  }
  
}
