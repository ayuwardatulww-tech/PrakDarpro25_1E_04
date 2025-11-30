package P14;
import java.util.Scanner;
public class NilaiMahasiswa04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        System.out.print("Berapa Jumlah Mahasiswa (N) ? ");
        int N04 = ayu.nextInt();

        int [] NilaiMahasiswa04 = new int[N04];

        isianArray04(NilaiMahasiswa04);
        tampilArray04(NilaiMahasiswa04);
        int totalNilai04 = hitTot04(NilaiMahasiswa04);

        System.out.println("=== TOTAL NILAI ===");
        System.out.println("Total nilai seluruh mahasiswa : "+ totalNilai04);
    }
    public static void isianArray04 (int [] nilaiArray04){
        Scanner ayu = new Scanner(System.in);
        for (int i = 0; i < nilaiArray04.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiArray04[i] = ayu.nextInt();
        }
    }
    public static void tampilArray04 (int [] nilaiArray04){
        for (int i = 0; i < nilaiArray04.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+" : "+nilaiArray04[i]);
        }
    }
    public static int hitTot04 (int [] nilaiArray04) {
        int total04 = 0;
        for (int i = 0; i < nilaiArray04.length; i++) {
            total04 += nilaiArray04[i];
        }
        return total04;
    }
}
