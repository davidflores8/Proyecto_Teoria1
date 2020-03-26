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
import proyecto.entidades.Compania;

/**
 *
 * @author David
 */
public class CompaniaDAO {
    
     String mensaje="";
    
    public String agregarCompania(Connection con, Compania c){
        PreparedStatement pst = null;
        String sql = "begin crear_Compania(COMPANIA_SEQ.NEXTVAL,?); end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, c.getNombre_compania());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCompania(Connection con, Compania c){
        PreparedStatement pst = null;
        String sql = "begin  Modificar_compania(?,?);end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, c.getID_Compania());
            pst.setString(2, c.getNombre_compania());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarCompania(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "begin Eliminar_compania("+ID+");end;";
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
    
    public String listarCompania(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM COMPANIA ORDER BY ID_COMPANIA";
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
    
    public ArrayList obtenerCompanias(Connection con){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT ID_COMPANIA FROM COMPANIA ORDER BY ID_COMPANIA";
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
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado"+e.getMessage());
        }
        return datos;  
    }
    
    public ArrayList obtenerNombreCompania(Connection con, String ID){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT NOMBRE_COMPANIA FROM COMPANIA WHERE ID_COMPANIA = "+ID;
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
            JOptionPane.showMessageDialog(null, "No se puede mostrar el dato seleccionado"+e.getMessage());
        }
        return datos;  
    }
    
    
    
    public ArrayList obtenerCompania(Connection con, String ID){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT * FROM COMPANIA WHERE ID_COMPANIA = "+ID;
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
