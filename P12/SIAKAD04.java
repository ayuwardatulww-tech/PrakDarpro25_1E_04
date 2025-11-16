package P12;

import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [][] nilai04 = new int[4][3];
        for (int i = 0; i < nilai04.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+ (i+1));
            double totalPerSiswa04 =0;

            for (int j = 0; j < nilai04[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1)+ " : ");
                nilai04[i][j] = ayu.nextInt();
                totalPerSiswa04 += nilai04[i][j];
            }
            System.out.println("Nilai rata - rata : "+(int)totalPerSiswa04/3);
        }
        System.out.println("\n====================================");
        System.out.println("Rata rata Nilai setiap Mata Kuliah : ");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkul04 = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul04 += nilai04[i][j];
            }
            System.out.println("Mata kuliah "+(j+1)+": "+totalPerMatkul04/4);
        }
    }
}
