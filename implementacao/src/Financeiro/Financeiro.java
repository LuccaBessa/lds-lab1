package Financeiro;

import Aluno.Aluno;
import Usuario.Usuario;

public class Financeiro extends Usuario {
  public Financeiro(int id, String nome, String sobrenome, String senha) {
    this.setId(id);
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
  }

  public void gerenciarAluno(Aluno aluno, int operacao) {
    if (operacao == 1) {
      System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
    } else if (operacao == 2) {
      System.out.println("Aluno " + aluno.getNome() + " removido com sucesso!");
    }
  }

  public void gerenciarProfessor(Usuario professor, int operacao) {
    if (operacao == 1) {
      System.out.println("Professor " + professor.getNome() + " cadastrado com sucesso!");
    } else if (operacao == 2) {
      System.out.println("Professor " + professor.getNome() + " removido com sucesso!");
    }
  }

  public void gerenciarDisciplina(Usuario disciplina, int operacao) {
    if (operacao == 1) {
      System.out.println("Disciplina " + disciplina.getNome() + " cadastrada com sucesso!");
    } else if (operacao == 2) {
      System.out.println("Disciplina " + disciplina.getNome() + " removida com sucesso!");
    }
  }

  public void gerenciarCurso(Usuario curso, int operacao) {
    if (operacao == 1) {
      System.out.println("Curso " + curso.getNome() + " cadastrado com sucesso!");
    } else if (operacao == 2) {
      System.out.println("Curso " + curso.getNome() + " removido com sucesso!");
    }
  }
}
