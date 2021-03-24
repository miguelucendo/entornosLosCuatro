/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entornosloscuatro;

/**
 *
 * @author Vespertino
 */
public class Perro {
    private int edad;
    private String nombreDueño;

    public Perro(int edad, String nombreDueño) {
        this.edad=edad;
        this.nombreDueño=nombreDueño;
    }
    
    public void ladrar(){
        System.out.println("guau");
    }
    
}
