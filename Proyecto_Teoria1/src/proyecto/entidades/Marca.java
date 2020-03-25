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
public class Marca {
    String ID_Marca;
    String Nombre_Marca;
    String ID_Compania;

    public Marca(String ID_Marca, String Nombre_Marca, String ID_Compania) {
        this.ID_Marca = ID_Marca;
        this.Nombre_Marca = Nombre_Marca;
        this.ID_Compania = ID_Compania;
    }
   

    public String getNombre_Marca() {
        return Nombre_Marca;
    }

    public void setNombre_Marca(String Nombre_Marca) {
        this.Nombre_Marca = Nombre_Marca;
    }

    public String getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(String ID_Compania) {
        this.ID_Compania = ID_Compania;
    }

    public String getID_Marca() {
        return ID_Marca;
    }

    public void setID_Marca(String ID_Marca) {
        this.ID_Marca = ID_Marca;
    }
    
    
}
