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
public class Planta_fabricacion {
    String ID_Planta;
    String Tipo_planta;
    String Nombre_planta;
    String ID_Compania;

    public Planta_fabricacion() {
    }

    public Planta_fabricacion(String ID_Planta, String Tipo_planta, String Nombre_planta, String ID_Compania) {
        this.ID_Planta = ID_Planta;
        this.Tipo_planta = Tipo_planta;
        this.Nombre_planta = Nombre_planta;
        this.ID_Compania=ID_Compania;
    }

    public String getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(String ID_Compania) {
        this.ID_Compania = ID_Compania;
    }
    
    

    public String getID_Planta() {
        return ID_Planta;
    }

    public void setID_Planta(String ID_Planta) {
        this.ID_Planta = ID_Planta;
    }

    public String getTipo_planta() {
        return Tipo_planta;
    }

    public void setTipo_planta(String Tipo_planta) {
        this.Tipo_planta = Tipo_planta;
    }

    public String getNombre_planta() {
        return Nombre_planta;
    }

    public void setNombre_planta(String Nombre_planta) {
        this.Nombre_planta = Nombre_planta;
    }

    @Override
    public String toString() {
        return "Planta_fabricacion{" + "\nID_Planta = " + ID_Planta + "\nTipo_planta = " + Tipo_planta + "\n Nombre_planta=" + Nombre_planta;
    }
    
    
}
