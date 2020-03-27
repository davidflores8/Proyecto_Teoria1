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
import proyecto.entidades.Venta;

/**
 *
 * @author David
 */
public class VentaDAO {
    String mensaje="";
    
    public String agregarVenta(Connection con, Venta v){
        PreparedStatement pst = null;
        String sql = "INSERT INTO VENTA VALUES(?,?,?,?,?,?,?,?)";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, v.getRTN_Venta());
            pst.setString(2, v.getID_Concesionario_Venta());
            pst.setString(3, v.getPrecio_Vehiculo());
            pst.setString(4, v.getVIN_Venta());
            pst.setString(5, v.getDia_Venta());
            pst.setString(6, v.getMes_Venta());
            pst.setString(7, v.getAno_Venta());
            pst.setString(8, v.getMarca());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            System.out.println("Compra ingresada");
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
            System.out.println("Compra no ingresda "+mensaje);
        }
        return mensaje;
    }
    
    
    public String listarVenta(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM VENTA ORDER BY RTN_VENTA";
        String [] fila = new String [8];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <8; i++) {
                    fila[i]=rs.getString(i+1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return null;
    }
    
    public String obtenerVentaPorVIN(Connection con, String vin, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT RTN_VENTA FROM VENTA WHERE VIN_VENTA = "+vin;
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
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return null;
    }
    
    public ArrayList listarPrecioPorMarca(Connection con, String marca){
        ArrayList<String> p=new ArrayList();
        String sql="SELECT FECHA_VENTA FROM VENTA WHERE MARCA = "+marca+" AND ANO_VENTA = "+"'"+2019+"'";
        String [] fila = new String [8];
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <1; i++) {
                    p.add(rs.getString(i+1));
                }
            }
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return p;
    }
    
    public ArrayList obtenerMarca(Connection con){
        ArrayList<String> p=new ArrayList();
        String sql="SELECT MARCA FROM VENTA WHERE ANO_VENTA = "+"'"+2019+"'"+"GROUP BY MARCA";
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <1; i++) {
                    p.add(rs.getString(i+1));
                }
            }
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return p;
    }
    
    public String listarVentaPorMes(Connection con, String mes, String marca, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM VENTA WHERE MES_VENTA = "+mes+" AND MARCA = "+marca;
        String [] fila = new String [8];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <8; i++) {
                    fila[i]=rs.getString(i+1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return null;
    }
    
   
    public String listarVentaPorAno(Connection con, String mes, String marca, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM VENTA WHERE ANO_VENTA = "+mes+" AND MARCA = "+marca;
        String [] fila = new String [8];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <8; i++) {
                    fila[i]=rs.getString(i+1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar venta por ano "+e.getMessage());
        }
        return null;
    }
    
    
}
