package P12;

import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jmlSiswa04 = ayu.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jmlMatkul04 = ayu.nextInt();

        int [][] nilai04 = new int[jmlSiswa04][jmlMatkul04];
        for (int i = 0; i < nilai04.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+ (i+1));
            double totalPerSiswa04 =0;

            for (int j = 0; j < nilai04[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1)+ " : ");
                nilai04[i][j] = ayu.nextInt();
                totalPerSiswa04 += nilai04[i][j];
            }
            System.out.println("Nilai rata - rata : "+(int)totalPerSiswa04/jmlMatkul04);
        }
        System.out.println("\n====================================");
        System.out.println("Rata rata Nilai setiap Mata Kuliah : ");

        for (int j = 0; j < jmlMatkul04; j++) {
            double totalPerMatkul04 = 0;

            for (int i = 0; i < jmlSiswa04; i++) {
                totalPerMatkul04 += nilai04[i][j];
            }
            System.out.println("Mata kuliah "+(j+1)+": "+totalPerMatkul04/jmlSiswa04);
        }
    }
}
