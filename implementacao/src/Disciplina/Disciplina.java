package Disciplina;

import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable {
    private int id;
    private String nome;
    private int creditos;
    private int periodo;
    private int tipo; // 0 - Obrigatória, 1 - Optativa
    private ArrayList<Integer> alunos;
    private int professor;
    private int cursoId;

    public Disciplina(int id, String nome, int creditos, int periodo, int tipo, ArrayList<Integer> alunos,
            int professor,
            int cursoId) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
        this.periodo = periodo;
        this.tipo = tipo;
        this.alunos = alunos;
        this.professor = professor;
        this.cursoId = cursoId;
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

    public int getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Integer> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Integer> alunos) {
        this.alunos = alunos;
    }

    public int getProfessor() {
        return this.professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    public int getCursoId() {
        return this.cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
}
