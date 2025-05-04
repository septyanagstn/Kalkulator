package kalkulatorapp;

public class Komputasi {

    public static int hitung(String inputA, String inputB, String operator) throws IllegalArgumentException {
        int a = parseAngka(inputA); // pakai parseAngka (bukan validasiAngka)
        int b = parseAngka(inputB);

        validasiRangeAngka(a);
        validasiRangeAngka(b);
        validasiOperator(operator);

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

    // Fungsi baru: cek apakah input valid (dipakai di MainApp)
    public static boolean validasiAngka(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Fungsi baru: mengubah input ke int (dipakai di hitung)
    public static int parseAngka(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input harus berupa angka.");
        }
    }

    public static void validasiRangeAngka(int number) {
        if (number < -32768 || number > 32767) {
            throw new IllegalArgumentException("Error: Angka harus berada di antara -32,768 hingga 32,767.");
        }
    }

    public static boolean validasiOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }
}
