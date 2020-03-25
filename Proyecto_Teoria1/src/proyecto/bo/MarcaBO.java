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
import proyecto.dao.MarcaDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Marca;

/**
 *
 * @author David
 */
public class MarcaBO {
     public String mensaje="";
     public MarcaDAO cdao=new MarcaDAO();
    
    public String agregarMarca(Marca m) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.agregarMarca(con,m);
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
    
    public String modificarMarca(Marca m) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.modificarMarca(con, m);
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
    
    public String eliminarMarca(String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=cdao.eliminarMarca(con, ID);
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
    
    public ArrayList obtenerMarca(String ID) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =Conexion.getConnection();
        try {
            datos=cdao.obtenerMarca(con, ID);
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
    
    public void listarMarca(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        cdao.listarMarca(con, tabla);
        con.close();
    }
}
