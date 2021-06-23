/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado;

/**
 *
 * @author baquiax
 */
public class Dado {

    public Dado() {
        
    }
    
    public static int tirarDados(int maximo, int minimo, int noDados, boolean mensaje){
        int resultado = minimo;
        int dado;
        for (int i = 0; i < noDados; i++) {
            dado = (int)(Math.random()*(maximo-minimo+1)+minimo);
            if (mensaje) {
                System.out.println("Dado no. " + (i+1) + "--" + dado );
            }
            if (dado > resultado) {
                resultado = dado;
            }
        }
        return resultado;
    }
}
