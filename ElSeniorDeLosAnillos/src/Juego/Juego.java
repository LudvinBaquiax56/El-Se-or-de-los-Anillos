/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Personaje.Bestias.Bestia;
import Personaje.Bestias.Orco;
import Personaje.Bestias.Trasgo;
import Personaje.Heroes.Elfos;
import Personaje.Heroes.Heroe;
import Personaje.Personaje;

/**
 *
 * @author baquiax
 */
public class Juego {

    private Heroe[] ejercitoHeroes;
    private Bestia[] ejercitoBestias;

    private final int TAMANIO = 5;

    public Juego() {
        this.ejercitoHeroes = new Heroe[TAMANIO];
        this.ejercitoBestias = new Bestia[TAMANIO];
        iniciarHeroes();
        iniciarBestias();
        presentarEjercito(ejercitoHeroes);
        presentarEjercito(ejercitoBestias);
    }

    public void iniciarHeroes() {
        int random;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.Dado.tirarDados(3, 1, 1, false);
            switch (random) {
                case 1:
                    ejercitoHeroes[i] = new Elfos("Elfo " + String.valueOf(i + 1));
                    break;
                case 2:
                    ejercitoHeroes[i] = new Elfos("Hobbit " + String.valueOf(i + 1));
                    break;
                case 3:
                    ejercitoHeroes[i] = new Elfos("Humano " + String.valueOf(i + 1));
                    break;
                default:
                    ejercitoHeroes[i] = new Elfos("Hobbit " + String.valueOf(i + 1));
                    break;
            }
        }
    }

    public void iniciarBestias() {
        int random;
        for (int i = 0; i < ejercitoBestias.length; i++) {
            random = Dado.Dado.tirarDados(3, 1, 1, false);
            switch (random) {
                case 1:
                    ejercitoBestias[i] = new Orco("Orcos " + String.valueOf(i + 1));
                    break;
                case 2:
                    ejercitoBestias[i] = new Trasgo("Trasgo " + String.valueOf(i + 1));
                    break;
                default:
                    ejercitoBestias[i] = new Orco("Orco " + String.valueOf(i + 1));
                    break;
            }
        }
    }

    public void presentarEjercito(Personaje[] ejercito) {
        if (ejercito[0] instanceof Heroe) {
            System.out.println("-----Heroes-----");
        } else {
            System.out.println("-----Bestias-----");
        }
        for (int i = 0; i < ejercito.length; i++) {
            System.out.println((i + 1) + ". " + ejercito[i].getNombre());
        }
    }

}
