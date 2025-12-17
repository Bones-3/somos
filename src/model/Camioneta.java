/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fabia
 */
public class Camioneta extends Vehiculo{
    private int capacidadCarga;
   
    //Constructor
    public Camioneta() {
    }
    
    //Constructor con parametros
    public Camioneta(int capacidadCarga, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }
    
}
