package main.java.by.Grodno.Denis.model;

public class ReccurringTask extends HomeWork {

    private int count;


    public ReccurringTask(String name, String dueDate, int number, int count) {
        super(name, dueDate, number);
        this.count = count;
    }

    @Override
    public String getHomeWorkType() {
        return null;
    }

}
