/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Heroes;

import Personaje.Personaje;

/**
 *
 * @author baquiax
 */
public class Heroe extends Personaje {

    public Heroe(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public String toString() {
        return "Heroe{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }
}
