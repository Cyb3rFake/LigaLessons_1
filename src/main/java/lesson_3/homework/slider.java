package lesson_3.homework;

public class slider implements Element {

    @Override
    public String getType() {
        System.out.println("Слайдер");
        return null;
    }

    @Override
    public String getIconDescription() {
        System.out.println("Рекламный слайдер акций");
        return null;
    }

    @Override
    public void click(String name) {
        System.out.println("Элемент "+name+" кликнут");
    }

    @Override
    public void open(String name) {
        System.out.println("Элемент Рекламный слайдер открыт");
    }

    @Override
    public void open() {

    }
}
