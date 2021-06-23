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
public class Trasgo extends Bestia {

    private static final int VIDA = 325;

    public Trasgo(String nombre) {
        super(nombre, VIDA);
    }
    
    @Override
    public String toString() {
        return "Trasgo{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }

}
