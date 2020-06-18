package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.Tarefa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        Tarefa tarefa = new Tarefa("Regar plantas");
        Tarefa tarefa1 = new Tarefa("Estudar");
        Tarefa tarefa2 = new Tarefa("Trabalhar");
        */

        /*Listas*/
        System.out.println("------- Lista de tarefas -------");
        ArrayTarefas listaTarefas = new ArrayTarefas();
        listaTarefas.adicionarTarefa("Regar plantas");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Trabalhar");

        listaTarefas.exibirTarefas();

    }
}
