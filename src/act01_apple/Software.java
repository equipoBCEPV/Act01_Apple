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
    private int versionSoftware;
    
    public Software(){
        
    }

    public Software(int idSoftware, String categoriaSoftware, int versionSoftware, String nombre, FechaDeSalida fecha, int precio, String categoria) {
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

    public int getVersionSoftware() {
        return versionSoftware;
    }

    public void setVersionSoftware(int versionSoftware) {
        this.versionSoftware = versionSoftware;
    }

    @Override
    public String toString() {
        return "Software" + "\n ID: " + idSoftware + "\n Categoria de Software: " + categoriaSoftware + "\n Version de Software: " + versionSoftware + "\n " + fecha;
    }
    
    
    
}
