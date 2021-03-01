package main.java.by.Grodno.Denis.model;

import java.util.ArrayList;
import java.util.List;

abstract class StudentBase< Int > implements User< Int > {

    @Override
    public java.util.List<Task> getTasks() {
        List<Task> list = new ArrayList<Task>();
        list.add(new Task(1, "dddsfsdf"));
        list.add(new Task(2, "fdghgfgh"));
        return list;
    }
}