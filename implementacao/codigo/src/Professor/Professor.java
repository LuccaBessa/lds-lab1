package Professor;

import Usuario.Usuario;

public class Professor extends Usuario{
    
    public Professor(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public void listarDisciplinas() {
        System.out.println("Nome do usuário:" + this.nome);
    }
}
