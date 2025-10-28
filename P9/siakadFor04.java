package P9;

import java.util.Scanner;

public class siakadFor04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        double nilai04, tertinggi04=0, terendah04=100;

        for (int i =1; i <=10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- "+i+":");
            nilai04 = sc04.nextDouble();
            if (nilai04>tertinggi04) {
                tertinggi04 = nilai04;
            }
            if (nilai04<terendah04) {
                terendah04 = nilai04;
            }
        
        }
     System.out.println("Nilai tertinggi : "+tertinggi04);
     System.out.println("Nilai terendah : "+terendah04);
     
    }
}
