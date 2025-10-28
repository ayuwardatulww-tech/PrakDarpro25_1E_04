package P9;

import java.util.Scanner;

public class bioskop04{
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);

        double hargaTiket04 = 50000;
        double diskon04, totHarga04, Hargapotongan04, totBayar04, totPenjualan04 = 0;
        int jumlahTiket04, totalTiket04 = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik '00'): ");
            jumlahTiket04 = sc4.nextInt();
            {
                
            }if (jumlahTiket04 < 0) {
                System.out.println("Jumlah tiket tidak valid! ulangi");
                continue;
            } if (jumlahTiket04 == 0) {
                break;
            }

            if (jumlahTiket04 > 10) {
                diskon04 = 0.15;
                System.out.println("Diskon 15%");
            } else if (jumlahTiket04 > 4) {
                diskon04 = 0.10;
                System.out.println("Diskon 10%");
            } else {
                diskon04 = 0.0;
                System.out.println("Tidak dapat diskon");
            }

            totHarga04 = jumlahTiket04 * hargaTiket04;
            Hargapotongan04 = totHarga04 * diskon04;
            totBayar04 = totHarga04 - Hargapotongan04;

            //System.out.println("Diskon: " + diskon04 );
            System.out.println("Total bayar: Rp " + totBayar04);
            
            totalTiket04 += jumlahTiket04;
            totPenjualan04 += totBayar04;
        }

        System.out.println("Total terjual tiket");
        System.out.println("Total tiket terjual : " + totalTiket04);
        System.out.println("Total pendapatan    : Rp " + totPenjualan04);
        System.out.println("Terima kasih telah membeli tiket!");

        sc4.close();
    }
}