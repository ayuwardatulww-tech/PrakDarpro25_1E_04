package P14;
import java.util.Scanner;

public class HItungBalok04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int P04,l04,t04,L04,vol04;

        System.out.print("Masukkan panjang ");
        P04 = ayu.nextInt();

        System.out.print("Masukkan Lebar ");
        l04 = ayu.nextInt();

        System.out.print("Masukkan tinggi ");
        t04 = ayu.nextInt();
        
        L04 = hitungLuas04(P04, l04);
        System.out.println("Luas persegi panjang adalah "+L04);
        vol04 = hitungVolume04(t04, P04, l04);
        System.out.println("Volume balok adalah "+vol04);

        ayu.close();
    }
    static int hitungLuas04(int pjg04, int lb04){
        int Luas04 = pjg04*lb04;
        return Luas04;
    }
    static int hitungVolume04(int tinggi04, int a04, int b04){
        int volume04 = hitungLuas04(a04, b04)*tinggi04;
        return volume04;
    }

}
