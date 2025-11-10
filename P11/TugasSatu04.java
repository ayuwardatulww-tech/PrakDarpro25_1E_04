package P11;

import java.util.Scanner;

public class TugasSatu04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int total04=0, nilaiTertinggi=0, nilaiTerendah=100;

        System.out.print("Masukkan banyak nilai mahasiswa : ");
        int bykNilai04 = ayu.nextInt();

        int [] nilaiMhs = new int[bykNilai04];

        for (int i = 0; i < bykNilai04; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = ayu.nextInt();
            total04 += nilaiMhs[i];
        }
        double rata04 = total04/nilaiMhs.length;

        for (int i = 0; i < bykNilai04; i++) {
            if (nilaiMhs[i]>nilaiTertinggi) {
                nilaiTertinggi=nilaiMhs[i];
            }else if (nilaiMhs[i]<nilaiTerendah) {
                nilaiTerendah=nilaiMhs[i];
            }
        }
        System.out.println();
        System.out.println("====== Daftar Nilai Mahasiswa ======");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa ke- "+(i+1)+" : " + nilaiMhs[i]);
        }
         System.out.println();
         System.out.println("Rata - rata nilai : "+rata04);
         System.out.println("Nilai tertinggi : "+nilaiTertinggi);
         System.out.println("Nilai terendah : "+nilaiTerendah);
        

    }
}
