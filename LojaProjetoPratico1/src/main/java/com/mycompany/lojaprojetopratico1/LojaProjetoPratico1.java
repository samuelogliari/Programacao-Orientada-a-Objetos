/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lojaprojetopratico1;

import apoio.Entrada;
import controladores.ControlaClientes;
import controladores.ControlaCompras;
import controladores.ControlaProdutos;

/**
 *
 * @author samuc
 */
public class LojaProjetoPratico1 {

    public static void main(String[] args) {
        ControlaClientes cc = new ControlaClientes();
        ControlaProdutos cp = new ControlaProdutos();
        ControlaCompras ccom = new ControlaCompras();
        
        int opcao = -1;
        while (opcao != 0) {
            opcao = Entrada.leiaInt("|----------MENU----------|\n"
                    + "[1] Clientes\n"
                    + "[2] Compras\n"
                    + "[3] Produtos\n"
                    + "[0] Sair");

            if (opcao == 1) {
                Clientes c = new Clientes();
                c.menuClientes(cc);
            } else if (opcao == 2) {
                Compras com = new Compras();
                com.menuCompras(ccom, cc, cp);
            } else if (opcao == 3) {
                Produtos p = new Produtos();
                p.menuProdutos(cp);
            } else if (opcao == 0) {
                System.out.println("Saindo do Menu...");
            }
        }

        System.exit(0);
    }

}
