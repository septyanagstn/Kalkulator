package kalkulatorapp;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");

        System.out.print("Masukkan angka pertama: ");
        String inputA = scanner.nextLine();

        System.out.print("Masukkan angka kedua: ");
        String inputB = scanner.nextLine();

        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        try {
            int hasil = Computation.hitung(inputA, inputB, operator);
            System.out.println("Hasil: " + hasil);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
