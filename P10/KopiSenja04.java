package P10;

import java.util.Scanner;

public class KopiSenja04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int totPelanggan=0;
        int totItemCab=0;

        System.out.print("Jumlah cabang kafe : ");
        int cabKafe = ayu.nextInt();
        System.out.println("==== Input Penjualan Per Cabang ====");
        System.out.println();
        
        int cabang = 1;
        while (cabang <= cabKafe) {
            System.out.println("--- Cabang "+ cabang + "---");
            System.out.print("Jumlah Pelanggan : " );
            int jmlPelanggan = ayu.nextInt();

            int noPelanggan = 1;
            int totalItem=0;
            while (noPelanggan <= jmlPelanggan) {
                System.out.print(" - Pelanggan "+noPelanggan + " memesan berapa item? ");
                int item = ayu.nextInt();
                totalItem += item;
                noPelanggan++;
                
            }
          System.out.println("Total Cabang "+ cabang+ ":");
          System.out.println(" - Pelanggan : "+ jmlPelanggan+ " orang" );  
          System.out.println(" - Item terjual : "+ totalItem + " item");
          System.out.println();

          totPelanggan += jmlPelanggan;
          totItemCab += totalItem ;
          cabang++;
        }
        System.out.println();
        System.out.println("=== Total Seluruh Cabang ===");
        System.out.println("Pelanggan : "+ totPelanggan + " orang");
        System.out.println("Item Terjual : "+totItemCab + " item");

    }
}
