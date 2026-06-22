/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author samuel.ogliari
 */
public class Aviao {
    private int codigo;
    private String cor;
    private String tipo;
    private int numeroPassageiros;

    public int getCodigo() {
        return codigo;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Aviao(int codigo, String cor, String tipo, int numeroPassageiros) {
        this.codigo = codigo;
        this.cor = cor;
        this.tipo = tipo;
        this.numeroPassageiros = numeroPassageiros;
    }

    public void imprimeAtributos(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Cor: " + cor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de passageiros: " + numeroPassageiros);
        System.out.println("-------------------------");}

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
       

   
}
