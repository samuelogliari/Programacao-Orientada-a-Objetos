/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Entrada.leiaInt("qual seu número?");
            
        }
        int maior = numeros[0];
        int menor = numeros[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        
         for (int i = 1; i < 10; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
                indiceMaior = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                indiceMenor = i;
            }
        }
        System.out.println("Maior número: " + maior + " (posição " + indiceMaior + ")");
        System.out.println("Menor número: " + menor + " (posição " + indiceMenor + ")");

        System.exit(0);
    }
}
