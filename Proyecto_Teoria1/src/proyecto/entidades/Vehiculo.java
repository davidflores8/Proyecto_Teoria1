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
public class Vehiculo {
     String tipo_carroceria;
     String modelo;
     String transmision;
     String color;
     String VIN;
     String tipo_motor;
     String ID_Compania;

    public Vehiculo() {
    }

    public Vehiculo(String tipo_carroceria, String modelo, String transmision, String color, String VIN, String tipo_motor, String ID_Compania) {
        this.tipo_carroceria = tipo_carroceria;
        this.modelo = modelo;
        this.transmision = transmision;
        this.color = color;
        this.VIN = VIN;
        this.tipo_motor = tipo_motor;
        this.ID_Compania=ID_Compania;
    }

    public String getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(String ID_Compania) {
        this.ID_Compania = ID_Compania;
    }
    
 

    public String getTipo_carroceria() {
        return tipo_carroceria;
    }

    public void setTipo_carroceria(String tipo_carroceria) {
        this.tipo_carroceria = tipo_carroceria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    @Override
    public String toString() {
        return "Vehiculo:" + "tipo_carroceria = " + tipo_carroceria + "\nmodelo = " + modelo + "\ntransmision = " + transmision + "\ncolor = " + color + "\nVIN = " + VIN + "\ntipo_motor = " + tipo_motor + "\n";
    }
    
     
}
