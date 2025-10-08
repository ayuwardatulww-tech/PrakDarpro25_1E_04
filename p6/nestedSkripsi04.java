package p6;
import java.util.Scanner;

public class nestedSkripsi04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        String pesan;

        System.out.print ("Apakah mahasiswa sudah bebas kompen? (YA/Tidak):");
        String bebasKompen04 = sc04.nextLine(). trim();

        System.out.println("Masukan jumlah log bimbingan pembimbing 1:");
        int bimbinganP104 = sc04.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2:");
        int bimbinganP204 = sc04.nextInt();

        if (bebasKompen04.equalsIgnoreCase("Ya")) {
            if (bimbinganP104 >= 8 && bimbinganP204 >= 4) {
                pesan = "semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";  
            } else if (bimbinganP104 < 8 && bimbinganP204 < 4) {
                pesan = "Gagal log bimbingan P1 belum mencapai 8 kali";
            } else if (bimbinganP104 < 8) {
                pesan = "gagal! log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "gagal! log bimbingan P2 belum mencapai 4 kali";
            }     
        } else {
            pesan = "gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}
