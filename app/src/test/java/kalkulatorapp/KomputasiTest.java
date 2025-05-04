package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class KomputasiTest {

    @Test
    public void testTambah() {
        assertEquals(5, Komputasi.hitung("2", "3", "+"));
    }

    @Test
    public void testKurang() {
        assertEquals(-1, Komputasi.hitung("2", "3", "-"));
    }

    @Test
    public void testKali() {
        assertEquals(6, Komputasi.hitung("2", "3", "*"));
    }

    @Test
    public void testBagi() {
        assertEquals(2, Komputasi.hitung("6", "3", "/"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputBukanAngka() {
        Komputasi.hitung("a", "2", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAngkaDiluarRange() {
        Komputasi.hitung("40000", "2", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperatorTidakValid() {
        Komputasi.hitung("2", "3", "%");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPembagiNol() {
        Komputasi.hitung("2", "0", "/");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInputANull() {
        Komputasi.hitung(null, "2", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputBNull() {
        Komputasi.hitung("2", null, "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperatorNull() {
        Komputasi.hitung("2", "3", null);
    }

}
