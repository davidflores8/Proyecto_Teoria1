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
import proyecto.db.Conexion;
import proyecto.entidades.Vehiculo;

/**
 *
 * @author David
 */
public class VehiculoDAO {
    
    public String mensaje="";
    
    public String agregarVehiculo (Connection con, Vehiculo v){
        PreparedStatement pst = null;
        String sql = "begin crear_Vehiculo(?,?,?,?,?,?,?,?,?); end;";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, v.getVIN());
            pst.setString(2, v.getTipo_motor());
            pst.setString(3, v.getColor());
            pst.setString(4, v.getTransmision());
            pst.setString(5, v.getTipo_carroceria());
            pst.setString(6, v.getModelo());
            pst.setString(7, v.getID_Compania());
            pst.setString(8, v.getMarca());
            pst.setString(9, v.getPrecio());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarVehiculo (Connection con, Vehiculo v){
        PreparedStatement pst = null;
        String sql = "begin Modificar_Vehiculo(?,?,?,?,?,?,?,?); end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, v.getVIN());
            pst.setString(2, v.getTipo_motor());
            pst.setString(3, v.getColor());
            pst.setString(4, v.getTransmision());
            pst.setString(5, v.getTipo_carroceria());
            pst.setString(6, v.getModelo());
            pst.setString(7, v.getMarca());
            pst.setString(8, v.getPrecio());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+e.getMessage();
        }
        
        return mensaje;
    }
    
    
    
    public String eliminarVehiculo (Connection con, String vin){
        PreparedStatement pst = null;
        String sql = "begin Eliminar_vehiculo("+vin+");end;";
        
        try {
            pst =con.prepareStatement(sql);
         //   pst.setString(1, vin);
            mensaje="ELIMINO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO ELIMINAR CORRECTAMENTE\n"+e.getMessage();
        }

        
        return mensaje;
    }
    
    public String listarVehiculo (Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM VEHICULO ORDER BY VIN";
        String [] fila = new String [9];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <9; i++) {
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
    
    public ArrayList obtenerVehiculo(Connection con, String vin){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT * FROM VEHICULO WHERE VIN = "+vin;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<9; i++){
                        datos.add(rs.getString(i+1));
                    }
            }
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado en obtener "+e.getMessage());
        }
        return datos; 
    }
    
        public ArrayList obtenerVehiculoConvertible(Connection con){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT VIN FROM VEHICULO WHERE TIPO_CARROCERIA = 'Convertible'";
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<1; i++){
                        datos.add(rs.getString(i+1));
                    }
            }
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado en obtener "+e.getMessage());
        }
        return datos; 
    }
    
    public ArrayList obtenerVehiculoPorMarcayMes(Connection con, String vin, String marca){
        ArrayList<String>datos1=new ArrayList();
        String sql="SELECT * FROM VEHICULO WHERE VIN = "+vin+" AND MARCA = "+marca;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<9; i++){
                        System.out.println("datoo "+rs.getString(i+1));
                        datos1.add(rs.getString(i+1));   
                    }
            }
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado "+e.getMessage());
        }
        return datos1; 
    }
    
    
    public ArrayList obtenerMarcaVehiculo(Connection con){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT MARCA FROM VEHICULO GROUP BY MARCA";
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<1; i++){
                        datos.add(rs.getString(i+1));
                    }
            }
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado en obtener "+e.getMessage());
        }
        return datos; 
    }
    
    public String listarVehiculoTransmision(Connection con, String transmision, JTable tabla){
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT VIN FROM VEHICULO WHERE TRANSMISION = "+transmision;
        String [] fila = new String [1];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <1; i++) {
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
    
    
    public ArrayList obtenerVehiculoPorTransmision(Connection con, String vin){
        ArrayList<String>datos1=new ArrayList();
        String sql="SELECT VIN FROM VEHICULO WHERE TRANSMISION = "+vin;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<1; i++){
                        System.out.println("datoo "+rs.getString(i+1));
                        datos1.add(rs.getString(i+1));   
                    }
            }
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado "+e.getMessage());
        }
        return datos1; 
    }
    
}
    
   
