package P12;

import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String [][] penonton04 = new String[4][2];
        while (true) {
            System.out.print("Masukkan nama : ");
            nama = ayu.nextLine();
            System.out.print("Masukkan baris : ");
            baris = ayu.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = ayu.nextInt();
            ayu.nextLine();

            penonton04[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = ayu.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
