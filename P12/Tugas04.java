package P12;
import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [] angka = new int [10];
        int total=0;

         for (int i = 0; i < angka.length; i++) {
            System.out.print("MAsukkan elemen ke-"+(i+1)+" : ");
            angka[i] = ayu.nextInt();
         }
         System.out.print("Masukkan nilai yang dicari : ");
        int n = ayu.nextInt();

        boolean ditemukan = false;
        
        for (int i = 0; i < angka.length; i++) {
            if (angka[i]==n) {
                System.out.print("Nilai "+n+" ditemukan pada indeks: ");
                System.out.println("Indeks ke-"+(i+1));
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Nilai temukan dalam array");
        }else{
            System.out.println("Nilai tidak ditemukan");
        }
    }
}

