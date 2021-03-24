/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entornosloscuatro;

/**
 *
 * @author Miguel
 */
public class Cuadrado extends Figura{
 
    private int base, altura;
    
    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
