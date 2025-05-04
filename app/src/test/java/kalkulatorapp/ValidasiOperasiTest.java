package kalkulatorapp;

import org.junit.Test;

public class ValidasiOperasiTest {

    @Test(expected = IllegalArgumentException.class)
    public void testOperatorTidakValid() {
        Komputasi.hitung("2", "3", "%");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPembagiNol() {
        Komputasi.hitung("2", "0", "/");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testOperatorNull() {
        Komputasi.hitung("2", "3", null);
    }
    
}
