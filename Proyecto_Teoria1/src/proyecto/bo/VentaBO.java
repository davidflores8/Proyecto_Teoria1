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
import proyecto.dao.CompraDAO;
import proyecto.dao.VentaDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Venta;

/**
 *
 * @author David
 */
public class VentaBO {
    public String mensaje="";
     public VentaDAO vdao=new VentaDAO();
    
    public String agregarVenta(Venta v) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.agregarVenta(con, v);
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
    
    public String listarVentaPorMes(String mes, String marca, JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=vdao.listarVentaPorMes(con, mes, marca, tabla);
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
    

    public String listarVentaPorAno(String mes, String marca, JTable tabla) throws SQLException{
    Connection con =Conexion.getConnection();
    try {
        mensaje=vdao.listarVentaPorAno(con, mes, marca, tabla);
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

    public ArrayList listarPrecioMarca(String marca) throws SQLException{
    Connection con =Conexion.getConnection();
    ArrayList<String>d=new ArrayList();
    try {
        d=vdao.listarPrecioPorMarca(con, marca);
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
    return d;
}
    
     public ArrayList obtenerMesCarroceria(String vin) throws SQLException{
    Connection con =Conexion.getConnection();
    ArrayList<String>d=new ArrayList();
    try {
        d=vdao.obtenerMesCarroceria(con, vin);
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
    return d;
}
    
    public ArrayList obtenerMarca() throws SQLException{
    Connection con =Conexion.getConnection();
    ArrayList<String>d=new ArrayList();
    try {
        d=vdao.obtenerMarca(con);
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
    return d;
}
    
    public ArrayList obtenerTodasMarcasAG() throws SQLException{
    Connection con =Conexion.getConnection();
    ArrayList<String>d=new ArrayList();
    try {
        d=vdao.obtenerTodasMarcasAG(con);
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
    return d;
}
    
    public ArrayList obtenerTodasMarcas() throws SQLException{
    Connection con =Conexion.getConnection();
    ArrayList<String>d=new ArrayList();
    try {
        d=vdao.obtenerTodasMarcasAG(con);
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
    return d;
}
    
    public void listarVenta(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        vdao.listarVenta(con, tabla);
        con.close();
    }
    
    public void obtenerVentaPorVin(String vin, JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        vdao.obtenerVentaPorVIN(con, vin, tabla);
        con.close();
    }
     
}
