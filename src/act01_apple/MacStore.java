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
public class MacStore extends CentrosDeDistribucion{
    private int ventasMacStore;
    
    public MacStore(){
        
    }

    public MacStore(int ventasMacStore, String nombreCiuidad, int unidadesAsignadas, String status) {
        super(nombreCiuidad, unidadesAsignadas, status);
        this.ventasMacStore = ventasMacStore;
    }

    public int getVentasMacStore() {
        return ventasMacStore;
    }

    public void setVentasMacStore(int ventasMacStore) {
        this.ventasMacStore = ventasMacStore;
    }

    @Override
    public String toString() {
        return super.toString() + "\n MacStore: " + "\n Ventas MacStore: " + ventasMacStore;
    }
    
    
    
}
