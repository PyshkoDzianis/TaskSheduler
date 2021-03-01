package main.java.by.Grodno.Denis.model;


public abstract class MainTask implements Comparable{
    private String name;
    private String dueDate;


    public MainTask(String name, String dueDate) {
    this.name=name;
    this.dueDate=dueDate;

    }

    public abstract String getMainTaskType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "";
    }
    public String compareTo(MainTask task ){
   if (this.name==task.name)
       return null;
   else
        return this.name;
    }
}