package main.java.by.Grodno.Denis.model;

import java.util.List;

public abstract class BaseUser< T > implements User< T > {
    protected List< Task > tasks;

    @Override
    public List< Task > getTasks() {
        return tasks;
    }
}