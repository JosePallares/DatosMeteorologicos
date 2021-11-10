/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosmeteorologicos;


public class Datos {
    double temp_max;
    double temp_min;
    double presion;
    double pluviometria;
    
    public Datos (double temp_max, double temp_min, double presion, double pluviometria){
        this.temp_max = temp_max;
        this.temp_min = temp_min;
        this.presion = presion;
        this.pluviometria = pluviometria;
    }
}
