/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.test;

import java.sql.SQLException;
import proyecto.bo.VehiculoBO;
import proyecto.entidades.Vehiculo;

/**
 *
 * @author David
 */
public class test {
    VehiculoBO vbo= new VehiculoBO();
    Vehiculo v=new Vehiculo();
    String mensaje="";
    
    public void insertar() throws SQLException{
        v.setTipo_motor("V3");
        v.setColor("Azul");
        v.setTransmision("Automatico");
        v.setTipo_carroceria("Urbano");
        v.setModelo("Telluride");
        mensaje=vbo.agregarVehiculo(v);
        System.out.println(mensaje);
    }
    
    public void eliminar() throws SQLException{
        mensaje=vbo.eliminarVehiculo("1");
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) throws SQLException {
        test t=new test ();
        t.eliminar();
    }
}
