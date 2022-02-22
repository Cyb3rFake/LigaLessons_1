package lesson_3.homework.OzonCatalog;

import lesson_3.homework.Category;

public class smarthomeSecurity extends Category {


    @Override
    public void open(String name) {
    }

    @Override
    public void open(String name, String iconDescription) {
        System.out.println("Открыт каталог "+name+ iconDescription);
    }

    @Override
    public void open() {

    }
}
