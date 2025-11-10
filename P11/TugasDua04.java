package P11;

import java.util.Scanner;

public class TugasDua04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        

        System.out.println("===== Selamat Datang di Coffe Shop =====");
        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesanan04 = ayu.nextInt();
        
        String pesanan04 [] = new String[jmlPesanan04];
        int harga04 [] = new int[jmlPesanan04];

        ayu.nextLine();

        for (int i = 0; i < jmlPesanan04; i++) {
            System.out.println("Masukkan pesanan ke-"+(i+1));
            System.out.print("Nama makanan / minuman : ");
            pesanan04[i] = ayu.nextLine();
        }
        for (int i = 0; i < pesanan04.length; i++) {
            System.out.print("Masukkan harga pesanan ke-"+(i+1)+" : ");
            harga04[i] = ayu.nextInt();

        }
        double total04 =0;
        System.out.println();
        System.out.println("===== Daftar Pesanan & Total =====");

        for (int i = 0; i < jmlPesanan04; i++) {
            System.out.println("Pesanan "+(i+1)+" : "+pesanan04[i]+" = Rp. "+harga04[i]);
            total04 += harga04[i];
        }
        System.out.println();
        System.out.println("=== TOTAL ===");
        System.out.println("Total pesanan "+jmlPesanan04+" dengan total harga Rp. "+total04);
        }
    }

