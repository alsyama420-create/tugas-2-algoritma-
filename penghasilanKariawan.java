
import java.util.Scanner;

public class penghasilanKariawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();

        System.out.print("Masukkan jam lembur: ");
        int jamLembur = input.nextInt();

        // Menentukan gaji pokok berdasarkan golongan
        double gajiPokok;

        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 95000000;
        } else {
            System.out.println("Golongan tidak valid.");
            input.close();
            return;
        }

        // Menentukan persentase lembur
        double persen;

        if (jamLembur <= 0) {
            persen = 0;
        } else if (jamLembur == 1) {
            persen = 0.30;
        } else if (jamLembur == 2) {
            persen = 0.32;
        } else if (jamLembur == 3) {
            persen = 0.34;
        } else if (jamLembur == 4) {
            persen = 0.36;
        } else if (jamLembur == 5) {
            persen = 0.38;
        } else {
            persen = 0.38;
        }

        double gajiLembur = persen * gajiPokok;
        double totalGaji = gajiPokok + gajiLembur;

        // Output
        System.out.println("\n=== Hasil Perhitungan Gaji Karyawan ===");
        System.out.println("Golongan   : " + golongan);
        System.out.printf("Gaji Pokok : Rp %,.2f%n", gajiPokok);
        System.out.printf("Jam Lembur : %d%n", jamLembur);
        System.out.printf("Gaji Lembur: Rp %,.2f%n", gajiLembur);
        System.out.printf("Total Gaji : Rp %,.2f%n", totalGaji);

        input.close();
    }
}
