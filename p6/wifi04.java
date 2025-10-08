package p6;

import java.util.Scanner;

public class wifi04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.println("masukkan nama pengguna");
        String pengguna04 = sc04.nextLine();
        if (pengguna04.equalsIgnoreCase("dosen")) {
            System.out.println("akses wifi diterima");
        }else if (pengguna04.equalsIgnoreCase("mahasiswa")) {
            System.out.println("jumlah sks");
            int jumlahAkses04 = sc04.nextInt();
        if (jumlahAkses04 >= 12){
            System.out.println("akses diterima");
        }else{
            System.out.println("akses ditolak");
        }    
        }
    }
}

