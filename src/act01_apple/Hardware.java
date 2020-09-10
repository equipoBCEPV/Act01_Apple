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
public class Hardware extends Productos {
    private int idHardware;
    private String categoriaHardware;
    private int versionHardware;
    
    public Hardware(){
    
    }

    public Hardware(int idHardware, String categoriaHardware, int versionHardware, String nombre, FechaDeSalida fecha, int precio, String categoria) {
        super(nombre, fecha, precio, categoria);
        this.idHardware = idHardware;
        this.categoriaHardware = categoriaHardware;
        this.versionHardware = versionHardware;
    }

    public int getIdHardware() {
        return idHardware;
    }

    public void setIdHardware(int idHardware) {
        this.idHardware = idHardware;
    }

    public String getCategoriaHardware() {
        return categoriaHardware;
    }

    public void setCategoriaHardware(String categoriaHardware) {
        this.categoriaHardware = categoriaHardware;
    }

    public int getVersionHardware() {
        return versionHardware;
    }

    public void setVersionHardware(int versionHardware) {
        this.versionHardware = versionHardware;
    }

    @Override
    public String toString() {
        return "Hardware" + "\n Id Hardware: " + idHardware + "\n Categoria Hardware=" + categoriaHardware + "\n Version Hardware=" + versionHardware + "\n Fecha de Salida: " +fecha;
    }
    
    
    
}
