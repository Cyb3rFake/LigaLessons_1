package lesson_3.homework;

public interface Element {
    String getType();
    String getIconDescription();
    void click(String name);
    void open(String name);
    void open();
}
