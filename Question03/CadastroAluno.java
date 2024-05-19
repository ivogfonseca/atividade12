package Question03;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> listaAlunos;

     public CadastroAluno() {
        listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println();
        }
    }
}

