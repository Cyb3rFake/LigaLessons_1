package lesson_3.homework.OzonCatalog;

import lesson_3.homework.Category;

public class smartphones extends Category {


    @Override
    public void open(String name) {
        name ="смартфоны";
        System.out.println("Открыт элемент  "+name);
    }

    @Override
    public void open(String name, String iconDescription) {
        name ="смартфоны";
        iconDescription ="Описание";
        System.out.println("Открыт элемент "+name + iconDescription);
    }

    @Override
    public void open() {
        System.out.println("Открыт элемент "+name);
    }
}
