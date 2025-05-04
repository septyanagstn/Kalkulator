package kalkulatorapp;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Kalkulator Sederhana ===");

            System.out.print("Masukkan angka pertama (atau ketik 'exit' untuk keluar): ");
            String inputA = scanner.nextLine();
            if (inputA.equalsIgnoreCase("exit")) {
                break;  // Keluar dari perulangan jika pengguna mengetik 'exit'
            }

            // Memastikan inputA valid angka
            while (!Komputasi.validasiAngka(inputA)) {
                System.out.println("Error: Input harus berupa angka.");
                System.out.print("Masukkan angka pertama: ");
                inputA = scanner.nextLine();
            }

            System.out.print("Masukkan angka kedua: ");
            String inputB = scanner.nextLine();

            // Memastikan inputB valid angka
            while (!Komputasi.validasiAngka(inputB)) {
                System.out.println("Error: Input harus berupa angka.");
                System.out.print("Masukkan angka kedua: ");
                inputB = scanner.nextLine();
            }

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            // Memastikan operator valid
            while (!Komputasi.validasiOperator(operator)) {
                System.out.println("Error: Operator hanya boleh +, -, *, atau /.");
                System.out.print("Masukkan operator (+, -, *, /): ");
                operator = scanner.nextLine();
            }

            try {
                int hasil = Komputasi.hitung(inputA, inputB, operator);
                System.out.println("Hasil: " + hasil);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();  // Menutup scanner setelah keluar dari perulangan
        System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana.");
    }
}
