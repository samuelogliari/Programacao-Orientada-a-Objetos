/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0903;

/**
 *
 * @author samuc
 */
public class atividade6 {

    public static void main(String[] args) {
        int numero = Entrada.leiaInt("insira um número");
        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
            
        }
        else if (numero < 0) {
            for (int i = 1; i >= numero; i--) {
                System.out.println(i);
                
            }
        
        }
        else System.out.println(1);
    System.exit(0); }
   
}
