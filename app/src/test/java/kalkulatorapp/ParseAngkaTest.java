package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParseAngkaTest {

    @Test
    public void testInputAngka() {
        assertEquals(5, Komputasi.parseAngka("5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testInputHuruf() {
        Komputasi.parseAngka("b");
    }

    @Test(expected = NumberFormatException.class)
    public void testInputKosong() {
        Komputasi.parseAngka("");
    }
}
