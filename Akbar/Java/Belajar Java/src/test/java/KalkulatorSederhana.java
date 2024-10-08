import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Number : ");
        int firstnumber = scanner.nextInt();

        System.out.print("Enter Your Second Number : ");
        int secondnumber = scanner.nextInt();

        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Pengurangan");
        System.out.print("Masukan Keinginanmu = ");
        int keingan = scanner.nextInt();

        if(keingan == 1){
            int penjumlahan = firstnumber + secondnumber;
            System.out.print("Hasil Penjumlahan = " + penjumlahan);
        } else if (keingan == 2){
            int pengurangan = firstnumber - secondnumber;
            System.out.print("Hasil Pengurangan = " + pengurangan);
        }else{
            System.out.print("Gapunya keinginan");
        }

    }
}
