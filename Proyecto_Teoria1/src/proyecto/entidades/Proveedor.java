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
public class Proveedor {
    String ID_proveedor;
    String Nombre_proveedor;

    public Proveedor() {
    }

    public String getID_proveedor() {
        return ID_proveedor;
    }

    public void setID_proveedor(String ID_proveedor) {
        this.ID_proveedor = ID_proveedor;
    }

    public String getNombre_proveedor() {
        return Nombre_proveedor;
    }

    public void setNombre_proveedor(String Nombre_proveedor) {
        this.Nombre_proveedor = Nombre_proveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "ID_proveedor=" + ID_proveedor + ", Nombre_proveedor=" + Nombre_proveedor + '}';
    }
    
    
}
