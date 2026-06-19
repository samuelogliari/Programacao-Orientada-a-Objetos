/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Processador;
import java.util.ArrayList;

/**
 *
 * @author lucas.heberle
 */
public class ControlaProcessadores {

    private ArrayList<Processador> processadores = new ArrayList();
    private int codigo = 1;

    public void salvar(Processador c) {
        c.setCodigo(codigo);

        processadores.add(c);

        codigo++;
    }

    public void editar(Processador p) {
        for (int i = 0; i < processadores.size(); i++) {
            if (processadores.get(i).getCodigo() == p.getCodigo()) {
                processadores.set(i, p);
                break;
            }
        }
    }

    public void excluir(int codigo) {
        for (int i = 0; i < processadores.size(); i++) {
            if (processadores.get(i).getCodigo() == codigo) {
                processadores.remove(i);
                break;
            }
        }
    }

    public Processador recuperarUm(int codigo) {
        for (int i = 0; i < processadores.size(); i++) {
            if (processadores.get(i).getCodigo() == codigo) {
                return processadores.get(i);
            }
        }
        return null;
    }

    public void imprimeTodos() {
        for (int i = 0; i < processadores.size(); i++) {
            Processador temp = processadores.get(i);
            temp.imprimeAtributos();
        }
    }

    public ArrayList<Processador> recuperarTodos() {
        return processadores;
    }
}
