package P9;

import java.util.Scanner;

public class siakadWhile04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        int nilai04, jml04,i=0;

        System.out.print("Masukkan jumlah mahasiswa:");
        jml04 = sc04.nextInt();
        while (i<jml04){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+":");
            nilai04 = sc04.nextInt();
            if (nilai04<0 || nilai04>100){
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai04>80 && nilai04<=100){
                System.out.println("Nilai mahasiswa ke-"+(i+1)+"adalah A");
            }else if (nilai04>73 && nilai04<=80){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+"adalah B+");
            }else if (nilai04 >65 && nilai04 <=73){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+"adalah B");
            }else if (nilai04 >60 && nilai04<=65){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+"adalah C+");
            }else if (nilai04>50 && nilai04<=60){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+"adalah C");
            }else if (nilai04>39 && nilai04<=50){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+"adalah D");
            }else {
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+"adalah E");
            }
             i++;
            }
        }
            
        }
