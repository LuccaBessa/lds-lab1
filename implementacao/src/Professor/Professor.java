package Professor;

import Disciplina.Disciplina;
import Usuario.Usuario;

public class Professor extends Usuario {
    private Disciplina[] disciplinas;

    public Professor(int id, String nome, String sobrenome, String senha, Disciplina[] disciplinas) {
        this.setId(id);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSenha(senha);
        this.disciplinas = disciplinas;
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas:" + this.disciplinas);
    }

    public void matricularDisciplinas() {
        System.out.println("Disciplinas:" + this.disciplinas);
    }
}
