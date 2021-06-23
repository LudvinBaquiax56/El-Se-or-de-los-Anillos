/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Heroes;

import Personaje.Bestias.Bestia;
import Personaje.Bestias.Orco;
import Personaje.Personaje;

/**
 *
 * @author baquiax
 */
public class Heroe extends Personaje {
    private static final int ATAQUE = 100;

    public Heroe(String nombre, int vida) {
        super(nombre, vida);
    }

    public void recibirDanio(Bestia enemigo) {
        int armadura = 0;
        int ataqueEnemigo = enemigo.getAtaque();
        if (enemigo instanceof Orco) {
            armadura = (int) (super.getArmadura() * 0.9);
        } else {
            armadura = super.getArmadura();
        }
        if (ataqueEnemigo > armadura) {
            int danio = ataqueEnemigo - armadura;
            super.setVida(super.getVida() - danio);
            System.out.println(super.getNombre() + " Recibi, " + danio + " de danio");
        } else {
            System.out.println(super.getNombre() + ", No recibimos danio");
        }
    }

    public int getAtaque(Bestia enemigo) {
        return Dado.Dado.tirarDados(ATAQUE, 0, 2, true);
    }

    @Override
    public String toString() {
        return "Heroe{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }
}
