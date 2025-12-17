/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fabia
 */
public class Automovil extends Vehiculo{
    private String String;
    private boolean aireAcondicionado;
    
    //Constructor Vacio
    public Automovil() {
    }
    
    //Constructor con parametros
    public Automovil(String String, boolean aireAcondicionado, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.String = String;
        this.aireAcondicionado = aireAcondicionado;
    }
    
    
}
