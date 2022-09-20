package proyecto;

 
public class persona {
    private String usuario;
    private String contrasenia;
    private boolean importancia;
    //private Color preferencias;

    public persona() {
    }

    public persona(String usuario, String contrasenia, boolean importancia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.importancia = importancia;
      //  this.preferencias = preferencias;
    }

    public boolean isImportancia() {
        return importancia;
    }

    public void setImportancia(boolean importancia) {
        this.importancia = importancia;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

   // public Color getPreferencias() {
        //return preferencias;
   // }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

 //   public void setPreferencias(Color preferencias) {
    //   this.preferencias = preferencias;
   // }

    @Override
    public String toString() {
        return "persona{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + ", preferencias=" + '}';
    }
    
    
    
    
}
