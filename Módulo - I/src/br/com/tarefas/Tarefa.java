package br.com.tarefas;

public class Tarefa {

    String descricao;

    public Tarefa(String tarefa){
        this.descricao = tarefa;
    }

    public void exibirTarefas(){
        System.out.println(descricao);
    }

    public int tamanhoTarefa(){
        return this.descricao.length();
    }
}
