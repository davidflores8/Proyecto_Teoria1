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
public class Compra {
    String ID_Concesionario;
    String ID_Compania;
    String Precio_Compra;
    String VIN_Compra;
    String Fecha_Ingreso;

    public Compra(String ID_Concesionario, String ID_Compania, String Precio_Compra, String VIN_Compra, String Fecha_Ingreso) {
        this.ID_Concesionario = ID_Concesionario;
        this.ID_Compania = ID_Compania;
        this.Precio_Compra = Precio_Compra;
        this.VIN_Compra = VIN_Compra;
        this.Fecha_Ingreso = Fecha_Ingreso;
    }

    public String getID_Concesionario() {
        return ID_Concesionario;
    }

    public void setID_Concesionario(String ID_Concesionario) {
        this.ID_Concesionario = ID_Concesionario;
    }

    public String getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(String ID_Compania) {
        this.ID_Compania = ID_Compania;
    }

    public String getPrecio_Compra() {
        return Precio_Compra;
    }

    public void setPrecio_Compra(String Precio_Compra) {
        this.Precio_Compra = Precio_Compra;
    }

    public String getVIN_Compra() {
        return VIN_Compra;
    }

    public void setVIN_Compra(String VIN_Compra) {
        this.VIN_Compra = VIN_Compra;
    }

    public String getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(String Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }
    
    
    
}
