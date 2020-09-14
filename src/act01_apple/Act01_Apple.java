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
        
        Pais pais = new Pais();
        
        pais.setNombre("Canada");
        pais.setCodigoPostal(347800);
         
        pais.addUnidades(new Unidades(100)); //Agregación
        pais.addCentros(new CentrosDeDistribucion("Toronto",1500,"Disponible"));
        
        Pais pais2 = new Pais();
        
        pais2.setNombre("Reino Unido");
        pais2.setCodigoPostal(347800);
        
        pais2.addUnidades(new Unidades(150)); //Agregación
        pais2.addCentros(new CentrosDeDistribucion("Londres",2000,"Disponible"));
         
//         pres.addFechaDeLLegada(new FechaDeLlegada(2,12,12));//Agregación
        
        Software producto = new Software();
        producto.addFechaDeSalida(new FechaDeSalida("Enero",12,12));//Agregación
        pais.addFechaDeLlegada(new FechaDeLlegada("Febrero",12,12));//Agregación
        producto.setNombre("iMovie");
        producto.setCategoria("Software");
        producto.setPrecio(100);
        producto.setIdSoftware(1);
        producto.setCategoriaSoftware("Video");
        producto.setVersionSoftware(1);
        
        Hardware producto2 = new Hardware();
        producto2.addFechaDeSalida(new FechaDeSalida("Febrero",12,12));//Agregación
        pais2.addFechaDeLlegada(new FechaDeLlegada("Marzo",12,12));//Agregación
        producto2.setNombre("iPhone 12");
        producto2.setCategoria("Hardware");
        producto2.setPrecio(35000);
        producto2.setIdHardware(1);
        producto2.setCategoriaHardware("Movil");
        producto2.setVersionHardware(1);
        
        System.out.println("--------------------------------------");
        System.out.println(producto);
        System.out.println(pais);
        System.out.println("--------------------------------------");
        System.out.println(producto2);
        System.out.println(pais2);
        System.out.println("--------------------------------------");
    }
    
}
