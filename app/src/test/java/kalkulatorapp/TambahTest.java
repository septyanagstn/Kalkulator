package kalkulatorapp;

import static org.junit.Assert.*;
import org.junit.Test;

public class TambahTest {

    @Test
    public void testTambahPositif() {
        int a = 7;
        int b = 8;
        int hasil = Kalkulator.tambah(a, b);
        int expected = 15;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testTambahNegatif() {
        int a = -7;
        int b = -8;
        int hasil = Kalkulator.tambah(a, b);
        int expected = -15;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testTambahCampuranPositifNegatif() {
        int a = 7;
        int b = -8;
        int hasil = Kalkulator.tambah(a, b);
        int expected = -1;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testTambahCampuranNegatifPositif() {
        int a = -7;
        int b = 8;
        int hasil = Kalkulator.tambah(a, b);
        int expected = 1;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testTambahNolPositif() {
        int a = 0;
        int b = 5;
        int hasil = Kalkulator.tambah(a, b);
        int expected = 5;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testTambahNolNegatif() {
        int a = 0;
        int b = -5;
        int hasil = Kalkulator.tambah(a, b);
        int expected = -5;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testTambahNol() {
        int a = 0;
        int b = 0;
        int hasil = Kalkulator.tambah(a, b);
        int expected = 0;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }
}
