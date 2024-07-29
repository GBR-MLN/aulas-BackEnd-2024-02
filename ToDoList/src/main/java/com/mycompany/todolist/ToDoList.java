/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;

/**
 *
 * @author gabriel_milani
 */

public class ToDoList {

    public static void main(String[] args) {

        ListaDeTarefas tarefas = new ListaDeTarefas();

        Tarefa t1 = new Tarefa("Teste 1", "Pimeira tarefa criada para o 'app'");

        // System.out.println("Tarefas \n=================================\n" + t1);

        // t1.completar();

        // System.out.println("Tarefas \n=================================\n" + t1);

        tarefas.adicionarTarefa(t1);
        tarefas.adicionarTarefa(new Tarefa("Teste 2", "Segunda"));

        t1.completar();

        tarefas.listar();

        tarefas.limpar();

        tarefas.listar();

    }
}
