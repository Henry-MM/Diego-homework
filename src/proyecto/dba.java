/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dba {
    private String base_datos;
    private Connection dbcon;
    public Statement query;
    
    public dba(String base_datos){
        this.base_datos=base_datos;
    }

    public void setBase_datos(String base_datos) {
        this.base_datos = base_datos;
    }        
    
   public void conectar(){
        try {
            String driver = "jdbc:ucanaccess://";
            dbcon = DriverManager.getConnection(driver+base_datos,"","");
            query = dbcon.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void desconectar() {
        try {
            query.close();
            dbcon.close();
        } catch (Exception e) {
        }
    }
   
   public void commit(){
       try{
           dbcon.commit();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
    
    
}
