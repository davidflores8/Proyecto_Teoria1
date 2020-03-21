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
import proyecto.dao.ProveedorDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Proveedor;

/**
 *
 * @author David
 */
public class ProveedorBO {
    public String mensaje="";
     public ProveedorDAO pfdao=new ProveedorDAO();
    
    public String agregarProveedor(Proveedor p) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=pfdao.agregarProveedor(con, p);
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
    
    public String modificarProveedor(Proveedor p) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=pfdao.modificarProveedor(con, p);
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
    
    public String eliminarProveedor(String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=pfdao.eliminarProveedor(con, ID);
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
    
    public ArrayList obtenerProveedor(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=pfdao.obtenerProveedor(con, ID);
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
    
    public void listarProveedor(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        pfdao.listarProveedor(con, tabla);
        con.close();
    }
    
}
