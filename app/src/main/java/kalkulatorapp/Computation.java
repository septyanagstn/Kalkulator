package kalkulatorapp;

public class Computation {

    public static int hitung(String inputA, String inputB, String operator) throws IllegalArgumentException {
        int a, b;

        // Validasi angka
        try {
            a = Integer.parseInt(inputA);
            b = Integer.parseInt(inputB);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input harus berupa angka.");
        }

        // Validasi range
        if (a < -32768 || a > 32767 || b < -32768 || b > 32767) {
            throw new IllegalArgumentException("Error: Angka harus berada di antara -32,768 hingga 32,767.");
        }

        // Validasi operator
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new IllegalArgumentException("Error: Operator hanya boleh +, -, *, atau /.");
        }

        // Validasi pembagi tidak nol
        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Error: Tidak boleh membagi dengan nol.");
        }

        // Lanjut ke perhitungan
        switch (operator) {
            case "+":
                return Calculator.tambah(a, b);
            case "-":
                return Calculator.kurang(a, b);
            case "*":
                return Calculator.kali(a, b);
            case "/":
                return Calculator.bagi(a, b);
            default:
                throw new IllegalArgumentException("Error: Operator tidak dikenali.");
        }
    }
}
