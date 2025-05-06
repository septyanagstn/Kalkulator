package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainAppTest {

    @Test
    public void testHitungTambah() {
        int result = Komputasi.hitung("10", "5", "+");
        assertEquals(15, result);
    }

    @Test
    public void testHitungKurang() {
        int result = Komputasi.hitung("10", "5", "-");
        assertEquals(5, result);
    }

    @Test
    public void testHitungKali() {
        int result = Komputasi.hitung("5", "5", "*");
        assertEquals(25, result);
    }

    @Test
    public void testHitungBagi() {
        int result = Komputasi.hitung("10", "2", "/");
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHitungBagiNol() {
        Komputasi.hitung("10", "0", "/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputPertamaBukanAngka() {
        Komputasi.hitung("exit", "2", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputKeduaBukanAngka() {
        Komputasi.hitung("2", "exit", "+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperatorTidakValid() {
        Komputasi.hitung("2", "3", "%");
    }
}
