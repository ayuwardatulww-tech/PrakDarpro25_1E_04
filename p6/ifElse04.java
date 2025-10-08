package p6;

import java.util.Scanner;

public class ifElse04 {
    public static void main(String[] args) {
       Scanner sc04 = new Scanner(System.in);
       int angka04;
       System.out.println("masukkan angka");
       angka04 = sc04.nextInt();
       
       if (angka04 % 2 == 0) {
        System.out.println("genap");
       }else {
        System.out.println("ganjil");
       }
    }
}
