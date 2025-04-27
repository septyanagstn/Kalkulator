package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComputationTest {

    @Test
    public void testTambah() {
        assertEquals(5, Computation.hitung("2", "3", "+"));
    }

    @Test
    public void testKurang() {
        assertEquals(-1, Computation.hitung("2", "3", "-"));
    }

    @Test
    public void testKali() {
        assertEquals(6, Computation.hitung("2", "3", "*"));
    }

    @Test
    public void testBagi() {
        assertEquals(2, Computation.hitung("6", "3", "/"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputBukanAngka() {
        Computation.hitung("a", "2", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAngkaDiluarRange() {
        Computation.hitung("40000", "2", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperatorTidakValid() {
        Computation.hitung("2", "3", "%");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPembagiNol() {
        Computation.hitung("2", "0", "/");
    }
}
