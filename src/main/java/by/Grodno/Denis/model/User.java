package main.java.by.Grodno.Denis.model;

import java.util.List;

public interface User< T > {

    T getId();

    List< Task > getTasks();

}
