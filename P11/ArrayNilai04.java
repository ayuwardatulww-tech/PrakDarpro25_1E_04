package P11;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [] nilaiAKhi04 = new int [10];
        for (int i = 0; i < nilaiAKhi04.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAKhi04[i] = ayu.nextInt();
        }
        for (int i = 0; i < nilaiAKhi04.length; i++) {
            if (nilaiAKhi04[i] > 70) {
                 System.out.println("Mahasiswa ke-"+i+" lulus");
                }
            }
           
    }

}
