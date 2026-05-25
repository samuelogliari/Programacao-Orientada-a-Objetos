package com.mycompany.lojaprojetopratico1;

import apoio.Entrada;
import controladores.ControlaCompras;
import controladores.ControlaClientes;
import controladores.ControlaProdutos;
import entidades.Compra;
import entidades.Cliente;
import entidades.Produto;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class Compras {

    public void menuCompras(ControlaCompras ccom, ControlaClientes cc, ControlaProdutos cp) {

        int opcao = 99;
        while (opcao != 0) {
            opcao = Entrada.leiaInt("Escolha uma opção\n"
                    + "[1] Cadastrar uma compra\n"
                    + "[2] Listar todas as compras\n"
                    + "[3] Consultar uma compra\n"
                    + "[4] Editar uma compra\n"
                    + "[5] Excluir uma compra\n"
                    + "[0] Sair do sistema");

            if (opcao == 1) { //criar

                int codigo = 0;

                System.out.println("Listando todos os clientes:");
                cc.listar();

                int codigoCliente = Entrada.leiaInt("Digite o codigo do cliente:");

                Cliente c = cc.consultar(codigoCliente);

                if (c != null && c.isAtivo()) {

                    ArrayList<Produto> produtos = new ArrayList<>();

                    int qtdProdutos = Entrada.leiaInt("Quantos produtos deseja adicionar?");

                    for (int i = 0; i < qtdProdutos; i++) {

                        System.out.println("Listando todos os produtos:");
                        cp.listar();

                        int codigoProduto = Entrada.leiaInt("Digite o codigo do produto:");

                        Produto p = cp.consultar(codigoProduto);

                        if (p != null) {

                            if (p.getEstoque() > 0) {

                                produtos.add(p);

                                p.setEstoque(p.getEstoque() - 1);

                                System.out.println("Produto adicionado na compra!");

                            } else {

                                System.out.println("Produto sem estoque!");
                            }

                        } else {

                            System.out.println("Produto não encontrado!");
                        }
                    }

                    if (produtos.size() > 0) {

                        LocalDate dataCompra = LocalDate.now();

                        double valorTotal = Entrada.leiaDouble("Digite o valor total:");

                        Compra com = new Compra(codigo, c, produtos, dataCompra, valorTotal);

                        ccom.salvar(com);

                        System.out.println("Compra cadastrada com sucesso!");

                    } else {

                        System.out.println("Nenhum produto foi adicionado!");
                    }

                } else if (c != null && !c.isAtivo()) {

                    System.out.println("Cliente inativo! Compra bloqueada.");

                } else {

                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 2) { //listar
                System.out.println("Listando todos os produtos: ");
                ccom.listar();

            } else if (opcao == 3) { //consultar
                System.out.println("Listando todos os produtos: ");
                ccom.listar();
                int codigo = Entrada.leiaInt("Digite o codigo da compra que quer listar: ");
                Compra temp = ccom.consultar(codigo);
                if (temp != null) {
                    temp.imprimeAtributos();
                }

            } else if (opcao
                    == 4) { //editar
                System.out.println("Listando todas as compras: ");
                ccom.listar();
                int codigo = Entrada.leiaInt("Digite o codigo da compra que quer editar: ");
                int editar = 99;

                LocalDate novoDataCompra = null;
                Double novoValorTotal = null;

                while (editar != 0) {
                    editar = Entrada.leiaInt("Escolha uma opção\n"
                            + "[1] Editar data da compra.\n"
                            + "[2] Editar valor total.\n"
                            + "[3] Salvar.\n"
                            + "[0] Sair do sistema");
                    if (editar == 1) {
                        novoDataCompra = LocalDate.now();
                    } else if (editar == 2) {
                        novoValorTotal = Entrada.leiaDouble("Qual o novo valor total?");
                    } else if (editar == 3) {
                        ccom.editar(codigo, novoDataCompra, novoValorTotal);
                    }
                }

            } else if (opcao
                    == 5) { //excluir
                System.out.println("Listando todas as compras: ");
                ccom.listar();
                int codigoExclusao = Entrada.leiaInt("Digite o codigo da compra que quer excluir: ");
                ccom.excluir(codigoExclusao);
            }

        }
    }
}
