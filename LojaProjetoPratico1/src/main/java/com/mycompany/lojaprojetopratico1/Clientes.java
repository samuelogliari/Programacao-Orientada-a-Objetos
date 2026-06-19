/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaprojetopratico1;

import apoio.Entrada;
import controladores.ControlaClientes;
import entidades.Cliente;
import java.time.LocalDate;

/**
 *
 * @author samuc
 */
public class Clientes {

    public void menuClientes(ControlaClientes cc) {

        int opcao = 99;
        while (opcao != 0) {
            opcao = Entrada.leiaInt("Escolha uma opção\n"
                    + "[1] Cadastrar um cliente\n"
                    + "[2] Listar todos os clientes\n"
                    + "[3] Consultar um cliente\n"
                    + "[4] Editar um cliente\n"
                    + "[5] Excluir um cliente\n"
                    + "[6] Buscar um cliente\n"
                    + "[0] Sair do sistema");

            if (opcao == 1) { //criar
                int codigo = 0;
                String nome = Entrada.leiaString("Digite o nome do cliente:");
                String cpf = Entrada.leiaString("Digite o CPF do cliente:  --(11 Números)-- ");
                String estado = Entrada.leiaString("Digite o estado do cliente:");
                boolean ativo = Entrada.leiaBoolean("Digite se o cliente está ativo: S/N");
                LocalDate dataCriacao = LocalDate.now();

                if (cpf.length() == 11) { //validação do cpf
                Cliente c = new Cliente(codigo, nome, cpf, estado, ativo, dataCriacao);

                cc.salvar(c);
                    System.out.println("Cliente cadastrado com sucesso");
                } else {System.out.println("Cpf inválido!");}
            } else if (opcao == 2) { //listar
                System.out.println("Listando todos os clientes: ");
                cc.listar();

            } else if (opcao == 3) { //consultar
                System.out.println("Listando todos os clientes: ");
                cc.listar();
                int codigo = Entrada.leiaInt("Digite o codigo do cliente que quer listar: ");
                Cliente temp = cc.consultar(codigo);
                if (temp != null) {
                    temp.imprimeAtributos();
                }

            } else if (opcao == 4) { //editar
                System.out.println("Listando todos os clientes: ");
                cc.listar();
                int codigo = Entrada.leiaInt("Digite o codigo do cliente que quer editar: ");
                int editar = 99;

                String novoNome = null;
                String novoCpf = null;
                String novoEstado = null;
                Boolean novoAtivo = null;

                while (editar != 0) {
                    editar = Entrada.leiaInt("Escolha uma opção\n"
                            + "[1] Editar nome.\n"
                            + "[2] Editar cpf.\n"
                            + "[3] Editar estado.\n"
                            + "[4] Editar se o cliente está ativo.\n"
                            + "[5] Salvar.\n"
                            + "[0] Sair do sistema");
                    if (editar == 1) {
                        novoNome = Entrada.leiaString("Qual o novo nome?");
                    } else if (editar == 2) {
                        novoCpf = Entrada.leiaString("Qual o novo cpf?");
                    } else if (editar == 3) {
                        novoEstado = Entrada.leiaString("Qual o novo estado?");
                    } else if (editar == 4) {
                        novoAtivo = Entrada.leiaBoolean("O cliente está ativo?");
                    } else if (editar == 5) {
                        cc.editar(codigo, novoNome, novoCpf, novoEstado, novoAtivo);
                    }
                }

            } else if (opcao == 5) { //excluir
                System.out.println("Listando todos os clientes: ");
                cc.listar();
                int codigoExclusao = Entrada.leiaInt("Digite o codigo do cliente que quer excluir: ");
                cc.excluir(codigoExclusao);
            }
            else if (opcao == 6) { //buscar
                String buscar = Entrada.leiaString("Digite o Nome do cliente: ");
                cc.buscar(buscar);
            }
        }
    }
}
