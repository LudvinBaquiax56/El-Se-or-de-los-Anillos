/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Bestias;

/**
 *
 * @author baquiax
 */
public class Orco extends Bestia {

    private static final int VIDA = 300;

    public Orco(String nombre) {
        super(nombre, VIDA);
    }
    
    @Override
    public String toString() {
        return "Orco{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }
}
