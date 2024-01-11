import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDataLong() {
        assertEquals("1 march 2002","1 march 2002");

    }
    @Test
    void testDataMedium() {
        assertEquals("1 mar 2002","1 mar 2002");

    }
    @Test
    void testDataShort() {
        assertEquals("01/03/2002","01/03/2002");

    }
}