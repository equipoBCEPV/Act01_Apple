/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act01_apple;

/**
 *
 * @author Pablo
 */
public class Pais extends Productos{
    
    private String nombre;
    FechaDeLlegada fech;
    private String codigoPostal;
    private Productos prod;

    public Pais() {
    }

    public Pais(String nombre, FechaDeLlegada fech, String codigoPostal, Productos prod) {
        this.nombre = nombre;
        this.fech = fech;
        this.codigoPostal = codigoPostal;
        this.prod = prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FechaDeLlegada getFech() {
        return fech;
    }

    public void setFech(FechaDeLlegada fech) {
        this.fech = fech;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Productos getProd() {
        return prod;
    }

    public void setProd(Productos prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "\n Pais: " + "\n Nombre: " + nombre + "\n Fecha : " + fech + "\n Código postal: " + codigoPostal + "\n Producto: " + prod;
    }
    
    
}
