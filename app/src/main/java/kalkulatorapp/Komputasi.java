package kalkulatorapp;

import java.util.Scanner;

public class Komputasi {

    // Fungsi untuk input angka
    public static int inputAngka(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                return Integer.MIN_VALUE;  // Menandakan keluar dari kalkulator
            }
            if (!validasiAngka(input)) {
                System.out.println("Error: Input harus berupa angka.");
                continue;
            }

            int angka = parseAngka(input);
            try {
                validasiRangeAngka(angka);
                return angka;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Fungsi untuk input operator
    public static String inputOperator(Scanner scanner) {
        while (true) {
            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = scanner.nextLine();
            if (!validasiOperator(operator)) {
                System.out.println("Error: Operator tidak valid.");
            } else {
                return operator;  // Return operator yang valid
            }
        }
    }

    // Fungsi validasi angka
    public static boolean validasiAngka(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Fungsi untuk mengubah input ke angka
    public static int parseAngka(String input) {
        return Integer.parseInt(input);
    }

    // Fungsi untuk validasi range angka
    public static void validasiRangeAngka(int number) {
        if (number < -32768 || number > 32767) {
            throw new IllegalArgumentException("Error: Angka harus berada di antara -32,768 hingga 32,767.");
        }
    }

    // Fungsi untuk validasi operator
    public static boolean validasiOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

    private static void validasiPembagian(String operator, int b) {
        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Error: Tidak bisa membagi dengan nol.");
        }
    }

    // Fungsi untuk melakukan operasi hitung
    public static int hitung(String inputA, String inputB, String operator) throws IllegalArgumentException {
        int a = parseAngka(inputA);
        int b = parseAngka(inputB);

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
                throw new IllegalArgumentException("Error: Operator hanya boleh +, -, *, atau /.");
        }
    }
}
