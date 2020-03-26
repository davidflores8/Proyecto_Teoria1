/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

/**
 *
 * @author David
 */
public class Venta {
    String RTN_Venta;
    String ID_Concesionario_Venta;
    String Fecha_Venta;
    String Precio_Vehiculo;
    String VIN_Venta;

    public Venta(String RTN_Venta, String ID_Concesionario_Venta, String Fecha_Venta, String Precio_Vehiculo, String VIN_Venta) {
        this.RTN_Venta = RTN_Venta;
        this.ID_Concesionario_Venta = ID_Concesionario_Venta;
        this.Fecha_Venta = Fecha_Venta;
        this.Precio_Vehiculo = Precio_Vehiculo;
        this.VIN_Venta = VIN_Venta;
    }

    public String getRTN_Venta() {
        return RTN_Venta;
    }

    public void setRTN_Venta(String RTN_Venta) {
        this.RTN_Venta = RTN_Venta;
    }

    public String getID_Concesionario_Venta() {
        return ID_Concesionario_Venta;
    }

    public void setID_Concesionario_Venta(String ID_Concesionario_Venta) {
        this.ID_Concesionario_Venta = ID_Concesionario_Venta;
    }

    public String getFecha_Venta() {
        return Fecha_Venta;
    }

    public void setFecha_Venta(String Fecha_Venta) {
        this.Fecha_Venta = Fecha_Venta;
    }

    public String getPrecio_Vehiculo() {
        return Precio_Vehiculo;
    }

    public void setPrecio_Vehiculo(String Precio_Vehiculo) {
        this.Precio_Vehiculo = Precio_Vehiculo;
    }

    public String getVIN_Venta() {
        return VIN_Venta;
    }

    public void setVIN_Venta(String VIN_Venta) {
        this.VIN_Venta = VIN_Venta;
    }
    
    
    
}
