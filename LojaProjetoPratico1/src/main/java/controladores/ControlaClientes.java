/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Cliente;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class ControlaClientes {

    private ArrayList<Cliente> clientes = new ArrayList();
    private int codigo = 1;

    public void salvar(Cliente c) {
        c.setCodigo(codigo);
        clientes.add(c);
        codigo++;
    }

    public void listar() {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente clienteTemp = clientes.get(i);
            clienteTemp.imprimeAtributos();
        }

    }

    public void excluir(int codigoExclusao) {
        Cliente temp = consultar(codigoExclusao);
        if (temp != null) {
            System.out.println("Excluindo cliente " + temp.getNome());
            System.out.println("----------------------");
            clientes.remove(temp);
        }
    }

    public void editar(int codigo, String novoNome, String novoCpf, String novoEstado, Boolean novoAtivo) {
        Cliente temp = consultar(codigo);
        if (temp != null) {
            if (novoNome != null) {
                temp.setNome(novoNome);
            }
            if (novoCpf != null) {
                temp.setCpf(novoCpf);
            }
            if (novoEstado != null) {
                temp.setEstado(novoEstado);
            }
            if (novoAtivo != null) {
                temp.setAtivo(novoAtivo);
            }
        }
    }

    public Cliente buscar(String buscar) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getNome().equals(buscar)) {
                System.out.println("O nome do cliente é" + cliente.getNome() );
                return cliente;
            }

        }
        return null;
    }

    public Cliente consultar(int codigo) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente clienteTemp = clientes.get(i);
            if (clienteTemp.getCodigo() == codigo) {
               
                return clienteTemp;

            }

        }
        System.out.println("Cliente não encontrado!");
        return null;
    }
}
