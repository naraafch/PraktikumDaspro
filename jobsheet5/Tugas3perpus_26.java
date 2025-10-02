package jobsheet5;
import java.util.Scanner;

public class Tugas3perpus_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kartuMahasiswa, registrasiOnline;

        System.out.print("Apakah membawa kartu mahasiswa? (YA/TIDAK): ");
        kartuMahasiswa = input.nextLine();
        System.out.print("Apakah sudah registrasi online? (YA/TIDAK): ");
        registrasiOnline = input.nextLine();

        if (kartuMahasiswa.equals("YA") || registrasiOnline.equals("YA")) {
            System.out.println("SILAHKAH MASUK");
        } else {
            System.out.println("DILARANG MASUK");
        }

    }
}