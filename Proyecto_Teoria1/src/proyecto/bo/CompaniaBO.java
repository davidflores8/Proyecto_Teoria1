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
import proyecto.dao.CompaniaDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Compania;

/**
 *
 * @author David
 */
public class CompaniaBO {
    public String mensaje="";
     public CompaniaDAO cdao=new CompaniaDAO();
    
    public String agregarCompania(Compania c) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.agregarCompania(con, c);
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
    
    public String modificarCompania(Compania c) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.modificarCompania(con, c);
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
    
    public String eliminarCompania(String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.eliminarCompania(con, ID);
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
    
    public ArrayList obtenerCompanias() throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=cdao.obtenerCompanias(con);
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
    
    public ArrayList obtenerCompania(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=cdao.obtenerCompania(con, ID);
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
    
    public ArrayList obtenerNombreCompania(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=cdao.obtenerNombreCompania(con, ID);
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
    
    public void listarCompania(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        cdao.listarCompania(con, tabla);
        con.close();
    }
    
}
