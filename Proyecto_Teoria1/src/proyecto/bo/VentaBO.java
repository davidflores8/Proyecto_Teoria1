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

    
    public void listarVenta(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        vdao.listarVenta(con, tabla);
        con.close();
    }
    
    
   
   

       
}
