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
import proyecto.entidades.Empresa;

/**
 *
 * @author David
 */
public class EmpresaDAO {
    String mensaje="";
    
    public String agregarEmpresa(Connection con, Empresa e){
        PreparedStatement pst = null;
        String sql = "begin crear_empresa(?,?,?,?,?); end;";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getRTN_Empresa());
            pst.setString(2, e.getNombre_Empresa());
            pst.setString(3, e.getDireccion_Empresa());
            pst.setString(4, e.getTelefono_Empresa());
            pst.setString(5, e.getTipo_Empresa());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarEmpresa(Connection con, Empresa e){
        PreparedStatement pst = null;
        String sql = "begin Modificar_empresa(?,?,?,?,?);end;";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getRTN_Empresa());
            pst.setString(2, e.getNombre_Empresa());
            pst.setString(3, e.getDireccion_Empresa());
            pst.setString(4, e.getTelefono_Empresa());
            pst.setString(5, e.getTipo_Empresa());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarEmpresa(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "begin Eliminar_empresa("+ID+");end;";
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
    
    public String listarEmpresa(Connection con, JTable tabla){
       
        DefaultTableModel modelo= (DefaultTableModel) tabla.getModel();
        String sql="SELECT * FROM EMPRESA ORDER BY RTN_EMPRESA";
        String [] fila = new String [5];
        Statement st=null;
        ResultSet rs=null;
        modelo.setRowCount(0);
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i <5; i++) {
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
        String sql="SELECT * FROM EMPRESA WHERE RTN_EMPRESA = "+ID;
        Statement st=null;
        ResultSet rs=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                    for(int i=0; i<5; i++){
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
