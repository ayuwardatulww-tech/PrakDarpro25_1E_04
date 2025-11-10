package P11;

import java.util.Scanner;

public class TugasTiga04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int pesanan=0;

        System.out.println("=== Silahkan Pilih Menu ===");
        String [] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("DAFTAR MENU");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+"- "+menu[i]);
        }
        
        boolean ada = false;
        System.out.println();
        System.out.print("Masukkan menu yang ingin dipesan : ");
        String cari = ayu.nextLine();

         for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ada = true;
                break;
            }
        }
        System.out.println();
        System.out.println("===== STATUS MENU =====");
        if (ada) {
            System.out.println("Menu "+cari+" tersedia di outlet ");
        }else{
            System.out.println("Menu "+cari+" tidak tersedia di outlet");
        }   
    }
}
