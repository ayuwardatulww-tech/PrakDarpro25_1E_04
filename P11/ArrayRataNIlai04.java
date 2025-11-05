package P11;

import java.util.Scanner;

public class ArrayRataNIlai04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [] nilaiMhs04 = new int [10];
        double total04 = 0;
        double rata04;
        int totLulus04=0;

        for (int i = 0; i < nilaiMhs04.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs04[i] = ayu.nextInt();
        }
        for (int i = 0; i < nilaiMhs04.length; i++) {
            if (nilaiMhs04[i]>70) {
                System.out.println("Mahasiswa ke-"+i+" lulus");
                totLulus04++;
            } 
        }
        for (int i = 0; i < nilaiMhs04.length; i++) {
            total04 += nilaiMhs04[i];
        }
        rata04 = total04/nilaiMhs04.length; 
        System.out.println("Rata - rata nilai = "+rata04);
        System.out.println("Total mahasiswa lulus : "+totLulus04 );
    }
}
