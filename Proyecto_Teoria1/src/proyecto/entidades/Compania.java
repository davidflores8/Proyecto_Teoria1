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
public class Compania {
    public String ID_Compania;
    public String Nombre_compania;

    public Compania() {
    }

    public Compania(String ID_Compania, String Nombre_compania) {
        this.ID_Compania = ID_Compania;
        this.Nombre_compania = Nombre_compania;
    }

    public String getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(String ID_Compania) {
        this.ID_Compania = ID_Compania;
    }

    public String getNombre_compania() {
        return Nombre_compania;
    }

    public void setNombre_compania(String Nombre_compania) {
        this.Nombre_compania = Nombre_compania;
    }

    @Override
    public String toString() {
        return "Compania{" + "ID_Compania=" + ID_Compania + ", Nombre_compania=" + Nombre_compania + '}';
    }
    
    
}
