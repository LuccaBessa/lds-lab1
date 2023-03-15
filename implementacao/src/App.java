import java.util.ArrayList;
import java.util.Scanner;

import Aluno.Aluno;
import Disciplina.Disciplina;
import Professor.Professor;
import Serializer.DataDeserializer;
// import Serializer.PopulateData;
import Usuario.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        // PopulateData.populate();
        ArrayList<Disciplina> disciplinas = DataDeserializer.deserialize("data_disciplinas.ser");
        ArrayList<Aluno> alunos = DataDeserializer.deserialize("data_alunos.ser");
        ArrayList<Aluno> alunosList = alunos;
        ArrayList<Professor> professores = DataDeserializer.deserialize("data_professores.ser");
        ArrayList<Usuario> usuarios = new ArrayList<>() {
            {
                addAll(alunosList);
                addAll(professores);
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        String id = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuarioLogado = null;
        for (Usuario usuario : usuarios) {
            if (String.valueOf(usuario.getId()).equals(id) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                break;
            }
        }

        if (usuarioLogado == null) {
            System.out.println("Erro ao fazer login!");
        } else {
            System.out.println("Bem vindo, " + usuarioLogado.getNome() + "! \n");
            if (usuarioLogado instanceof Aluno) {
                Aluno aluno = (Aluno) usuarioLogado;
                System.out.println("Creditos: " + aluno.getCreditos() + " / " + aluno.getTotalCreditos() + "\n");
                aluno.listarDisciplinas(disciplinas, professores);

                int op = 2;

                do {
                    System.out.println("1 - Matricular em disciplina");
                    System.out.println("0 - Sair");
                    System.out.print("Opcao: ");
                    op = scanner.nextInt();
                    scanner.nextLine();
                    if (op == 1) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out
                                .println("Creditos: " + aluno.getCreditos() + " / " + aluno.getTotalCreditos() + "\n");
                        System.out.println("Disciplinas disponiveis:");
                        for (Disciplina disciplina : disciplinas) {
                            System.out.println("  - " + disciplina.getId() + ": " + disciplina.getNome() + " ("
                                    + disciplina.getCreditos()
                                    + " Creditos)");
                        }
                        System.out.print("Id da disciplina: ");
                        int disciplinaId = scanner.nextInt();
                        scanner.nextLine();
                        aluno.matricularDisciplina(disciplinaId, disciplinas, alunos);
                        disciplinas = DataDeserializer.deserialize("data_disciplinas.ser");
                        alunos = DataDeserializer.deserialize("data_alunos.ser");

                        for (Usuario usuario : usuarios) {
                            if (String.valueOf(usuario.getId()).equals(id) && usuario.getSenha().equals(senha)) {
                                usuarioLogado = usuario;
                                break;
                            }
                        }
                    }
                } while (op != 0);
            } else if (usuarioLogado instanceof Professor) {
                Professor professor = (Professor) usuarioLogado;
                professor.listarDisciplinas(disciplinas, alunos);
            }
        }

        scanner.close();
    }
}
