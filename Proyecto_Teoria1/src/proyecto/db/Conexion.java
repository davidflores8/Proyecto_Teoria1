/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Conexion {
    public static Connection conexion=null;
    public static String login="admin";
    public static String password="12345678";
    public static String url = "jdbc:oracle:thin:@database-1.cckt1lta21wy.us-east-1.rds.amazonaws.com:1521:ORCL";
    
    
    public static Connection getConnection() throws SQLException{
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion=DriverManager.getConnection(url,login,password);
            conexion.setAutoCommit(false);
            if(conexion!=null){
                System.out.println("Conexion exitosa");
                
            }
            else{
                System.out.println("Conexion fallida");
            }
        } 
         catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Conexion Erronea" + e.getMessage());
        }
        return conexion;
    }
    
    public static void desconexion(){
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar \n"+e.getMessage());
        }
    }
    
    public static void main (String [] args) throws SQLException{
        Conexion con=new Conexion();
        con.getConnection();
    }
    
    
}
