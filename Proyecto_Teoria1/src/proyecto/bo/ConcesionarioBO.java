/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import proyecto.dao.ConcesionarioDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Concesionario;

/**
 *
 * @author David
 */
public class ConcesionarioBO {
    
    public String mensaje="";
     public ConcesionarioDAO cdao=new ConcesionarioDAO();
    
    public String agregarConcesionario(Concesionario c) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.agregarConcesionario(con, c);
        } catch (Exception e) {
            mensaje=mensaje+ " "+e.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                mensaje=mensaje+ " "+e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarConcesionario(Concesionario c) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.modificarConcesionario(con, c);
        } catch (Exception e) {
            mensaje=mensaje+ " "+e.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                mensaje=mensaje+ " "+e.getMessage();
            }
        }
        return mensaje;
       
    }
    
    public String eliminarConcesionario(String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.eliminarConcesionario(con, ID);
        } catch (Exception e) {
            mensaje=mensaje+ " "+e.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                mensaje=mensaje+ " "+e.getMessage();
            }
        }
        return mensaje;
    }
    
    public ArrayList obtenerConcesionario(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=cdao.obtenerConcesionario(con, ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return datos;
        
    }
    
    public void listarConcesionario(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        cdao.listarConcesionario(con, tabla);
        con.close();
    }
    
}
