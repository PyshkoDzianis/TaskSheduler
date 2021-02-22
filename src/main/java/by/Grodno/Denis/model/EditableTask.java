package main.java.by.Grodno.Denis.model;

public class EditableTask extends HomeWork {


    private final String newTask;

    public EditableTask(String name, String dueDate, int number, String newTask) {


        super(name, dueDate, number);
        this.newTask = newTask;
    }

    @Override
    public String getHomeWorkType() {
        return null;
    }
}
