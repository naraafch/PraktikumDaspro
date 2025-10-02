package jobsheet5;
import java.util.Scanner;

public class Tugas3wifi_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pengguna;
        int sks;

        System.out.print("Pengguna (Dosen/Mahasiswa): ");
        pengguna = input.nextLine();

        if (pengguna.equals("Dosen")) {
            System.out.println("Akses WiFi diberikan");
        } else if (pengguna.equals("Mahasiswa")) 
            System.out.print("Masukkan jumlah SKS: ");
            sks= input.nextInt();
            if (sks>=12) {
                System.out.println("Akses WIFI diberikan");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }     
        
            input.close();
        }
    }
 
