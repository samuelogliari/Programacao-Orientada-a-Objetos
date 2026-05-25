package controladores;

import entidades.Compra;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class ControlaCompras {

    private ArrayList<Compra> compras = new ArrayList();
    private int codigo = 1;

    public void salvar(Compra com) {
        com.setCodigo(codigo);
        compras.add(com);
        codigo++;
    }

    public void listar() {
        for (int i = 0; i < compras.size(); i++) {
            Compra compraTemp = compras.get(i);
            compraTemp.imprimeAtributos();
        }

    }

    public void excluir(int codigoExclusao) {
        Compra temp = consultar(codigoExclusao);
        if (temp != null){
        System.out.println("Excluindo compra: " + temp.getCodigo());
            System.out.println("------------------------------");
        compras.remove(temp);}
    }

    public void editar(int codigo, LocalDate novoDataCompra, Double novoValorTotal) {
        Compra temp = consultar(codigo);
        if (temp != null) {
            if (novoDataCompra != null) {
                temp.setDataCompra(novoDataCompra);
            }
            if (novoValorTotal != null) {
                temp.setValorTotal(novoValorTotal);
            }

        }
    }

    public Compra consultar(int codigo) {
        for (int i = 0; i < compras.size(); i++) {
            Compra compraTemp = compras.get(i);
            if (compraTemp.getCodigo() == codigo) {
               
                return compraTemp;
            }

        }
        System.out.println("Compra não encontrada!");
        return null;
    }
}
