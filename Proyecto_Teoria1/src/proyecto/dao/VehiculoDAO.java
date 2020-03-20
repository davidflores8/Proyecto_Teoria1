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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.db.Conexion;
import proyecto.entidades.Vehiculo;

/**
 *
 * @author David
 */
public class VehiculoDAO {
    
    public String mensaje="";
    
    public String agregarEmpleado (Connection con, Vehiculo v){
        PreparedStatement pst = null;
        String sql = "INSERT INTO VEHICULO (VIN,TIPO_MOTOR,COLOR,TRANSMISION,TIPO_CARROCERIA, MODELO) "
                + "VALUES (VEHICULO_SEQ.NEXTVAL,?,?,?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, v.getTipo_motor());
            pst.setString(2, v.getColor());
            pst.setString(3, v.getTransmision());
            pst.setString(4, v.getTipo_carroceria());
            pst.setString(5, v.getModelo());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarEmpleado (Connection con, Vehiculo v){
        PreparedStatement pst = null;
        String sql = "UPDATE VEHICULO SET TIPO_MOTOR = ?, COLOR = ?, TRANSMISION = ?, TIPO_CARROCERIA = ?, MODELO = ?  "
                 + "WHERE VIN = ?";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, v.getTipo_motor());
            pst.setString(2, v.getColor());
            pst.setString(3, v.getTransmision());
            pst.setString(4, v.getTipo_carroceria());
            pst.setString(5, v.getModelo());
            pst.setString(6, v.getVIN());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarEmpleado (Connection con, String vin){
        PreparedStatement pst = null;
        String sql = "DELETE FROM VEHICULO WHERE VIN=?";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, vin);
            mensaje="ELIMINO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO ELIMINAR CORRECTAMENTE\n"+e.getMessage();
        }

        
        return mensaje;
    }
    
    public String listarEmpleado (Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String [] columna = {"VIN", "TIPO_MOTOR" , "COLOR" , "TRANSMISION", "TIPO_CARROCERIA", "MODELO"};
        modelo =new DefaultTableModel(null, columna);
        
        String sql="SELECT * FROM VEHICULOS ORDER BY VIN";
        String [] fila = new String [7];
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <7; i++) {
                    fila[i]=rs.getString(i+1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
        return null;
    }
}
    
   
