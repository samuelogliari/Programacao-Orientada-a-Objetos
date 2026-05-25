package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class Compra {

    private int codigo;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private LocalDate dataCompra;
    private double valorTotal;

    public Compra(int codigo, Cliente cliente, ArrayList<Produto> produtos, LocalDate dataCompra, double valorTotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataCompra = dataCompra;
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

 public void setValorTotal(double valorTotal) {

    if (valorTotal >= 0) {

        this.valorTotal = valorTotal;

    } else {

        System.out.println("Valor invalido.");
    }
}
    public void imprimeAtributos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + dataCompra);
        System.out.println("Valor total: " + valorTotal);

        System.out.println("Produtos: ");

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoTemp = produtos.get(i);
            System.out.println("||| " + produtoTemp.getProduto());
        }
        System.out.println("-------------------------");
    }

}
