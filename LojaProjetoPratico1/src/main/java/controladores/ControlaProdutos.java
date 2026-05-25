package controladores;

import entidades.Produto;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class ControlaProdutos {

    private ArrayList<Produto> produtos = new ArrayList();
    private int codigo = 1;

    public void salvar(Produto p) {
        p.setCodigo(codigo);
        produtos.add(p);
        codigo++;
    }

    public void listar() {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoTemp = produtos.get(i);
            produtoTemp.imprimeAtributos();
        }

    }

    public void excluir(int codigoExclusao) {
        Produto temp = consultar(codigoExclusao);
        if (temp != null) {
            System.out.println("Excluindo produto " + temp.getProduto());
            System.out.println("----------------------");
            produtos.remove(temp);
        }
    }

    public void editar(int codigo, String novoProduto, String novoDescricao, int novoEstoque, String novoCategoria) {
        Produto temp = consultar(codigo);
        if (temp != null) {
            if (novoProduto != null) {
                temp.setProduto(novoProduto);
            }
            if (novoDescricao != null) {
                temp.setDescricao(novoDescricao);
            }
            if (novoEstoque != -1) {
                temp.setEstoque(novoEstoque);
            }
            if (novoCategoria != null) {
                temp.setCategoria(novoCategoria);
            }
        }
    }

    public Produto consultar(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoTemp = produtos.get(i);
            if (produtoTemp.getCodigo() == codigo) {

                return produtoTemp;
            }

        }
        System.out.println("Produto não encontrado!");
        return null;
    }
}
