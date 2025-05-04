package kalkulatorapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidasiRangeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAngkaDiatasRange() {
        Komputasi.hitung("40000", "2", "+");
    }

        @Test(expected = IllegalArgumentException.class)
    public void testAngkaDibawahRange() {
        Komputasi.hitung("-40000", "2", "+");
    }

    @Test
    public void testAngkaRangeBawah() {
        assertEquals(-32766, Komputasi.hitung("-32768", "2", "+"));
    }

    @Test
    public void testAngkaRangeAtas() {
        assertEquals(32767, Komputasi.hitung("32766", "1", "+"));
    }
}
