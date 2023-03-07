import Professor.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Professor professor = new Professor(1, "a", "b");

        professor.entrar(1, "b");
        professor.sair();
        professor.sair();
    }
}
