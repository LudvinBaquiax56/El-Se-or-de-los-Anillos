/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje.Heroes;

import Personaje.Bestias.Bestia;
import Personaje.Bestias.Orco;

/**
 *
 * @author baquiax
 */
public class Elfos extends Heroe {

    private static final int VIDA = 250;

    public Elfos(String nombre) {
        super(nombre, VIDA);
    }

    @Override
    public int getAtaque(Bestia enemigo) {
        int ataque = super.getAtaque(enemigo);
        if (enemigo instanceof Orco) {
            ataque = ataque + Dado.Dado.tirarDados(10, 0, 1, false);
        }
        return ataque;
    }

    @Override
    public String toString() {
        return "Elfo{" + "Nombre: " + super.getNombre() + ", Vida: " + super.getVida()
                + ", Armadura: " + super.getArmadura() + '}';
    }

}
