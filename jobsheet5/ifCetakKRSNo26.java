package jobsheet5;
import java.util.Scanner;

public class ifCetakKRSNo26 {
    public static void main (String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("-----Cetak KRS SIAKAD-----");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas= input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }



    }
    
}
