package kalkulatorapp;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Kalkulator Sederhana ===");

            // INPUT A
            int a = Komputasi.inputAngka(scanner, "Masukkan angka pertama (atau ketik 'exit' untuk keluar): ");
            if (a == Integer.MIN_VALUE) {
                System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana.");
                scanner.close();
                return;
            }

            // INPUT B
            int b = Komputasi.inputAngka(scanner, "Masukkan angka kedua: ");
            if (b == Integer.MIN_VALUE) {
                System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana.");
                scanner.close();
                return;
            }

            // OPERATOR
            String operator = Komputasi.inputOperator(scanner);

            // HASIL
            try {
                int hasil = Komputasi.hitung(String.valueOf(a), String.valueOf(b), operator);
                System.out.println("Hasil: " + hasil);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }
    }
}