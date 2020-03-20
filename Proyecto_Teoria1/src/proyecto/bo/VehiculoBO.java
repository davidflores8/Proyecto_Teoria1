/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bo;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
import proyecto.dao.VehiculoDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Vehiculo;

/**
 *
 * @author David
 */
public class VehiculoBO {
    
     public String mensaje="";
     public VehiculoDAO vdao=new VehiculoDAO();
    
    public String agregarEmpleado (Vehiculo v) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.agregarEmpleado(con, v);
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
    
    public String modificarEmpleado (Vehiculo v) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.modificarEmpleado(con, v);
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
    
    public String eliminarEmpleado (String vin) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.eliminarEmpleado(con, vin);
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
    
    public void listarEmpleado (JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        vdao.listarEmpleado(con, tabla);
        con.close();
    }
    
}
