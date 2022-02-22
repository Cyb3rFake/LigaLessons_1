package lesson_3.homework.OzonCatalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class smarthomeSecurityTest {

    @Test
    void open() {
    }

    @Test
    void testOpen() {
        smarthomeSecurity sa = new smarthomeSecurity();
        sa.open("\"SmarthomeSecurity\" ","Умный дом Безопастность");

    }
}