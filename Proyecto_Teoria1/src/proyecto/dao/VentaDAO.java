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
import proyecto.entidades.Venta;

/**
 *
 * @author David
 */
public class VentaDAO {
    String mensaje="";
    
    public String agregarVenta(Connection con, Venta v){
        PreparedStatement pst = null;
        String sql = "begin crear_compra(?,?,?,?,?); end;";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, v.getRTN_Venta());
            pst.setString(2, v.getID_Concesionario_Venta());
            pst.setString(3, v.getFecha_Venta());
            pst.setString(4, v.getPrecio_Vehiculo());
            pst.setString(5, v.getVIN_Venta());
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
        String [] fila = new String [5];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 1; i <5; i++) {
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
    
}
