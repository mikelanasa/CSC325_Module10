/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimulator;

/**
 *
 * @author mikel
 */
public class ProfessionalOutfitFactory implements OutfitFactory {
    // class to create a professional outfit
    public Tops getTop() {
        return new ProfessionalTop();
    }
    public Pants getPants() {
        return new ProfessionalPants();
    }
    public Shoes getShoes() {
        return new ProfessionalShoes();
    }
    
}
