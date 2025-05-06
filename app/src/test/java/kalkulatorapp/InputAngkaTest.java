package kalkulatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class InputAngkaTest {

    @Test
    public void testInputExit() {
        String input = "exit\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int result = Komputasi.inputAngka(scanner, "Masukkan angka: ");
        assertEquals(Integer.MIN_VALUE, result);
        scanner.close();
    }

    @Test
    public void testInputValid() {
        String input = "123\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int result = Komputasi.inputAngka(scanner, "Masukkan angka: ");
        assertEquals(123, result);
        scanner.close();
    }

    @Test
    public void testInputSalahLaluBenar() {
        String input = "bukanangka\n321\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int result = Komputasi.inputAngka(scanner, "Masukkan angka: ");
        assertEquals(321, result);
        scanner.close();
    }

    @Test
    public void testInputDiluarRangeKemudianBenar() {
        String input = "40000\n100\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int result = Komputasi.inputAngka(scanner, "Masukkan angka: ");
        assertEquals(100, result);
        scanner.close();
    }
}
