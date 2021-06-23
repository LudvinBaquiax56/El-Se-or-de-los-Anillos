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

    private final int TAMANIO = 3;

    public Juego() {
        this.ejercitoHeroes = new Heroe[TAMANIO];
        this.ejercitoBestias = new Bestia[TAMANIO];
        iniciarHeroes();
        iniciarBestias();
        presentarEjercito(ejercitoHeroes);
        presentarEjercito(ejercitoBestias);
    }

    public void jugar() {
        int turno = 1;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("                 Turno No. " + turno);
            System.out.println("Heroes (" + ejercitoHeroes.length + ")");
            System.out.println("Bestias (" + ejercitoBestias.length + ")");
            System.out.println("-----------------------------------------------------");
            for (int i = 0; i < ejercitoBestias.length && i < ejercitoHeroes.length; i++) {
                System.out.println(".....Batalla No. " + (i + 1) + ".....");
                System.out.println(ejercitoHeroes[i].getNombre() + " Vs " + ejercitoBestias[i].getNombre());
                ejercitoHeroes[i].recibirDanio(ejercitoBestias[i]);
                ejercitoBestias[i].recibirDanio(ejercitoHeroes[i]);
                System.out.println("");
            }
            if (validarEjercito(ejercitoHeroes)) {
                reducirEjercitoHeroes(ejercitoHeroes);
            }
            if (validarEjercito(ejercitoBestias)) {
                reducirEjercitoBestias(ejercitoBestias);
            }
            turno++;
        } while (validarEjercito(ejercitoHeroes) && validarEjercito(ejercitoBestias));
        reducirEjercitoHeroes(ejercitoHeroes);
        reducirEjercitoBestias(ejercitoBestias);
        declararGanador();
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

    public void reducirEjercitoHeroes(Heroe[] ejercito) {
        int bajas = contarBajarEjercito(ejercito);
        Heroe[] aux = new Heroe[ejercito.length - bajas];
        int contador = 0;
        for (int i = 0; i < ejercito.length; i++) {
            if (ejercito[i].vivo()) {
                aux[contador] = ejercito[i];
                contador++;
            }
        }
        ejercitoHeroes = aux;
    }

    public void reducirEjercitoBestias(Bestia[] ejercito) {
        int bajas = contarBajarEjercito(ejercito);
        Bestia[] aux = new Bestia[ejercito.length - bajas];
        int contador = 0;
        for (int i = 0; i < ejercito.length; i++) {
            if (ejercito[i].vivo()) {
                aux[contador] = ejercito[i];
                contador++;
            }
        }
        ejercitoBestias = aux;
    }

    public boolean validarEjercito(Personaje[] ejercito) {
        for (int i = 0; i < ejercito.length; i++) {
            if (ejercito[i].vivo()) {
                return true;
            }
        }
        return false;
    }

    public int contarBajarEjercito(Personaje[] ejercito) {
        int bajas = 0;
        for (int i = 0; i < ejercito.length; i++) {
            if (!ejercito[i].vivo()) {
                bajas++;
            }
        }
        return bajas;
    }

    public void declararGanador() {
        System.out.println("Heroes (" + ejercitoHeroes.length + ")");
        System.out.println("Bestias (" + ejercitoBestias.length + ")");
        if (ejercitoBestias.length == ejercitoHeroes.length) {
            System.out.println("------------------Empate--------------------");
        } else if (ejercitoBestias.length > ejercitoHeroes.length) {
            System.out.println("--------------Ganaron las Bestias-----------");
        } else if (ejercitoHeroes.length > ejercitoBestias.length) {
            System.out.println("--------------Ganaron los Heroes-------------");
        }
    }

}
