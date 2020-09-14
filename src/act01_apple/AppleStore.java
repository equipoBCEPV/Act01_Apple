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
public class AppleStore extends CentrosDeDistribucion {
    private int ventasAppleStore;
    
    public AppleStore(){
        
    }

    public AppleStore(int ventasAppleStore, String nombreCiuidad, int unidadesAsignadas, String status) {
        super(nombreCiuidad, unidadesAsignadas, status);
        this.ventasAppleStore = ventasAppleStore;
    }

    public int getVentasAppleStore() {
        return ventasAppleStore;
    }

    public void setVentasAppleStore(int ventasAppleStore) {
        this.ventasAppleStore = ventasAppleStore;
    }

    @Override
    public String toString() {
        return super.toString() + "\n AppleStore" + "\n Ventas AppleStore: " + ventasAppleStore;
    }
    
    
    
}
