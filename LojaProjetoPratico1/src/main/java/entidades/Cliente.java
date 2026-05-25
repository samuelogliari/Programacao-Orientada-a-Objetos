/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author samuc
 */
public class Cliente {

    private int codigo;
    private String nome;
    private String cpf;
    private String estado;
    private boolean ativo;
    private LocalDate dataCriacao;

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
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome invalido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isEmpty()) {
            this.cpf = cpf;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.isEmpty()) {
            this.estado = estado;
        } else {
            System.out.println("estado invalido.");
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Cliente(int codigo, String nome, String cpf, String estado, boolean ativo, LocalDate dataCriacao) {
        this.codigo = codigo;
        setNome(nome);
        setCpf(cpf);
        setEstado(estado);
        this.ativo = ativo;
        this.dataCriacao = dataCriacao;
    }

    public void imprimeAtributos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("estado: " + estado);
        System.out.println("ativo:  " + ativo);
        System.out.println("-------------------------");
    }

}
