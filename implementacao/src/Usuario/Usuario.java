package Usuario;

import java.util.ArrayList;

import Disciplina.Disciplina;

public abstract class Usuario {
    protected int id;
    protected boolean logado = false;
    protected String nome;
    protected String senha;
    protected ArrayList<Disciplina> disciplinas;

    public void entrar(int id, String senha) {
        if(validaid(id) && validaSenha(senha)) {
            System.out.println("Entrando no sistema:");
            logado = true;
        }
    }

    private boolean validaid(int id){
        return id == this.id;
    }

    private boolean validaSenha(String senha){
        return senha == this.senha;
    }

    public void sair() {
        if(logado) {
            System.out.println("Saindo.");
        }
        else {
            System.out.println("O usuário não está logado.");
        }
    }

    //há diferenças para aluno e professor
    public abstract void listarDisciplinas();
}
