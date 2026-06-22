/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exaviao;

/**
 *
 * @author samuel.ogliari
 */
import apoio.Entrada;
import controladores.ControlaAviao;
import entidades.Aviao;

public class ExAviao {

    public static void main(String[] args) {
        ControlaAviao ca = new ControlaAviao();

//int codigo, String cor, String tipo, int numeroPassageiros
        int opcao = 0;
        while (opcao != 99) {
            opcao = Entrada.leiaInt("Escolha uma opção\n"
                    + "[1] Cadastrar um Avião\n"
                    + "[2] Listar todos os Aviões\n"
                    + "[3] Excluir um avião\n"
                    + "[4] Editar um avião\n"
                    + "[5] Excluir com método de objeto\n"
                    + "[99] Sair do sistema");

            if (opcao == 1) {
                int codigo = Entrada.leiaInt("Digite o codigo do avião");
                String cor = Entrada.leiaString("Digite a cor do avião");
                String tipo = Entrada.leiaString("Qual o tipo do avião?");
                int numeroPassageiros = Entrada.leiaInt("Quantos passageiros cabem?");
                Aviao a = new Aviao(codigo, cor, tipo, numeroPassageiros);
                ca.salvar(a);
            } else if (opcao == 2) {
                ca.imprimir();

            } else if (opcao == 3) {
                ca.imprimir();
                int codigo = Entrada.leiaInt("Informe o código que você deseja excluir");
                ca.excluir(codigo);
             } else if (opcao == 4) {
                ca.imprimir();
                int codigo = Entrada.leiaInt("Informe o código que você deseja editar");
                String cor = Entrada.leiaString("Digite a nova cor");
                String tipo = Entrada.leiaString("Digite o novo tipo");
                int numeroPassageiros = Entrada.leiaInt("Quantos passageiros terá?");
                ca.editar(codigo, cor, tipo, numeroPassageiros);
             } else if (opcao == 5) {
                int codigo = Entrada.leiaInt("Informe o código que você deseja editar");
                Aviao temp = ca.procura(codigo);
                if(temp != null){
                    ca.excluir(temp);
                }
            
        }
    }
    }
}
