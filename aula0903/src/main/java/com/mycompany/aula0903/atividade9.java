/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade9 {

    public static void main(String[] args) {
        int comecaA = 0;
        int terminaO = 0;
        for (int i = 1; i <= 10; i++) {
            String nome = Entrada.leiaString("Escreva o nome desejado:");
            nome = nome.toUpperCase();
            if (nome.startsWith("A")) {
                comecaA++;
            } else if (nome.endsWith("O")) {
                terminaO++;
            }

        }
        System.out.println("Quantidade de nomes que iniciam com A: " + comecaA);
        System.out.println("Quantidade de nomes que terminam com O: " + terminaO);
        System.exit(0);
    }
}
