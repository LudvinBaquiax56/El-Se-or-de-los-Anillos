/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Heroes;

/**
 *
 * @author baquiax
 */
public class Humano extends Heroe{
    
    private static final int  VIDA = 180;
    
    public Humano(String nombre) {
        super(nombre, VIDA);
    }
    
    @Override
    public String toString() {
        return "Humano{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }
    
}
