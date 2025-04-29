package kalkulatorapp;

public class Kalkulator {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak boleh membagi dengan nol.");
        }
        return a / b;
    }
}
