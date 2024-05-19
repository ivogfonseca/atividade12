package Question03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, idade, curso);
            cadastro.adicionarAluno(aluno);
        }

        System.out.println("\nLista de Alunos:");
        cadastro.imprimirAlunos();
    }
}

