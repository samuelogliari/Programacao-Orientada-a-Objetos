/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade10 {

    public static void main(String[] args) {
        int numero = Entrada.leiaInt("Digite um numero inteiro");
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                contador++;
            }

        }
        System.out.println("Existem " + contador + " pares até esse numero.");
        System.exit(0);
    }
}
