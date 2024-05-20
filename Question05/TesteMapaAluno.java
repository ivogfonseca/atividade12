package Question05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Question03.Aluno;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAluno = new HashMap<>();

        mapaAluno.put(123, new Aluno(01, "João", 123, "direito"));
        mapaAluno.put(456, new Aluno(02, "Maria", 456, "pedagogia"));
        mapaAluno.put(789, new Aluno(03, "Pedro", 789, "ciencia da computação"));
        mapaAluno.put(101, new Aluno(04, "Ana", 101, "engenharia civil"));
        mapaAluno.put(202, new Aluno(05, "Lucas", 202, "medicina"));

         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();

        Aluno aluno = mapaAluno.get(matricula);

        if (aluno != null) {
            System.out.println("Aluno encontrado:");
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado!");
        }
        
        scanner.close();
    }
    }

