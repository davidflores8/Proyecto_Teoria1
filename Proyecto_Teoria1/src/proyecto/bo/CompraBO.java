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
import proyecto.db.Conexion;
import proyecto.entidades.Compra;

/**
 *
 * @author David
 */
public class CompraBO {
    public String mensaje="";
     public CompraDAO cdao=new CompraDAO();
    
    public String agregarCompra(Compra c) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.agregarCompra(con, c);
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
    
    
    public void listarCompra(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        cdao.listarCompra(con, tabla);
        con.close();
    }
    
        public ArrayList obtenerCompra(JTable tabla, String vin) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            cdao.obtenerCompra(con, tabla, vin);
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
