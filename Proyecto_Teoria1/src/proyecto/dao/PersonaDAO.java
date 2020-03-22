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
import proyecto.entidades.Persona;

/**
 *
 * @author David
 */
public class PersonaDAO {
    String mensaje="";
    
    public String agregarPersona(Connection con, Persona p){
        PreparedStatement pst = null;
        String sql = "begin crear_Persona(?,?,?,?,?,?,?); end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, p.getRTN_Persona());
            pst.setString(2, p.getNombre_Persona());
            pst.setString(3, p.getDireccion_Persona());
            pst.setString(4, p.getTelefono_Persona());
            pst.setString(5, p.getID_Persona());
            pst.setString(6, p.getSexo_Persona());
            pst.setString(7, p.getIngreso_Persona());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarPersona(Connection con, Persona p){
        PreparedStatement pst = null;
        String sql = "begin Modificar_Persona(?,?,?,?,?,?,?);end;";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, p.getRTN_Persona());
            pst.setString(2, p.getNombre_Persona());
            pst.setString(3, p.getDireccion_Persona());
            pst.setString(4, p.getTelefono_Persona());
            pst.setString(5, p.getID_Persona());
            pst.setString(6, p.getSexo_Persona());
            pst.setString(7, p.getIngreso_Persona());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarPersona(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "begin Eliminar_persona("+ID+");end;";
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
    
    public String listarPersona(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM PERSONA ORDER BY RTN";
        String [] fila = new String [7];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
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
            System.out.println("Ya paso por listar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :("+e.getMessage());
        }
        return null;
    }
    
    public ArrayList obtenerEmpresa(Connection con, String ID){
        ArrayList <String> datos = new ArrayList();
        String sql="SELECT * FROM PERSONA WHERE RTN = "+ID;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<7; i++){
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
