package P10;

import java.util.Scanner;

public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int nilai;
        
       int i=1;
        while (i<=6) {
            System.out.println("Kelompok "+i);
            
            float totalNilai = 0;
            for (int j = 1; j<=5; j++) {
                System.out.print("Nilai dari kelompok penilai "+j+":");
                nilai=ayu.nextInt();
                totalNilai += nilai;
            }
            float rataNilai = totalNilai/5;
            System.out.println("Rata - rata nilai : "+ rataNilai);
            i++;
        }
    
    }
}
