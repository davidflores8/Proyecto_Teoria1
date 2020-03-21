/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.entidades.Proveedor;

/**
 *
 * @author David
 */
public class ProveedorDAO {
    String mensaje="";
    
    public String agregarProveedor(Connection con, Proveedor p){
        PreparedStatement pst = null;
        String sql = "begin crearProveedor(?,?); end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, p.getID_proveedor());
            pst.setString(2, p.getNombre_proveedor());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarProveedor(Connection con, Proveedor p){
        PreparedStatement pst = null;
        String sql = "UPDATE PROVEEDOR SET NOMBRE_PROVEEDOR = ? "
                 + "WHERE ID_PROVEEDOR= ?";
        
        try {
            pst =con.prepareStatement(sql);
            
            pst.setString(2, p.getID_proveedor());
            pst.setString(1, p.getNombre_proveedor());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarProveedor(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "DELETE FROM PROVEEDOR WHERE ID_PROVEEDOR = "+ID;
        try {
            pst =con.prepareStatement(sql);
            System.out.println("Borro");
            mensaje="ELIMINO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO ELIMINAR CORRECTAMENTE\n"+e.getMessage();
        }

        
        return mensaje;
    }
    
    public String listarProveedor(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM PROVEEDOR ORDER BY ID_PROVEEDOR";
        String [] fila = new String [2];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <2; i++) {
                    fila[i]=rs.getString(i+1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :("+e.getMessage());
        }
        return null;
    }
    
    public ArrayList obtenerProveedor(Connection con, String ID){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT * FROM PROVEEDOR WHERE ID_PROVEEDOR = "+ID;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<2; i++){
                        datos.add(rs.getString(i+1));
                    }
            }
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado "+e.getMessage());
        }
        return datos;
        
    }
    
}
