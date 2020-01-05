package com.wildcodeschool.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShildController {

    @GetMapping("/")
    public String shield() {
        return "Welcome to the Shield";
    }
    
    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }
    
    @GetMapping("/secret-bases")
    public String bases() {
		return  "Amsterdam, Barcelone, Berlin, Bruxelles, Bucarest, Budapest, Dublin, Lisbonne, Londres, Madrid, Milan, Biarritz, Bordeaux, La Loupe 🌲, Lille, Lyon, Marseille, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours";
    }
}