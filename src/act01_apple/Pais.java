/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act01_apple;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Pais {
    private String nombre;
    private int codigoPostal;
    private FechaDeLlegada fecha;
    private ArrayList<Unidades> unidades = new ArrayList();
    private ArrayList<CentrosDeDistribucion> centrosDeDistribucion = new ArrayList();

    public Pais() {
    }

    public Pais(String nombre, int codigoPostal, FechaDeLlegada fecha) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.fecha = fecha;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public ArrayList<Unidades> getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList<Unidades> unidades) {
        this.unidades = unidades;
    }

    public ArrayList<CentrosDeDistribucion> getCentrosDeDistribucion() {
        return centrosDeDistribucion;
    }

    public void setCentrosDeDistribucion(ArrayList<CentrosDeDistribucion> centrosDeDistribucion) {
        this.centrosDeDistribucion = centrosDeDistribucion;
    }

    public FechaDeLlegada getFecha() {
        return fecha;
    }

    public void setFecha(FechaDeLlegada fecha) {
        this.fecha = fecha;
    }
    
    //Método propio para agregación
    
    public void addUnidades(Unidades un){
        unidades.add(un);
    }
    
    public void addCentros(CentrosDeDistribucion cen){
        centrosDeDistribucion.add(cen);
    }
    
    public void addFechaDeLlegada(FechaDeLlegada fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        
        String un = "";
        String cen = "";
        
        for (Unidades e:unidades) {
            un += e.toString();
        }
        
        for (CentrosDeDistribucion e:centrosDeDistribucion) {
            cen += e.toString();
        }
        
        return "\n Pais: " + nombre + "\n Codigo Postal: " + codigoPostal + "" + fecha + "\n Unidades Totales: " + un + "\n Centros de Distribucion: " + cen;
    }
    
    
    
    
    

    
    
}
