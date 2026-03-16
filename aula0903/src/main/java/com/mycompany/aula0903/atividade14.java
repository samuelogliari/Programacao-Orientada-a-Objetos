/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade14 {
    public static void main(String[] args) {

        int numero1 = Entrada.leiaInt("Digite o primeiro número:");
        int numero2 = Entrada.leiaInt("Digite o segundo número:");

        int resultado = soma(numero1, numero2);

        System.out.println("Resultado da soma: " + resultado);

        System.exit(0);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
