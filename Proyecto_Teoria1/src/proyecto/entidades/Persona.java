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
public class Persona {
    String RTN_Persona;
    String Nombre_Persona;
    String Direccion_Persona;
    String Telefono_Persona;
    String ID_Persona;
    String Ingreso_Persona;
    String Sexo_Persona;

    public Persona(String RTN_Persona, String Nombre_Persona, String Direccion_Persona, String Telefono_persona, String ID_Persona, String Sexo_Persona, String Ingreso_Persona) {
        this.RTN_Persona = RTN_Persona;
        this.Nombre_Persona = Nombre_Persona;
        this.Direccion_Persona = Direccion_Persona;
        this.Telefono_Persona = Telefono_persona;
        this.ID_Persona = ID_Persona;
        this.Ingreso_Persona = Ingreso_Persona;
        this.Sexo_Persona = Sexo_Persona;
    }

    public Persona() {
    }

    public String getRTN_Persona() {
        return RTN_Persona;
    }

    public void setRTN_Persona(String RTN_Persona) {
        this.RTN_Persona = RTN_Persona;
    }

    public String getNombre_Persona() {
        return Nombre_Persona;
    }

    public void setNombre_Persona(String Nombre_Persona) {
        this.Nombre_Persona = Nombre_Persona;
    }

    public String getDireccion_Persona() {
        return Direccion_Persona;
    }

    public void setDireccion_Persona(String Direccion_Persona) {
        this.Direccion_Persona = Direccion_Persona;
    }

    public String getTelefono_Persona() {
        return Telefono_Persona;
    }

    public void setTelefono_persona(String Telefono_persona) {
        this.Telefono_Persona = Telefono_persona;
    }

    public String getID_Persona() {
        return ID_Persona;
    }

    public void setID_Persona(String ID_Persona) {
        this.ID_Persona = ID_Persona;
    }

    public String getIngreso_Persona() {
        return Ingreso_Persona;
    }

    public void setIngreso_Persona(String Ingreso_Persona) {
        this.Ingreso_Persona = Ingreso_Persona;
    }

    public String getSexo_Persona() {
        return Sexo_Persona;
    }

    public void setSexo_Persona(String Sexo_Persona) {
        this.Sexo_Persona = Sexo_Persona;
    }
    
    
    
}
