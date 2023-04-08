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
    //Application to describe an outfit
    
    // member variables for each garment type
    private Tops top;
    private Pants pants;
    private Shoes shoes;
    
    // constructor
    public Application(OutfitFactory factory) {
        top = factory.getTop();
        pants = factory.getPants();
        shoes = factory.getShoes();
    }
    
    // method to show garment variant
    public void showOutfit(){
        top.garmentType();
        pants.garmentType();
        shoes.garmentType();
    }
    
    
}
