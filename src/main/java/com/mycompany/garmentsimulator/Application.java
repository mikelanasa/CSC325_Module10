/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 *
 * @author mikel
 */
public class Application {
    //Application to describe a publication
    
    private Tops top;
    private Pants pants;
    private Shoes shoes;
    
    public Application(OutfitFactory factory) {
        top = factory.getTop();
        pants = factory.getPants();
        shoes = factory.getShoes();
    }
    
    public void revealContent(){
        top.garmentType();
        pants.garmentType();
        shoes.garmentType();
    }
    
    
}
