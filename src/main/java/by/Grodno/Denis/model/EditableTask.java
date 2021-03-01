package main.java.by.Grodno.Denis.model;


public class EditableTask extends MainTask {

    private final String newTask;

    public EditableTask(String name, String dueDate,  String newTask) {

        super(name, dueDate);
        this.newTask = newTask;

    }

    @Override
    public String getMainTaskType() {
        return null;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
