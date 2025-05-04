package kalkulatorapp;

import static org.junit.Assert.*;
import org.junit.Test;

public class HitungTest {

    @Test
    public void testTambah() {
        // Pengujian operator penjumlahan
        int hasil = Komputasi.hitung("7", "8", "+");
        System.out.println("Hasil: " + hasil);
        assertEquals(15, hasil);
    }

    @Test
    public void testKurang() {
        // Pengujian operator pengurangan
        int hasil = Komputasi.hitung("-7", "8", "-");
        System.out.println("Hasil: " + hasil);
        assertEquals(-15, hasil);
    }

    @Test
    public void testKali() {
        // Pengujian operator perkalian
        int hasil = Komputasi.hitung("2", "2", "*");
        System.out.println("Hasil: " + hasil);
        assertEquals(4, hasil);
    }

    @Test
    public void testBagi() {
        // Pengujian operator pembagian
        int hasil = Komputasi.hitung("2", "2", "/");
        System.out.println("Hasil: " + hasil);
        assertEquals(1, hasil);
    }

    @Test
    public void testOperatorTidakValid() {
        try {
            Komputasi.hitung("2", "2", "%");
            fail("Seharusnya terjadi IllegalArgumentException karena operator tidak dikenali.");
        } catch (IllegalArgumentException e) {
            System.out.println("Pesan error: " + e.getMessage());
            assertEquals("Error: Operator hanya boleh +, -, *, atau /.", e.getMessage());
        }
    }

}
