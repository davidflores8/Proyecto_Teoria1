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
public class MarcaPrecio {
    String Marca;
    int precio;

    public MarcaPrecio() {
    }

    public MarcaPrecio(String Marca) {
        this.Marca = Marca;
    }

    
    public MarcaPrecio(String Marca, int precio) {
        this.Marca = Marca;
        this.precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
