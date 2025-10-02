package jobsheet5;
import java.util.Scanner;

public class Tugas2_26 {
    public static void main (String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka= input.nextInt();

        if (angka %2 == 0) {
            System.out.print("Genap");
        } else {
            System.out.print("Ganjil");
        }

    }
    
}
