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
public class Act01_Apple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Software producto = new Software();
        FechaDeSalida fecha = new FechaDeSalida();
        
        fecha.setMonth("Enero");
        fecha.setDay(02);
        fecha.setYear(2012);
        
        producto.setNombre("Hola");
        producto.setCategoria("Software");
        producto.setPrecio(100);
        producto.setIdSoftware(1);
        producto.setCategoriaSoftware("Audio");
        producto.setVersionSoftware(1);
        producto.setFecha(fecha);
        
        Pais inglaterra = new Pais();
         FechaDeLlegada fech = new FechaDeLlegada();
        
        fech.setMonth("Febrero");
        fech.setDay(11);
        fech.setYear(2012);
        
        inglaterra.setNombre("Inglaterra");
        inglaterra.setCodigoPostal("L10-L19");
        inglaterra.setProd(producto);
        inglaterra.setFech(fech);
        
        
        System.out.println(producto);
        System.out.println(inglaterra);

        
        
    }
    
}
