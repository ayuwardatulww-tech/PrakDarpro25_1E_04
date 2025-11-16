import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [] angka = new int [10];
        int total=0;

         for (int i = 0; i < angka.length; i++) {
            System.out.print("MAsukkan elemen ke-"+(i+1)+" : ");
            angka[i] = ayu.nextInt();
            total += angka[i];
         }
         System.out.println("array terbalik");
         for (int i = 9; i >= 0; i--) {
            System.out.println(angka[i]);
         }
    }
}

