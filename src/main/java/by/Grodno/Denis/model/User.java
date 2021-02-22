package main.java.by.Grodno.Denis.model;

import java.util.List;

public interface User<T> {

    User<T> id;
    List<Task> getTasks();

}
