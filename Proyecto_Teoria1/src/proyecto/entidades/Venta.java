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
    String Precio_Vehiculo;
    String VIN_Venta;
    String Dia_Venta;
    String Mes_Venta;
    String Ano_Venta;
    String Marca;

    public Venta(String RTN_Venta, String ID_Concesionario_Venta, String Precio_Vehiculo, String VIN_Venta, String Dia_Venta, String Mes_Venta, String Ano_Venta, String Marca) {
        this.RTN_Venta = RTN_Venta;
        this.ID_Concesionario_Venta = ID_Concesionario_Venta;
        this.Precio_Vehiculo = Precio_Vehiculo;
        this.VIN_Venta = VIN_Venta;
        this.Dia_Venta = Dia_Venta;
        this.Mes_Venta = Mes_Venta;
        this.Ano_Venta = Ano_Venta;
        this.Marca = Marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
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

    public String getDia_Venta() {
        return Dia_Venta;
    }

    public void setDia_Venta(String Dia_Venta) {
        this.Dia_Venta = Dia_Venta;
    }

    public String getMes_Venta() {
        return Mes_Venta;
    }

    public void setMes_Venta(String Mes_Venta) {
        this.Mes_Venta = Mes_Venta;
    }

    public String getAno_Venta() {
        return Ano_Venta;
    }

    public void setAno_Venta(String Ano_Venta) {
        this.Ano_Venta = Ano_Venta;
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
