package P14;
import java.util.Scanner;
public class RekapPenjualanKafe04 {
    static String Menu04[] = {"Kopi", "Teh", "Es Kelapa", "Roti Bakar", "Gorengan"};
    
    public static void main(String[] args) {
        int[][] penjualan04 = new int[5][7];
        
        System.out.println("=== REKAP PENJUALAN CAFE ===\n");
        
        // Memanggil semua fungsi
        InputData04(penjualan04);
        TampilkanData04(penjualan04);
        menuTerlaris04(penjualan04);
        RataRata04(penjualan04);
    }
    public static void InputData04(int[][] penjualan04) {
        Scanner ayu = new Scanner(System.in);
        System.out.println("Masukkan data penjualan");
        
        for (int i = 0; i < penjualan04.length; i++) {
            System.out.println("\n" + Menu04[i] + ":");
            for (int j = 0; j < penjualan04[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " : ");  // PERBAIKAN DI SINI!
                penjualan04[i][j] = ayu.nextInt();
            }
        }
        System.out.println();
    }
    public static void TampilkanData04(int[][] penjualan04) {
        System.out.println("=== DATA PENJUALAN ===");
        System.out.println("Menu\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7\tTotal");
        
        for (int i = 0; i < 5; i++) {
            int total04 = 0;
            System.out.print(Menu04[i] + "\t\t");
            
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan04[i][j] + "\t");
                total04 += penjualan04[i][j];
            }
            System.out.println(total04);
        }
        System.out.println();
    }
    public static void menuTerlaris04(int[][] penjualan04) {
        System.out.println("=== MENU TERLARIS ===");
        int maxtot04 = 0;
        String menuTerlaris04 = "";
        
        for (int i = 0; i < 5; i++) {
            int total04 = 0;
            for (int j = 0; j < 7; j++) {
                total04 += penjualan04[i][j];
            }       
            if (total04 > maxtot04) {
                maxtot04 = total04;
                menuTerlaris04 = Menu04[i];
            }
        }
        System.out.println(menuTerlaris04 + " = " + maxtot04 + " porsi\n");
    }
    public static void RataRata04(int[][] penjualan04) {
        System.out.println("=== RATA-RATA PER MENU ===");
        
        for (int i = 0; i < 5; i++) {
            int total04 = 0;
            for (int j = 0; j < 7; j++) {
                total04 += penjualan04[i][j];
            }
            double Rata04 = total04 / 7.0;
            System.out.println(Menu04[i] + "\t\t: " + String.format("%.2f", Rata04) + " porsi/hari");
        }
    }
}