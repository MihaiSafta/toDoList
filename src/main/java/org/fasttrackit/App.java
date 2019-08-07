package org.fasttrackit;

import persistence.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;


public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {
        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
        //toDoItemRepository.createToDoItem("Learn Java",LocalDateTime.now().plusMonths(6));
        //toDoItemRepository.deleteToDoItem(2);
        System.out.println(toDoItemRepository.getToDoItems());

        toDoItemRepository.updateToDoItem(1,true);
        System.out.println(toDoItemRepository.getToDoItems());
    }
}
