package Curso;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {
  private int id;
  private String nome;
  private ArrayList<Integer> disciplinas;
  private int semestres;

  public Curso(int id, String nome, ArrayList<Integer> disciplinas, int semestres) {
    this.id = id;
    this.nome = nome;
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

  public void setDisciplinas(ArrayList<Integer> disciplinas) {
    this.disciplinas = disciplinas;
  }

  public ArrayList<Integer> getDisciplinas() {
    return this.disciplinas;
  }

  public void setSemestres(int semestres) {
    this.semestres = semestres;
  }

  public int getSemestres() {
    return this.semestres;
  }
}
