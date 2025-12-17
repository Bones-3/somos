/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.ViewHome;

/**
 *
 * @author Fabia
 */
public class ControllerHome {
    private ViewHome vista;
  
    public ControllerHome() {
        this.vista = new ViewHome();
    }
    
    public void iniciarVista() {
        vista.setLocationRelativeTo(null);
    }
}
