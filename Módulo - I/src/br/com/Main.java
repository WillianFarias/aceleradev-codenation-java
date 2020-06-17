package br.com;

import br.com.tarefas.Tarefa;

public class Main {

    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa("Regar plantas");
        tarefa.exibirTarefas();
        System.out.println(tarefa.tamanhoTarefa());
    }
}
