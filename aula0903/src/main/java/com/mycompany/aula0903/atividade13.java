/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade13 {

    public static void main(String[] args) {
        int a = Entrada.leiaInt("qual seu primeiro número?");
        int b = Entrada.leiaInt("qual seu segundo número?");
        int c = Entrada.leiaInt("qual seu terceiro número?");

        int resultado = (a + b) / c;

        if (resultado > 10) {
            System.out.println("Seu resultado é maior que dez.");
        }
        else {
            System.out.println("Seu resultado é menor que dez.");
        }
        System.exit(0);
    }
}
