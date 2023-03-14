package Aluno;

import Disciplina.Disciplina;
import Usuario.Usuario;

public class Aluno extends Usuario {
    private int totalCreditos;
    private int creditos = 0;
    private Disciplina[] disciplinas;

    public Aluno(int id, String nome, String sobrenome, String senha, int creditos, Disciplina[] disciplinas) {
        this.setId(id);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSenha(senha);
        this.creditos = creditos;
        this.disciplinas = disciplinas;
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas:" + this.disciplinas);
    }

    public void matricularDisciplinas() {
        System.out.println("Disciplinas:" + this.disciplinas);
    }

    public void setTotalCreditos(int creditos) {
        this.totalCreditos = creditos;
    }

    public int getTotalCreditos() {
        return this.totalCreditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCreditos() {
        return this.creditos;
    }
}
