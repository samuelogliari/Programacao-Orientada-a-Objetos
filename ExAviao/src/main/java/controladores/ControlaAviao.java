/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Aviao;
import java.util.ArrayList;

/**
 *
 * @author samuel.ogliari
 */
public class ControlaAviao {

    private ArrayList<Aviao> avioes = new ArrayList();
    private int codigo = 1;

    public void salvar(Aviao a) {
        a.setCodigo(codigo);
        avioes.add(a);
        codigo++;
    }

    public void imprimir() {
        for (int i = 0; i < avioes.size(); i++) {
            Aviao aviaoTemp = avioes.get(i);
            aviaoTemp.imprimeAtributos();
        }

    }

    public void excluir(int id) {
        Aviao temp = procura(id);
        avioes.remove(temp);
    }

    public void excluir(Aviao a) {
        avioes.remove(a);
    }

    public void editar(int id, String cor, String tipo, int numeroPassageiros) {
        Aviao temp = procura(id);
        if (temp != null) {
            temp.setCor(cor);
            temp.setTipo(tipo);
            temp.setNumeroPassageiros(numeroPassageiros);
        }
    }

    public Aviao procura(int id) {
        for (int i = 0; i < avioes.size(); i++) {
            Aviao aviaoTemp = avioes.get(i);
            if (aviaoTemp.getCodigo() == id) {
                return aviaoTemp;
            }
            
        }
        return null;
    }
}

