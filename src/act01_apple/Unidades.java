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
public class Unidades {
    
    private int unidadesTotales;
    
    public Unidades(){
        
    }

    public Unidades(int unidadesTotales) {
        this.unidadesTotales = unidadesTotales;
    }

    public int getUnidadesTotales() {
        return unidadesTotales;
    }

    public void setUnidadesTotales(int unidadesTotales) {
        this.unidadesTotales = unidadesTotales;
    }

    @Override
    public String toString() {
        return "" + unidadesTotales;
    }
    
    
   
}
