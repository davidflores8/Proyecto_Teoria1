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
public class Empresa {
    String RTN_Empresa;
    String Nombre_Empresa;
    String Direccion_Empresa;
    String Telefono_Empresa;
    String Tipo_Empresa;

    public Empresa() {
    }

    @Override
    public String toString() {
        return "Empresa{" + "RTN_Empresa=" + RTN_Empresa + ", Nombre_Empresa=" + Nombre_Empresa + ", Direccion_Empresa=" + Direccion_Empresa + ", Telefono_Empresa=" + Telefono_Empresa + ", Tipo_Empresa=" + Tipo_Empresa + '}';
    }

    public Empresa(String RTN_Empresa, String Nombre_Empresa, String Direccion_Empresa, String Telefono_Empresa, String Tipo_Empresa) {
        this.RTN_Empresa = RTN_Empresa;
        this.Nombre_Empresa = Nombre_Empresa;
        this.Direccion_Empresa = Direccion_Empresa;
        this.Telefono_Empresa = Telefono_Empresa;
        this.Tipo_Empresa = Tipo_Empresa;
    }
    
    

    public String getRTN_Empresa() {
        return RTN_Empresa;
    }

    public void setRTN_Empresa(String RTN_Empresa) {
        this.RTN_Empresa = RTN_Empresa;
    }

    public String getNombre_Empresa() {
        return Nombre_Empresa;
    }

    public void setNombre_Empresa(String Nombre_Empresa) {
        this.Nombre_Empresa = Nombre_Empresa;
    }

    public String getDireccion_Empresa() {
        return Direccion_Empresa;
    }

    public void setDireccion_Empresa(String Direccion_Empresa) {
        this.Direccion_Empresa = Direccion_Empresa;
    }

    public String getTelefono_Empresa() {
        return Telefono_Empresa;
    }

    public void setTelefono_Empresa(String Telefono_Empresa) {
        this.Telefono_Empresa = Telefono_Empresa;
    }

    public String getTipo_Empresa() {
        return Tipo_Empresa;
    }

    public void setTipo_Empresa(String Tipo_Empresa) {
        this.Tipo_Empresa = Tipo_Empresa;
    }
    
    
}
