package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkrinpi26 {
    public static void main (String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Apakah mahasiswa sudah bebas konmpen? (Ya/Tidak)");
        String bebasKompen= input.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1= input.nextInt();
        System.out.print("masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2= input.nextInt();
        
        if(bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                System.out.print("Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi");
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                System.out.print("Gagal! Log bimbingan P1 kurang 4 dan Log bikbingan P2 kurang dari 4");
            } else if (bimbinganP1 < 8) {
                System.out.print("Gagal! Loh bimbingan P1 kurang dari 8");
            } else {
                System.out.print("Gagal! Log bimbingan P2 kurang dari 4");
            }
        } else {
            System.out.print("Gagal! Mahasiswa masih memiliki tanggungan kompen");
        }
    }
    
}
