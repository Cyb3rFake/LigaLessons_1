package lesson_3.homework.OzonCatalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class smartphonesTest {

    @Test
    void open() {
        smartphones s = new smartphones();
        s.open();
    }

    @Test
    void testOpen() {
        smartphones s = new smartphones();
        s.open("Смартфоны");
    }

    @Test
    void testOpen1() {
    }

    @Test
    void testOpen2() {
    }
}