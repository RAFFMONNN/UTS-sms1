import java.util.Scanner;

public class BMI21 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //menginput berat badan dan tinggi badan
        System.out.print("Masukkan Berat Badan (Masukkan dalam Kg)= ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (Masukkan dalam M)= ");
        double tinggiBadan = input.nextDouble();

        //perhitungan
        double BMI = 0;
        BMI = beratBadan / (tinggiBadan*tinggiBadan);


       if (BMI >= 30) {
            System.out.println("(Obese) - Risiko kesehatan: Tekanan darah tinggi, diabetes ");
        } else if (BMI > 30 ) {
            System.out.println("(Overweight) - Risiko kesehatan: Meningkatnya risiko penyakit jantung ");
        } else if (BMI < 25) {
            System.out.println("(Normalweight) - Risiko kesehatan: Relatif rendah ");
        } else if (BMI < 18.5) {
            System.out.println("(Underweight) - Risiko Kesehatan: Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh ");
        } 
        



        //output hasil nya
        System.out.println("NILAI BMI = " + BMI);
    }
}