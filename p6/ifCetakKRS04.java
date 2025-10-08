package p6;

import java.util.Scanner;

public class ifCetakKRS04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = sc04.nextBoolean();

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        String pesan;

        pesan=uktLunas?"pembayaran UKT terlunasi"+"Silahkan cetak kRS dan minta tanda tangan DPA":"Registrasi ditolak";
        


        //if (uktLunas) {
             //System.out.println("pembayaran UKT terlunasi");
              //System.out.println("Silahkan cetak kRS dan minta tanda tangan DPA");    
        //} else {
            //System.out.println("Registrasi ditolak");
            //System.out.println("Silahkan lunasi UKT terlebih dahulu");
        //}
            System.out.println(pesan);
    }
}
