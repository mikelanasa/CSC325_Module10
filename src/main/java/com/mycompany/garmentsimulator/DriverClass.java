/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garmentsimulator;

/**
 *
 * @author mikel
 */
public class DriverClass {
    
    private static Application configureApplication() {
        
        Application app;
        OutfitFactory factory;

        String type = "casual";
        
        if (type.contains("professional")) {
            factory = new ProfessionalOutfitFactory();
            app = new Application(factory);
        }
        else if (type.contains("casual")) {
            factory = new CasualOutfitFactory();
            app = new Application(factory);
        }
        else {
            factory = new PartyOutfitFactory();
            app = new Application(factory);
        }
        return app; 
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}
