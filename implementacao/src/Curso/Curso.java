package Curso;

import Disciplina.Disciplina;

public class Curso {
  private int id;
  private String nome;
  private int creditos;
  private Disciplina[] disciplinas;
  private int semestres;

  public Curso(int id, String nome, int creditos, Disciplina[] disciplinas, int semestres) {
    this.id = id;
    this.nome = nome;
    this.creditos = creditos;
    this.disciplinas = disciplinas;
    this.semestres = semestres;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getCreditos() {
    return this.creditos;
  }

  public void setDisciplinas(Disciplina[] disciplinas) {
    this.disciplinas = disciplinas;
  }

  public Disciplina[] getDisciplinas() {
    return this.disciplinas;
  }

  public void setSemestres(int semestres) {
    this.semestres = semestres;
  }

  public int getSemestres() {
    return this.semestres;
  }
}
