
package com.mycompany.lojaprojetopratico1;

import apoio.Entrada;
import controladores.ControlaProdutos;
import entidades.Produto;


/**
 *
 * @author samuc
 */
public class Produtos {
    
    public void menuProdutos(ControlaProdutos cp) {
        
      
        int opcao = 99;
        while (opcao != 0) {
            opcao = Entrada.leiaInt("Escolha uma opção\n"
                    + "[1] Cadastrar um produto\n"
                    + "[2] Listar todos os produtos\n"
                    + "[3] Consultar um produto\n"
                    + "[4] Editar um produto\n"
                    + "[5] Excluir um produto\n"
                    + "[0] Sair do sistema");

            if (opcao == 1) { //criar
                int codigo = 0;
                String produto = Entrada.leiaString("Digite o produto:");
                String descricao = Entrada.leiaString("Digite a descrição do produto:");
                int estoque = Entrada.leiaInt("Digite a quantidade atual do produto:");
                String categoria = Entrada.leiaString("Digite a categoria do produto:");
                

                Produto p = new Produto(codigo, produto, descricao, estoque, categoria);

                cp.salvar(p);
            } else if (opcao == 2) { //listar
                System.out.println("Listando todos os produtos: ");
                cp.listar();

            } else if (opcao == 3) { //consultar
                System.out.println("Listando todos os produtos: ");
                cp.listar();
                int codigo = Entrada.leiaInt("Digite o codigo do produto que quer listar: ");
                Produto temp = cp.consultar(codigo);
                if (temp != null) {
                temp.imprimeAtributos();}
                

            } else if (opcao == 4) { //editar
                System.out.println("Listando todos os produtos: ");
                cp.listar();
                int codigo = Entrada.leiaInt("Digite o codigo do produto que quer editar: ");
                int editar = 99;

                String novoProduto = null;
                String novoDescricao = null;
                int novoEstoque = -1;
                String novoCategoria = null;

                while (editar != 0) { 
                    editar = Entrada.leiaInt("Escolha uma opção\n"
                            + "[1] Editar produto.\n"
                            + "[2] Editar descricao.\n"
                            + "[3] Editar estoque.\n"
                            + "[4] Editar categoria.\n"
                            + "[5] Salvar.\n"
                            + "[0] Sair do sistema");
                    if (editar == 1) {
                        novoProduto = Entrada.leiaString("Qual o novo produto?");
                    } else if (editar == 2) {
                        novoDescricao = Entrada.leiaString("Qual a nova descricao?");
                    } else if (editar == 3) {
                        novoEstoque = Entrada.leiaInt("Qual o novo estoque?");
                    } else if (editar == 4) {
                        novoCategoria = Entrada.leiaString("Qual a nova categoria do produto?");
                    } else if (editar == 5) {
                        cp.editar(codigo, novoProduto, novoDescricao, novoEstoque, novoCategoria);
                    }
                }

            } else if (opcao == 5) { //excluir
                System.out.println("Listando todos os produtos: ");
                cp.listar();
   
                int codigoExclusao = Entrada.leiaInt("Digite o codigo do produto que quer excluir: ");
                cp.excluir(codigoExclusao);
            }

        }
    }
}

