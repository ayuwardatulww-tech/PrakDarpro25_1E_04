package P14;

import java.util.Scanner;

public class Kafe04 {
    public static String DISKON50 ="DISKON50";
    public static String DISKON30 ="DISKON30";
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        Menu04("Budi", true);

        System.out.print("Berapa jenis menu yang akan dipesan ? ");
        int JumlahMenu04 = ayu.nextInt();
        int totAll04=0;

        for (int i = 0; i < JumlahMenu04; i++) {
            System.out.println("----- Pesanan ke-"+(i+1)+" -----");
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan : ");
            int pilihanMenu04 = ayu.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            int banyakItem04 = ayu.nextInt();
            
            int hargaMenu04 = HargaPerMenu04(pilihanMenu04, banyakItem04);
            totAll04 += hargaMenu04;
            System.out.println("Harga Menu ini : "+hargaMenu04);
        }
            ayu.nextLine();
            System.out.println();
            System.out.print("Masukkan kode promo : ");
            String kodePromo04 = ayu.nextLine();
            System.out.println();

            int total04 = HitungTotalharga04(totAll04,kodePromo04);
            System.out.println("Total bayar : Rp."+ total04);
    }
    public static int HitungTotalharga04 (int totAll04, String kodePromo04) {
        System.out.println("-- Total sebelum diskon Rp."+totAll04);
        int totAkhir04 = totAll04;

        if (kodePromo04.equalsIgnoreCase(DISKON50)) {
            System.out.println("Anda mendapatkan diskon 50%");
            int diskon04 = totAll04 * 50/100;
            totAkhir04 = totAll04 - diskon04;
        }else if (kodePromo04.equalsIgnoreCase(DISKON30)) {
            System.out.println("Anda mendapatkan diskon 30%");
            int diskon04 = totAll04 * 30/100;
            totAkhir04 = totAll04 - diskon04;
        }else {
            System.out.println("Tampilan kode invalid");
        }
        return totAkhir04;
    }
    public static int HargaPerMenu04 (int pilihanMenu04, int banyakItem04){
        int[] hargaItems = {15000, 20000, 22000, 12000, 18000, 18000};

        int hargaTotal04 = hargaItems[pilihanMenu04-1]*banyakItem04;
        return hargaTotal04;
    }
    public static void Menu04(String namaPelanggan04, boolean isMember04){
        if (isMember04) {
            System.out.println("Anda adalah member dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. KOpi Hitam - RP. 15.000");
        System.out.println("2. Cappucino - RP.20.000");
        System.out.println("3. Latte - Rp.22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("=================================");
        System.out.println("Silahkan Pilih Menu Yang Anda Ingingkan ");
    } 
}