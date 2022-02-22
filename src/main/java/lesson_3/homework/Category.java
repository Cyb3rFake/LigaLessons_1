package lesson_3.homework;

public abstract class Category {
    protected String iconDescription="Default_iconDescription";
    protected String name="Default_name";
    public abstract void open(String name);
    public abstract void open(String name, String iconDescription);
    public abstract void open();
}
