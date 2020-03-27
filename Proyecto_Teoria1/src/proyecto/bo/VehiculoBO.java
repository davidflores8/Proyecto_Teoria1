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
    
    public String agregarVehiculo(Vehiculo v) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.agregarVehiculo(con, v);
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
    
    public String modificarVehiculo (Vehiculo v) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.modificarVehiculo(con, v);
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
    
    public String eliminarVehiculo (String vin) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.eliminarVehiculo(con, vin);
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
    
    public ArrayList obtenerVehiculo(String vin) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=vdao.obtenerVehiculo(con, vin);
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
    
    public ArrayList obtenerVehiculoConvertible() throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=vdao.obtenerVehiculoConvertible(con);
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
    
     public ArrayList obtenerVehiculoPorMarcayMes(String vin, String marca) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=vdao.obtenerVehiculoPorMarcayMes(con, vin, marca);
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
        
    public ArrayList obtenerMarcaVehiculo() throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=vdao.obtenerMarcaVehiculo(con);
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
    
    public void listarVehiculo (JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        vdao.listarVehiculo(con, tabla);
        con.close();
    }
    
    public void listarVehiculotransmision(String t,JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        vdao.listarVehiculoTransmision(con, t, tabla);
        con.close();
    }
    
    public ArrayList obtenerVehiculoPorTransmision(String vin) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=vdao.obtenerVehiculoPorTransmision(con, vin);
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
}
