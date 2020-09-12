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
public class FechaDeSalida {
    
    private String month;
    private int day;
    private int year;
    
    public FechaDeSalida(){
        
    }

    public FechaDeSalida(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n Fecha de Salida: " + month + "/" + day + "/" + year;
    }
    
    
    
}
