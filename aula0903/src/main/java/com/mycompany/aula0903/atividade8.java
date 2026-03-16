/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade8 {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 10; i++) {
            String nome = Entrada.leiaString("Qual o nome que deseja inserir?");
            if (nome.equalsIgnoreCase("Juca")) {
                contador++;
            }

        }
        System.out.println("Quantidade de nomes Juca: " + contador);
        System.exit(0);
    }
}
