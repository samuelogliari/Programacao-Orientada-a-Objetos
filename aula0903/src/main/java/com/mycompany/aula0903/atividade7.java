/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade7 {
    public static void main(String[] args) {
        int numero = Entrada.leiaInt("Insira um número para ver todos os pares até tal.");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0){System.out.println(i);}
            
        }
   System.exit(0); }
}
