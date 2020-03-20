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
import proyecto.entidades.Planta_fabricacion;

/**
 *
 * @author David
 */
public class Planta_fabricacionDAO {
    
    String mensaje="";
    
     public String agregarPlanta (Connection con, Planta_fabricacion pf){
        PreparedStatement pst = null;
        String sql = "INSERT INTO PLANTA_FABRICACION (ID_PLANTA, TIPO_PLANTA, NOMBRE_PLANTA) "
                + "VALUES (?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, pf.getID_Planta());
            pst.setString(2, pf.getTipo_planta());
            pst.setString(3, pf.getNombre_planta());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarPlanta (Connection con, Planta_fabricacion pf){
        PreparedStatement pst = null;
        String sql = "UPDATE PLANTA_FABRICACION SET TIPO_PLANTA = ?, NOMBRE_PLANTA = ? "
                 + "WHERE ID_PLANTA = ?";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, pf.getTipo_planta());
            pst.setString(2, pf.getNombre_planta());
            pst.setString(3, pf.getID_Planta());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarPlanta (Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "DELETE FROM PLANTA_FABRICACION WHERE ID_PLANTA = ?";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, ID);
            mensaje="ELIMINO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO ELIMINAR CORRECTAMENTE\n"+e.getMessage();
        }

        
        return mensaje;
    }
    
    public String listarPlanta (Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM PLANTA_FABRICACION ORDER BY ID_PLANTA";
        String [] fila = new String [3];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <3; i++) {
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
    
    public ArrayList obtenerPlanta(Connection con, String ID){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT * FROM PLANTA_FABRICACION WHERE ID_PLANTA = "+ID;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<3; i++){
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
