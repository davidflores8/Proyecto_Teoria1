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
import proyecto.dao.PersonaDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Persona;

/**
 *
 * @author David
 */
public class PersonaBO {
    public String mensaje="";
     public PersonaDAO edao=new PersonaDAO();
    
    public String agregarPersona(Persona p) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=edao.agregarPersona(con, p);
        } catch (Exception ex) {
            mensaje=mensaje+ " "+ex.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                mensaje=mensaje+ " "+ex.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarPersona(Persona p) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=edao.modificarPersona(con, p);
        } catch (Exception ex) {
            mensaje=mensaje+ " "+ex.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                mensaje=mensaje+ " "+ex.getMessage();
            }
        }
        return mensaje;
       
    }
    
    public String eliminarPersona(String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=edao.eliminarPersona(con, ID);
        } catch (Exception e) {
            mensaje=mensaje+ " "+e.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                mensaje=mensaje+ " "+ex.getMessage();
            }
        }
        return mensaje;
    }
    
    public ArrayList obtenerPersona(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=edao.obtenerEmpresa(con, ID);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return datos;
        
    }
    
    public void listarPersona(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        edao.listarPersona(con, tabla);
        con.close();
    }
}
