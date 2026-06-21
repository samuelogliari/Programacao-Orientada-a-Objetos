/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author samuc
 */
public class Cliente {

    private int codigo;
    private String nome;
    private int idade;
    private double horasRegistradas;

    public Cliente(String nome, int idade, double horasRegistradas) {
        this.nome = nome;
        this.idade = idade;
        this.horasRegistradas = horasRegistradas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public double getHorasRegistradas() {
        return horasRegistradas;
    }

    public void setHorasRegistradas(double horasRegistradas) {
        this.horasRegistradas = horasRegistradas;
    }

    public void imprimeTodos() {
        System.out.println("Código: " + codigo);
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Horas na Lan House " + horasRegistradas);
        System.out.println("------------------------------------------------------");
    }
}
