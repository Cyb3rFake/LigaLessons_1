package lesson_3.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sliderTest {

    @Test
    void getType() {
        slider s = new slider();
        s.getType();
    }

    @Test
    void getIconDescription() {
        slider s = new slider();
        s.getIconDescription();
    }

    @Test
    void click() {
        slider s = new slider();
        s.click("рекламный слайдер");
    }

    @Test
    void open() {
        slider s = new slider();
        s.open("рекламный слайдер");
    }
}