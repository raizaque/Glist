package model;

import DAO.UnSql2oModel;
import com.sun.tools.javac.comp.Todo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ToDoList extends ToDo {
    //
    private List<Todo> toDoList = new ArrayList<Todo>();

    public List<Todo> getToDos() {
        return toDoList;
    }

    public void setToDos(List<Todo> toDo) {
        this.toDoList = toDo;
    }

    public boolean add(Todo toDo){
        if(this.toDoList.add(toDo)){
            return true;
        }else{
            return false;
        }
    }

    public boolean remove(ToDo todo){
        if(toDoList.remove(todo)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        String vals = "\n" + "</br>Title: " + super.getTitle()  +
        "</br>Description: " + super.getDescription()  +"</br>composed: </br>" + this.toDoList +
                "</br>";
        return vals;
    }
}
