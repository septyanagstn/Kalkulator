package kalkulatorapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class InputOperatorTest {
    @Test
    public void testInputOperatorValid() {
        // Simulasi input pengguna: memasukkan operator "+" yang valid
        String simulatedInput = "+\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        String result = Komputasi.inputOperator(scanner);
        assertEquals("+", result);
    }

    @Test
    public void testInputOperatorInvalidThenValid() {
        // Simulasi: pertama salah (x), kedua benar (*)
        String simulatedInput = "%\n*\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        String result = Komputasi.inputOperator(scanner);
        assertEquals("*", result);
    }
}
