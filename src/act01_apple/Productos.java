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
public class Productos {
    private String nombre;
    FechaDeSalida fecha;
    private int precio;
    private String categoria;
    
    
    public Productos(){
    }

    public Productos(String nombre, FechaDeSalida fecha, int precio, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FechaDeSalida getFecha() {
        return fecha;
    }

    public void setFecha(FechaDeSalida fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void crearProducto() {
        
    }
    
    public void editarProducto() {
        
    }
    
    public void eliminarProducto() {
        
    }
    
    public void listarProductos() {
        
    }
    
    public void buscarProductos() {
        
    }

    @Override
    public String toString() {
        return "Productos" + "nombre=" + nombre + ", fecha=" + fecha + ", precio=" + precio + ", categoria=" + categoria;
    }
    
    
    
    
    
}
