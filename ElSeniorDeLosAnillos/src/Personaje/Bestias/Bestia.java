/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Bestias;

import Personaje.Personaje;

/**
 *
 * @author baquiax
 */
public class Bestia extends Personaje {

    public Bestia(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public String toString() {
        return "Bestia{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }

}
