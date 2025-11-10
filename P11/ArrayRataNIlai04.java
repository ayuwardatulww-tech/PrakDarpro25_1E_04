package P11;

import java.util.Scanner;

public class ArrayRataNIlai04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs04 = ayu.nextInt();

        int [] nilaiMhs04 = new int [jmlMhs04];
        double total04 = 0;
        double rata04;
        double totLulus04=0, totNOLulus =0, jmlLulus=0, jmlNoLulus=0;

        for (int i = 0; i < nilaiMhs04.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs04[i] = ayu.nextInt();
        }
        for (int i = 0; i < nilaiMhs04.length; i++) {
            if (nilaiMhs04[i]>70) {
                totLulus04 += nilaiMhs04[i];
                jmlLulus++;
            } else {
                totNOLulus += nilaiMhs04[i];
                jmlNoLulus++;
            }
        }
       
        rata04 = total04/nilaiMhs04.length; 
        double rataLulus = totLulus04/jmlLulus;
        double rataNoLulus = totNOLulus/jmlNoLulus;
        
        System.out.println("Rata - rata nilai = "+rata04);
        System.out.println("Rata - rata nilai lulus = " + rataLulus);
        System.out.println("Rata - rata nilai tidak lulus = " + rataNoLulus );
        
        
}
}
