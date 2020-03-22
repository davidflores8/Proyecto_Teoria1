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
import proyecto.dao.EmpresaDAO;
import proyecto.db.Conexion;
import proyecto.entidades.Empresa;

/**
 *
 * @author David
 */
public class EmpresaBO {
    public String mensaje="";
     public EmpresaDAO edao=new EmpresaDAO();
    
    public String agregarEmpresa(Empresa e) throws SQLException{
        Connection con =Conexion.getConnection();
        try {
            mensaje=edao.agregarEmpresa(con, e);
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
    
    public String modificarEmpresa(Empresa e) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=edao.modificarEmpresa(con, e);
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
    
    public String eliminarEmpresa(String ID) throws SQLException{
         Connection con =Conexion.getConnection();
        try {
            mensaje=edao.eliminarEmpresa(con, ID);
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
    
    public ArrayList obtenerEmpresa(String ID) throws SQLException{
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
    
    public void listarEmpresa(JTable tabla) throws SQLException{
        Connection con =Conexion.getConnection();
        edao.listarEmpresa(con, tabla);
        con.close();
    }
}
