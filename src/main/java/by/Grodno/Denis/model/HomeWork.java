package main.java.by.Grodno.Denis.model;


public abstract class HomeWork {
    private String name;
    private String dueDate;
    private int number;

    public HomeWork(String name, String dueDate, int number) {

    }

    public abstract String getHomeWorkType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

}