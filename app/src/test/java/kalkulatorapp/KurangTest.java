package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class KurangTest {

    @Test
    public void testKurangPositif() {
        int result = Kalkulator.kurang(7, 8);
        assertEquals(-1, result);
    }

    @Test
    public void testKurangNegatif() {
        int result = Kalkulator.kurang(-5, -4);
        assertEquals(-1, result);
    }

    @Test
    public void testKurangCampuran() {
        int result = Kalkulator.kurang(-7, 8);
        assertEquals(-15, result);
    }

    @Test
    public void testKurangHasilNegatif() {
        int result = Kalkulator.kurang(3, 8);
        assertEquals(-5, result);
    }

    @Test
    public void testKurangHasilPositif() {
        int result = Kalkulator.kurang(4, 2);
        assertEquals(2, result);
    }
}
