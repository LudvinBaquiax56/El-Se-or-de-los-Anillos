/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Bestias;

import Personaje.Heroes.Heroe;
import Personaje.Personaje;

/**
 *
 * @author baquiax
 */
public class Bestia extends Personaje {

    private static final int ATAQUE = 90;//110

    public Bestia(String nombre, int vida) {
        super(nombre, vida);
    }

    public void recibirDanio(Heroe enemigo) {
        int armadura = super.getArmadura();
        int ataqueEnemigo = enemigo.getAtaque(this);
        if (ataqueEnemigo > armadura) {
            int danio = ataqueEnemigo - armadura;
            super.setVida(super.getVida() - danio);
            System.out.println(super.getNombre() + " Recibi, " + danio + " de danio");
        } else {
            System.out.println(super.getNombre() + ", No recibimos danio");
        }
    }

    public int getAtaque() {
        return Dado.Dado.tirarDados(ATAQUE, 0, 1, true);
    }

    @Override
    public String toString() {
        return "Bestia{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }

}
