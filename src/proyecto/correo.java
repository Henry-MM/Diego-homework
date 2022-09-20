 
package proyecto;

import java.util.ArrayList;


public class correo {
    private String titulo;
    private String contenido;
    private boolean leido;
    private String localizar;
    private String usuario;
    private ArrayList<String> enviado = new ArrayList();

    public correo() {
    }

    public correo(String titulo, String contenido, boolean leido, String localizar, String usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.leido = leido;
        this.localizar = localizar;
        this.usuario = usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEnviado(ArrayList<String> enviado) {
        this.enviado = enviado;
    }

    public String getUsuario() {
        return usuario;
    }

    public ArrayList<String> getEnviado() {
        return enviado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean isLeido() {
        return leido;
    }

    public String getLocalizar() {
        return localizar;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public void setLocalizar(String localizar) {
        this.localizar = localizar;
    }

    @Override
    public String toString() {
        return "correo{" + "titulo=" + titulo + ", contenido=" + contenido + ", leido=" + leido + ", localizar=" + localizar + '}';
    }
    
    
    
    
}
