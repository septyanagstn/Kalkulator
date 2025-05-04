package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidasiRangeTest {

    @Test
    public void testInputKurangDariMin() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Komputasi.validasiRangeAngka(-32769);
        });
        assertTrue(e.getMessage().contains("Error: Angka harus berada di antara -32,768 hingga 32,767."));
    }

    @Test
    public void testInputLebihDariMax() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Komputasi.validasiRangeAngka(32768);
        });
        assertTrue(e.getMessage().contains("Error: Angka harus berada di antara -32,768 hingga 32,767."));
    }

    @Test
    public void testInputDalamRange() {
        Komputasi.validasiRangeAngka(-32767); // Tidak melempar exception
    }
}
