package lesson_3.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void getType() {
        Search s = new Search();
        s.getType();
    }

    @Test
    void getIconDescription() {
        Search s = new Search();
        s.getIconDescription();
    }

    @Test
    void click() {
        Search s = new Search();
        s.click("поиск");
    }

    @Test
    void open() {
        Search s = new Search();
        s.open("поиск");
    }
}