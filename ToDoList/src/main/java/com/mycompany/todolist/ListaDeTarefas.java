package com.mycompany.todolist;

import java.util.ArrayList;

public class ListaDeTarefas {
    
    ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    public ListaDeTarefas() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa t) {
        this.tarefas.add(t);
    }

    public void listar () {
        System.out.println(this.tarefas);
    }

    public void limpar() {
        this.tarefas.clear();
    }
    
}
