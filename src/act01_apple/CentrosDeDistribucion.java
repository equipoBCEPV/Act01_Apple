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
public class CentrosDeDistribucion {
   private String nombreCiuidad;
   private int unidadesAsignadas;
   private String status;
   
   public CentrosDeDistribucion(){
       
   }

    public CentrosDeDistribucion(String nombreCiuidad, int unidadesAsignadas, String status) {
        this.nombreCiuidad = nombreCiuidad;
        this.unidadesAsignadas = unidadesAsignadas;
        this.status = status;
    }

    public String getNombreCiuidad() {
        return nombreCiuidad;
    }

    public void setNombreCiuidad(String nombreCiuidad) {
        this.nombreCiuidad = nombreCiuidad;
    }

    public int getUnidadesAsignadas() {
        return unidadesAsignadas;
    }

    public void setUnidadesAsignadas(int unidadesAsignadas) {
        this.unidadesAsignadas = unidadesAsignadas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\n Nombre de la Ciuidad: " + nombreCiuidad + "\n Unidades Asignadas: " + unidadesAsignadas + "\n Status: " + status;
    }
   
   

   
}
