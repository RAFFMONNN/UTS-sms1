import java.util.Scanner;

public class bilBesar21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // menginput angka
        double angka1, angka2, angka3;
        System.out.print("Masukkan Angka Pertama = ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan Angka Kedua = ");
        angka2 = input.nextDouble();
        System.out.print("Masukkan Angka Ketiga = ");
        angka3 = input.nextDouble();
        //perhitungan
        double terbesar;

        if (angka1 >= angka2 && angka1 >= angka3) {
            terbesar = angka1;
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            terbesar = angka2;
        } else {
            terbesar = angka3;
        }
    


        System.out.println("Angka Terbesar = " + terbesar);
        System.out.println("Terdapat Lebih Dari Satu Angka Terbesar = ");
        if (angka1 == terbesar) System.out.print("Angka Pertama\n" + angka1);
            if (angka2 == terbesar) System.out.print("Angka Kedua\n" + angka2);
            if (angka3 == terbesar) System.out.print("Angka Ketiga\n" + angka3);
       
    }
}