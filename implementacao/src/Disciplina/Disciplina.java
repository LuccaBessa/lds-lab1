package Disciplina;

import java.util.ArrayList;

import Aluno.Aluno;

public class Disciplina {
    private int id;
    private String nome;
    private int creditos;
    private ArrayList<Aluno> alunos;

    public Disciplina() {
    };

    public Disciplina(int id, String nome, int creditos, ArrayList<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
        this.alunos = alunos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
