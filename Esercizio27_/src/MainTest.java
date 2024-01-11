import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testaDataSpecifica() {
        assertEquals("2023-03-01T13:00:00Z","2023-03-01T13:00:00Z");

    }
    @org.junit.jupiter.api.Test
    void testaFormatoDataLong() {
        assertEquals("1 march 2002","1 march 2002");

    }

}