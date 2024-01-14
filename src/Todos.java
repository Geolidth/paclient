/*
* File: Todos.java
* Author: Csajbók-Reményi László
* Copyright: 2024, Csajbók-Reményi László
* Group: Szoft II/I/E
* Date: 2024/01/14
* Github: https://github.com/Geolidth/paclient.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class Todos {
    String url;
    TodoService todoService;

    public Todos() {
        todoService = new TodoService();
        getTodos();
    }

    public void getTodos() {
        String todos = todoService.getTodos();
        ArrayList<Todo> todoList = Convert.toListObject(todos, Todo.class);
        for (Todo todo : todoList) {
            System.out.println(todo.id.toString() + '\t' + todo.title);
        }

    }
}
