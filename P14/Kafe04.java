package P14;

import java.util.Scanner;

public class Kafe04 {
    public static String DISKON50 ="DISKON50";
    public static String DISKON30 ="DISKON30";
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        Menu04("Budi", true);

        System.out.print("\nMasukkan nomor menu yang ingin anda pesan : ");
        int pilihanMenu04 = ayu.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem04 = ayu.nextInt();
        ayu.nextLine();
        System.out.print("Masukkan kode promo : ");
        String kodePromo04 = ayu.nextLine();

        int total04 = HitungTotalharga04(pilihanMenu04,banyakItem04,kodePromo04);
        System.out.println("Total bayar : Rp."+ total04);
    }
    public static int HitungTotalharga04 (int pilihanMenu04, int banyakItem04, String kodePromo04) {
        if (kodePromo04.equalsIgnoreCase(DISKON50)) {
            System.out.println("Anda mendapatkan diskon 50%");
        }else if (kodePromo04.equalsIgnoreCase(DISKON30)) {
            System.out.println("Anda mendapatkan diskon 30%");
        }else {
            System.out.println("Tampilan kode invalid");
        }
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