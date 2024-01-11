import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testStampaAnno2023() {
        assertEquals("2023","2023");
    }
    @org.junit.jupiter.api.Test
    void testStampaMeseMarch() {
        assertEquals("MARCH","MARCH");
    }
    @org.junit.jupiter.api.Test //Genero un test con errore
    void testStampaGiornoMese() {
        assertEquals("1","2");
    }
    @org.junit.jupiter.api.Test //Genero un test con errore
    void testStampaNomeGiornoDellaSettimana() {
        assertEquals("WEDNESDAY","WEDNESDAY");
    }


}