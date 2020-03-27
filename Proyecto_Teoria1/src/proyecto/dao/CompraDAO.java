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
import proyecto.entidades.Compra;

/**
 *
 * @author David
 */
public class CompraDAO {
    String mensaje="";
    
    public String agregarCompra(Connection con, Compra c){
        PreparedStatement pst = null;
        String sql = "begin Crear_compra(?,?,?,?,?,?,?); end;";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, c.getID_Concesionario());
            pst.setString(2, c.getID_Compania());
            pst.setString(3, c.getPrecio_Compra());
            pst.setString(4, c.getVIN_Compra());
            pst.setString(5, c.getDia());
            pst.setString(6, c.getMes());
            pst.setString(7, c.getAno());
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
    
    
    public String listarCompra(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM COMPRA ORDER BY ID_CONCESIONARIO";
        String [] fila = new String [7];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 1; i <7; i++) {
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
    
    
    public void obtenerCompra(Connection con, JTable tabla, String vin){
        String[]datos= new String[6];
        String sql="SELECT ID_COMPANIA, VIN_COMPRA, PRECIO_COMPRA, DIA, MES, ANO FROM COMPRA WHERE ID_CONCESIONARIO = "+vin;
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        modelo.setNumRows(0);
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<6; i++){
                        datos[i]=rs.getString(i+1);
                    }
                    modelo.addRow(datos);
                    
            }
            tabla.setModel(modelo);
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado "+e.getMessage());
        }    
    }
   
    public void obtenerCompraID(Connection con, JTable tabla, String ID){
        String[]datos= new String[4];
        String sql="SELECT ID_COMPANIA, VIN_COMPRA, PRECIO_COMPRA, DIA, MES, ANO FROM COMPRA WHERE ID_CONCESIONARIO = "+ID;
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        modelo.setNumRows(0);
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<4; i++){
                        datos[i]=rs.getString(i+1);
                    }
                    modelo.addRow(datos);
                    
            }
            tabla.setModel(modelo);
            System.out.println("Ya paso por obtener");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado "+e.getMessage());
        }
       
        
    }
    
}
