/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Bug;
import java.util.ArrayList;

/**
 *
 * @author samuel.ogliari
 */
public class ControlaBug {

    private static ArrayList<Bug> bugs = new ArrayList();
    private static int id = 1;

    public void salvar(Bug b) {
        b.setId(id);
        bugs.add(b);
        id++;
    }

    public void editar(Bug b) {
        for (int i = 0; i < bugs.size(); i++) {
            if (bugs.get(i).getId() == b.getId()) {
                bugs.set(i, b);
                break;
            }
        }
    }

    public void excluir(int id) {
        for (int i = 0; i < bugs.size(); i++) {
            if (bugs.get(i).getId() == id) {
                bugs.remove(i);
                break;
            }
        }
    }

    public Bug recuperarUm(int id) {
        for (int i = 0; i < bugs.size(); i++) {
            if (bugs.get(i).getId() == id) {
                return bugs.get(i);
            }
        }
        return null;
    }

    public ArrayList<Bug> recuperarTodos() {
        return bugs;
    }
}
