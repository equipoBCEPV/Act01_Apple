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
    private FechaDeSalida fecha;
    private double precio;
    private String categoria;
    
    
    public Productos(){
    }

    public Productos(String nombre, FechaDeSalida fecha, double precio, String categoria) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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
        return "Producto" + "\n Nombre: " + nombre + fecha + "\n Precio: " + precio + "\n Categoria: " + categoria;
    }
    
    
    
    
    
}
