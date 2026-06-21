/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class ControlaCliente {
    private static ArrayList<Cliente> clientes = new ArrayList(); 
    private static int codigo = 1;
    
    public void salvar(Cliente c){
    c.setCodigo(codigo);
    clientes.add(c);
    codigo++;
    }
    
    public void imprimeTodos() {
    for (int i = 0; i < clientes.size(); i++) {
        clientes.get(i).imprimeTodos();
    }
}
}
