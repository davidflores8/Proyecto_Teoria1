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
import proyecto.entidades.Concesionario;

/**
 *
 * @author David
 */
public class ConcesionarioDAO {
    String mensaje="";
    
    public String agregarConcesionario(Connection con, Concesionario c){
        PreparedStatement pst = null;
        String sql = "begin crear_Concesionario(CONCESIONARIO_SEQ.NEXTVAL,?,?); end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, c.getNombre_Concesionario());
            pst.setString(2, c.getUbicacion_Concesionario());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarConcesionario(Connection con, Concesionario c){
        PreparedStatement pst = null;
        String sql = "begin Modificar_Concesionario(?,?,?);end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, c.getID_Concesionario());
            pst.setString(2, c.getNombre_Concesionario());
            pst.setString(3, c.getUbicacion_Concesionario());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarConcesionario(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "begin Eliminar_concesionario("+ID+");end;";
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
    
    public String listarConcesionario(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM CONCESIONARIO ORDER BY ID_CONCESIONARIO";
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
    
    public ArrayList obtenerConcesionario(Connection con, String ID){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT * FROM CONCESIONARIO WHERE ID_CONCESIONARIO = "+ID;
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
