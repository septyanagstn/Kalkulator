package kalkulatorapp;

public class Komputasi {

    public static int hitung(String inputA, String inputB, String operator) throws IllegalArgumentException {
        int a = validasiAngka(inputA);
        int b = validasiAngka(inputB);

        validasiRangeAngka(a);
        validasiRangeAngka(b);
        validasiOperator(operator);
        validasiPembagian(operator, b);

        switch (operator) {
            case "+":
                return Kalkulator.tambah(a, b);
            case "-":
                return Kalkulator.kurang(a, b);
            case "*":
                return Kalkulator.kali(a, b);
            case "/":
                return Kalkulator.bagi(a, b);
            default:
                throw new IllegalArgumentException("Error: Operator tidak dikenali.");
        }
    }

    private static int validasiAngka(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Error: Input angka tidak boleh null.");
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input harus berupa angka.");
        }
    }

    private static void validasiRangeAngka(int number) {
        if (number < -32768 || number > 32767) {
            throw new IllegalArgumentException("Error: Angka harus berada di antara -32,768 hingga 32,767.");
        }
    }

    private static void validasiOperator(String operator) {
        if (operator == null) {
            throw new IllegalArgumentException("Error: Operator tidak boleh null.");
        }
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new IllegalArgumentException("Error: Operator hanya boleh +, -, *, atau /.");
        }
    }

    private static void validasiPembagian(String operator, int b) {
        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Error: Tidak bisa membagi dengan nol.");
        }
    }
}
