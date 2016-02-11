package pe.egcc.prueba;

import pe.egcc.espec.IDemo2;
import pe.egcc.espec.IDemo3;
import pe.egcc.espec.IDemo4;
import pe.egcc.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    MateService v_m = new MateService();
    IDemo3 v_n = v_m;
    IDemo4 v_p = v_m;
    IDemo2 v_q = v_m;
    
    
  }
  
}
