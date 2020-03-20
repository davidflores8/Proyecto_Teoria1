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
import proyecto.dao.Planta_fabricacionDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Planta_fabricacion;

/**
 *
 * @author David
 */
public class Planta_fabricacionBO {
    public String mensaje="";
     public Planta_fabricacionDAO pfdao=new Planta_fabricacionDAO();
    
    public String agregarPlanta(Planta_fabricacion pf) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=pfdao.agregarPlanta(con, pf);
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
    
    public String modificarPlanta (Planta_fabricacion pf) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=pfdao.modificarPlanta(con, pf);
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
    
    public String eliminarPlanta (String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=pfdao.eliminarPlanta(con, ID);
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
    
    public ArrayList obtenerPlanta(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=pfdao.obtenerPlanta(con, ID);
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
    
    public void listarPlanta(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        pfdao.listarPlanta(con, tabla);
        con.close();
    }
}
