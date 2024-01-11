import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testAggiuntaDiUnAnno(){
        Integer plusYear = 1;
        assertEquals(plusYear,1);
    }
    @org.junit.jupiter.api.Test
    void testAggiuntaDiUnMese(){
        Integer plusMese = 1;
        assertEquals(plusMese,1);
    }
    @org.junit.jupiter.api.Test //Genero un errore nel test
    void testAggiuntaDiSetteGiorni(){
        Integer plusDays = 7;
        assertEquals(plusDays,1);
    }
}