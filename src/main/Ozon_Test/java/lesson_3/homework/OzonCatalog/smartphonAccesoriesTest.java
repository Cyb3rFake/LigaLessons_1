package lesson_3.homework.OzonCatalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class smartphonAccesoriesTest {

    @Test
    void testOpen() {
        smartphonAccesories sa = new smartphonAccesories();
        sa.open("\"SmartphonAccesories\" ","Аксессуары для смартфонов");
    }

}