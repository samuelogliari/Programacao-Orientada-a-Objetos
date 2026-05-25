
package entidades;



/**
 *
 * @author samuc
 */
public class Produto {

    private int codigo;
    private String produto;
    private String descricao;
    private int estoque;
    private String categoria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
           if (produto != null && !produto.isEmpty()) {

        this.produto = produto;

    } else {

        System.out.println("Produto invalido.");
    }
}

    public String getDescricao() {
        return descricao;
    }

   public void setDescricao(String descricao) {

    if (descricao != null && !descricao.isEmpty()) {

        this.descricao = descricao;

    } else {

        System.out.println("Descricao invalida.");
    }
}

    public int getEstoque() {
        return estoque;
    }

   public void setEstoque(int estoque) {

    if (estoque >= 0) {

        this.estoque = estoque;

    } else {

        System.out.println("Estoque invalido.");
    }
}

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {

    if (categoria != null && !categoria.isEmpty()) {

        this.categoria = categoria;

    } else {

        System.out.println("Categoria invalida.");
    }
}
    


    public Produto(int codigo, String produto, String descricao, int estoque, String categoria) {
        this.codigo = codigo;
        this.produto = produto;
        this.descricao = descricao;
        this.estoque = estoque;
        this.categoria = categoria;
       
    }

    public void imprimeAtributos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("produto: " + produto);
        System.out.println("descricao: " + descricao);
        System.out.println("estoque: " + estoque);
        System.out.println("categoria:  " + categoria);
        System.out.println("-------------------------");
    }

}
