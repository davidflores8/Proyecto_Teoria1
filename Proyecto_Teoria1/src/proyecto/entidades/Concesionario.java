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
public class Concesionario {
    String ID_Concesionario;
    String Nombre_Concesionario;
    String Ubicacion_Concesionario;

    public Concesionario() {
    }

    public Concesionario(String ID_Concesionario, String Nombre_Concesionario, String Ubicacion_Concesionario) {
        this.ID_Concesionario = ID_Concesionario;
        this.Nombre_Concesionario = Nombre_Concesionario;
        this.Ubicacion_Concesionario = Ubicacion_Concesionario;
    }

    public String getID_Concesionario() {
        return ID_Concesionario;
    }

    public void setID_Concesionario(String ID_Concesionario) {
        this.ID_Concesionario = ID_Concesionario;
    }

    public String getNombre_Concesionario() {
        return Nombre_Concesionario;
    }

    public void setNombre_Concesionario(String Nombre_Concesionario) {
        this.Nombre_Concesionario = Nombre_Concesionario;
    }

    public String getUbicacion_Concesionario() {
        return Ubicacion_Concesionario;
    }

    public void setUbicacion_Concesionario(String Ubicacion_Concesionario) {
        this.Ubicacion_Concesionario = Ubicacion_Concesionario;
    }
    
    
}
