package main.java.by.Grodno.Denis.model;

public class ReccurringTask extends MainTask {

    private int count;


    public ReccurringTask(String name, String dueDate, int number, int count) {
        super(name, dueDate);
        this.count = count;
    }

    @Override
    public String getMainTaskType() {
        return null;
    }

}
