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
public class Software extends Productos {
    private int idSoftware;
    private String categoriaSoftware;
    private double versionSoftware;
    
    public Software(){
        
    }

    public Software(int idSoftware, String categoriaSoftware, double versionSoftware, String nombre, FechaDeSalida fecha, double precio, String categoria) {
        super(nombre, fecha, precio, categoria);
        this.idSoftware = idSoftware;
        this.categoriaSoftware = categoriaSoftware;
        this.versionSoftware = versionSoftware;
    }

    public int getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(int idSoftware) {
        this.idSoftware = idSoftware;
    }

    public String getCategoriaSoftware() {
        return categoriaSoftware;
    }

    public void setCategoriaSoftware(String categoriaSoftware) {
        this.categoriaSoftware = categoriaSoftware;
    }

    public double getVersionSoftware() {
        return versionSoftware;
    }

    public void setVersionSoftware(double versionSoftware) {
        this.versionSoftware = versionSoftware;
    }

    @Override
    public String toString() {
        return super.toString() + "\n ID: " + idSoftware + "\n Categoria de Software: " + categoriaSoftware + "\n Version de Software: " + versionSoftware + "\n ";
    }
    
    
    
}
