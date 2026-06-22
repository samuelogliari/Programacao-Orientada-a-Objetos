/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author samuel.ogliari
 */
public class Bug {

    private int id;
    private String nome; //nullPointerException
    private String tecnologia; //java/sql
    private String dificuldade; //baixa, media, alta, muito alta, nível mega brain necessário para resolver
    private int coposDeCafe; //esforço

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getCoposDeCafe() {
        return coposDeCafe;
    }

    public void setCoposDeCafe(int coposDeCafe) {
        this.coposDeCafe = coposDeCafe;
    }

    public Bug(String nome, String tecnologia, String dificuldade, int coposDeCafe) {
        this.nome = nome;
        this.tecnologia = tecnologia;
        this.dificuldade = dificuldade;
        this.coposDeCafe = coposDeCafe;
    }
}
