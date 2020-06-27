package br.com.curso.disciplinas;

import br.com.curso.alunos.Aluno;
import br.com.curso.alunos.ValidationException;

public class Main {

    public static void main(String[] args) {

        //Aluno aluno1 = new Aluno("Teste Login", "042.449.931-23", "Teste Sousa");
        Aluno aluno1 = null;
        try {
            aluno1 = new Aluno("", "042.449.931-23", "Teste Sousa");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            //imprimindo pilha de execucao
            //e.printStackTrace();
        }
        /*System.out.println(aluno1);
        aluno1 = null;
        if (aluno1 != null){
            aluno1.setNome("Willian");
        }*/

    }

}
