package lesson_3.homework;

public class Search implements Element{

    @Override
    public String getType() {
        return "Поиск";
    }

    @Override
    public String getIconDescription() {
        System.out.println("какое то обяснение элемента Поиск");
        return null;
    }

    @Override
    public void click(String name) {
        name ="Поиск";
        System.out.println(name+" кликнут");
    }

    @Override
    public void open(String name) {
        name ="Поиск";
        System.out.println("Элемент " +name+ " кликнут");
    }

    @Override
    public void open() {

    }
}
