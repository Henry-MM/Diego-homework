 
package proyecto;

import java.util.Date;

 
 
public class tarea {
   
    private Date vencimiento;
    private boolean importante;
    private String asignado;
    private String contenido;
    private String nombre;

    public tarea() {
    }

    public tarea(  Date vencimiento, boolean importante, String asignado, String contenido, String nombre) {
      
        this.vencimiento = vencimiento;
        this.importante = importante;
        this.asignado = asignado;
        this.contenido = contenido;
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Date getVencimiento() {
        return vencimiento;
    }

    public boolean isImportante() {
        return importante;
    }

    public String getAsignado() {
        return asignado;
    }

    public String getContenido() {
        return contenido;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

   
    
    
    
}
