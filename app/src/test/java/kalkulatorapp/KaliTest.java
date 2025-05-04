package kalkulatorapp;

import static org.junit.Assert.*;
import org.junit.Test;

public class KaliTest {

    @Test
    public void testKaliPositif() {
        int a = 7;
        int b = 8;
        int hasil = Kalkulator.kali(a, b);
        int expected = 56;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testKaliNegatif() {
        int a = -7;
        int b = -8;
        int hasil = Kalkulator.kali(a, b);
        int expected = 56;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testKaliCampuranPositifNegatif() {
        int a = 7;
        int b = -8;
        int hasil = Kalkulator.kali(a, b);
        int expected = -56;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testKaliCampuranNegatifPositif() {
        int a = -7;
        int b = 8;
        int hasil = Kalkulator.kali(a, b);
        int expected = -56;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testKaliNolPositif() {
        int a = 0;
        int b = 5;
        int hasil = Kalkulator.kali(a, b);
        int expected = 0;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testKaliNolNegatif() {
        int a = 0;
        int b = -5;
        int hasil = Kalkulator.kali(a, b);
        int expected = 0;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }

    @Test
    public void testKaliNol() {
        int a = 0;
        int b = 0;
        int hasil = Kalkulator.kali(a, b);
        int expected = 0;
        System.out.println("Hasil: " + hasil);  // Menampilkan hasil perhitungan
        assertEquals(expected, hasil);
    }
}
