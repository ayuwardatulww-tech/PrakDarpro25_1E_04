package P11;

import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int hasil04 = 0;

        System.out.print("Masukkan banyak nilai yang akan diinput : ");
        int nilai04 = ayu.nextInt();

        int [] arrNilai04 = new int [nilai04];

        for (int i = 0; i < nilai04; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai04[i] = ayu.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key04 = ayu.nextInt();
         for (int i = 0; i < arrNilai04.length; i++) {
            if (key04 == arrNilai04[i]) {
                hasil04 = (i+1);
                break;
            }
        }   
        if (hasil04>0) {
            System.out.println("Nilai "+key04+" ketemu, merupakan nilai mahasiswa ke-"+hasil04);
        } 
       
    }
}
