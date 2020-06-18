package br.com.tarefas;

import java.util.ArrayList;

public class ArrayTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa){
        if(tarefa != null && tarefa.tamanhoTarefa() <= 20) {
            this.tarefas.add(tarefa);
        }
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        adicionarTarefa(tarefa);
    }

    public void removerTarefa(int posicao){
        if(posicao < tarefas.size()) {
            this.tarefas.remove(posicao);
        }else{
            System.out.println("Tarefa desconhecida");
        }
    }

    public void exibirTarefas(){
        for (Tarefa tarefa : tarefas){
            tarefa.exibirTarefas();
        }
    }

}
