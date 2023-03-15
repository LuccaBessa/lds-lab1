package Aluno;

import java.io.IOException;
import java.util.ArrayList;

import Disciplina.Disciplina;
import Professor.Professor;
import Serializer.DataSerializer;
import Serializer.PersistentData;
import Usuario.Usuario;

public class Aluno extends Usuario {
    private int totalCreditos = 1000;
    private int creditos = 0;
    private ArrayList<Integer> disciplinas;

    public Aluno(int id, String nome, String sobrenome, String senha, int creditos,
            ArrayList<Integer> disciplinas) {
        this.setId(id);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSenha(senha);
        this.creditos = creditos;
        this.disciplinas = disciplinas;
    }

    public void listarDisciplinas(ArrayList<Disciplina> allDisciplinas, ArrayList<Professor> allProfessores) {
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : allDisciplinas) {
            if (this.disciplinas.contains(disciplina.getId())) {
                String cancelada = disciplina.getAlunos().size() < 3 ? " (Cancelada)" : "";
                System.out.println("  - " + disciplina.getNome() + " (" + disciplina.getCreditos()
                        + " Creditos) " + cancelada);
                for (Professor professor : allProfessores) {
                    if (disciplina.getProfessor() == professor.getId()) {
                        System.out.println("    - Professor: " + professor.getNome() + " " + professor.getSobrenome());
                    }
                }
            }
        }
    }

    public void matricularDisciplina(int disciplinaId, ArrayList<Disciplina> allDisciplinas,
            ArrayList<Aluno> allAlunos) throws IOException {
        disciplinas.add(disciplinaId);

        for (Disciplina disciplina : allDisciplinas) {
            if (disciplina.getId() == disciplinaId) {
                if (this.disciplinas.contains(disciplinaId)) {
                    System.out.println("Voce ja esta matriculado nesta disciplina!");
                    return;
                }

                if (this.disciplinas.size() == 6) {
                    System.out.println("Voce ja esta matriculado em 6 disciplinas!");
                    return;
                }

                if (this.creditos + disciplina.getCreditos() > this.totalCreditos) {
                    System.out.println("Voce nao tem creditos suficientes para se matricular nesta disciplina!");
                    return;
                }

                disciplina.getAlunos().add(this.getId());
                setCreditos(this.creditos += disciplina.getCreditos());
            }
        }

        for (Aluno aluno : allAlunos) {
            if (aluno.getId() == this.getId()) {
                aluno.setDisciplinas(disciplinas);
                aluno.setCreditos(this.creditos);
            }
        }

        for (Disciplina disciplina : allDisciplinas) {
            if (disciplina.getId() == disciplinaId) {
                disciplina.setAlunos(disciplina.getAlunos());
            }
        }

        PersistentData<ArrayList<Aluno>> alunoData = new PersistentData<ArrayList<Aluno>>(allAlunos);
        DataSerializer.serialize(alunoData, "data_alunos.ser");

        PersistentData<ArrayList<Disciplina>> disciplinaData = new PersistentData<ArrayList<Disciplina>>(
                allDisciplinas);
        DataSerializer.serialize(disciplinaData, "data_disciplinas.ser");

        System.out.println("Matricula realizada com sucesso!");
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

    public void setDisciplinas(ArrayList<Integer> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Integer> getDisciplinas() {
        return this.disciplinas;
    }
}
