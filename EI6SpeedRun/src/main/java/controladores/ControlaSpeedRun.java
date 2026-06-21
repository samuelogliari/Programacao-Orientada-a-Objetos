/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.SpeedRun;
import java.util.ArrayList;

/**
 *
 * @author samuc
 */
public class ControlaSpeedRun {
    
    
    private ArrayList<SpeedRun> speedRuns = new ArrayList();
    private int codigo = 1;
    
    public void salvar(SpeedRun sr){
        sr.setCodigo(codigo);
        speedRuns.add(sr);
        codigo++;
    }
    
    public void editar (SpeedRun sr){
        for (int i = 0; i < speedRuns.size(); i++) {
            if (speedRuns.get(i).getCodigo() == sr.getCodigo() ){
            speedRuns.set(i, sr);
            break;
            }
            
        }
    }
    
    public void excluir(int codigo){
        for (int i = 0; i < speedRuns.size(); i++) {
            if (speedRuns.get(i).getCodigo() == codigo){
            speedRuns.remove(i);
            break;
            }
            
        }
    }
    
  public SpeedRun recuperarUm(int codigo) {
        for (int i = 0; i < speedRuns.size(); i++) {
            if (speedRuns.get(i).getCodigo() == codigo) {
                return speedRuns.get(i);
            }
        }
        return null;
    }
 
  
  public ArrayList<SpeedRun> recuperarTodos() {
    return speedRuns;
  }
}
