/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejer5;

/**
 *
 * @author Miguel
 */
public class Motor {
    
    private int litrosAceite, cv;

    public Motor(int cv) {
        this.cv = cv;
        setLitrosAceite(0);
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public void aumentaAceite(int litrosAceite) {
        this.litrosAceite += litrosAceite;
    }
}
