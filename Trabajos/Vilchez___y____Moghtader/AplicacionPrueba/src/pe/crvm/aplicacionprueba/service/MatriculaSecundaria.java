
package pe.crvm.aplicacionprueba.service;

/**
 *
 * @author Carlos
 */
public class MatriculaSecundaria extends MatriculaAbstract{
    
    public String codP="S00";
    
   
    static int cuenta =1;

    public MatriculaSecundaria() {
        super(null, null, 0, null, null, 0, null, null);
        this.codP += cuenta++;
        
    }
    
    

    public MatriculaSecundaria(String Nombre, String Apellidos, int DNI, String Fecha, String Direccion, int Telefono, String Grado, String Seccion) {
        super(Nombre, Apellidos, DNI, Fecha, Direccion, Telefono, Grado, Seccion);
        this.codP += cuenta++;
        
    }

    @Override
    protected double Pago() {
        return COSTO_SECUNDARIA;
    }

    @Override
    protected double Descuento() {
        return COSTO_SECUNDARIA*DSC_SECUNDARIA;
    }

    @Override
    protected double PagoTotal() {
        return COSTO_SECUNDARIA-Descuento();
    }

    
    @Override
    public String toString (){
        String cad="\n=========INICIO DATOS========="+"\n Codigo: "+codP+"\n Nombre: "+Nombre+"\n Apellidos: "+Apellidos+"\n DNI: "+DNI+"\n Fecha: "+Fecha
                +"\n Dirrecion: "+Direccion+"\n Telefono: "+Telefono+"\n Grado: "+Grado+"\n Seccion: "+Seccion
                +"\n Pago: "+Pago()+"\n Descuento: "+Descuento()+"\n Pago Total: "+PagoTotal()+"\n =========FIN DATOS=========";
        return cad;
    } 
}
