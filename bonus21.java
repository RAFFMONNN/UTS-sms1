import java.util.Scanner;

public class bonus21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        System.out.println("--- Menginput Data Karyawan ---");
        System.out.print("Masukkan nilai kinerja (1 - 100): ");
        int nilaiKinerja = input.nextInt();
        System.out.print("Masukkan lama bekerja (tahun): ");
        int lamaBekerja = input.nextInt();
        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = input.nextDouble();
        System.out.print("Apakah memiliki sertifikasi? (ya/tidak): ");
        String sertifikasi = input.next();

        double bonus = 0;

        // Perhitungan
        if (nilaiKinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else {
                bonus = 0.07 * gajiPokok;
            }
        } else if (nilaiKinerja >= 70) {
            if (lamaBekerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else {
                bonus = 0.05 * gajiPokok;
            }
        } else {
            bonus = 0;
        }

        // Bonus tambahan jika memiliki sertifikasi dan memenuhi syarat kinerja & lama
        // bekerja
        if ((nilaiKinerja >= 70) && (sertifikasi.equalsIgnoreCase("ya"))) {
            bonus += 500_000;
        }

        // Output hasil perhitungan
        System.out.println("Total bonus yang diterima: Rp " + String.format("%,.0f", bonus));
    }
}
