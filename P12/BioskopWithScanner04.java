package P12;

import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int menu=0;
        boolean tampilan = true;
        

        String [][] penonton04 = new String[4][2];
        while (tampilan) {
            System.out.println("===== MENU BIOSKOP =====");
            System.out.println("- Menu 1 : Input Data Penonton");
            System.out.println("- Menu 2 : Tampilkan Daftar Penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.print("Pilih Menu : ");
            menu = ayu.nextInt();
            ayu.nextLine();
        
        if (menu==1) {
            int baris, kolom;
            String nama, next;
    
        while (true) {
            System.out.print("Masukkan nama : ");
            nama = ayu.nextLine();
            System.out.print("Masukkan baris (1-4) : ");
            baris = ayu.nextInt();
            System.out.print("Masukkan kolom (1-2) : ");
            kolom = ayu.nextInt();
            ayu.nextLine();

            if (baris < 1 || baris > 4 ||  kolom < 1 || kolom > 2) {
                System.out.println("WARNING !! Tempat tidak tersedia");
                continue;
            }
            ayu.nextLine();
            if (penonton04[baris-1][kolom-1] != null ){
                System.out.println("Tempat sudah terisi, silahkan pilih tempat lain!!");
                continue;
            }

            penonton04[baris-1][kolom-1] = nama;
 
            System.out.print("Input penonton lainnya? (y/n): ");
            next = ayu.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        }else if (menu==2) {
            System.out.println("===== DAFTAR PENONTON =====");
            for (int i = 0; i < penonton04.length; i++) {
                for (int j = 0; j < penonton04[i].length; j++) {
                    System.out.print(penonton04[i][j]);
                    if (j<penonton04[i].length-1) {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
        else if (menu==3) {
            tampilan = false;
            System.out.println("Terima Kasih");
            break;
        }
    }      
    }
}
