package P11;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [] nilaiAKhi04 = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAKhi04[i] = ayu.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiAKhi04[i]);
        }
    }
}
