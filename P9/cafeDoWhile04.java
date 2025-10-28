package P9;

import java.util.Scanner;

public class cafeDoWhile04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        int kopi04, teh04,roti04;
        String namaPelanggan;
        double hargaKopi04=12000, hargaTeh04=7000,hargaRoti04=20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc04.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi04 = sc4.nextInt();
            System.out.print("jumlah teh: ");
            teh04 = sc4.nextInt();
            System.out.print("jumlah roti: ");
            roti04 = sc4.nextInt();
            double totalHarga = (kopi04 * hargaKopi04)+ (teh04*hargaTeh04) + (roti04*hargaRoti04);
            System.out.println("Total yang harus dibayar: Rp. "+ totalHarga);
        } while (true);
        System.out.println("semua Transaksi selesai");
    }
}
