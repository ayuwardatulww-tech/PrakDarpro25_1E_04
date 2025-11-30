package P14;
import java.util.Scanner;
public class Kubus04 {
 public static void main(String[] args) {
    Scanner ayu = new Scanner(System.in);
    int Vol04, L04;

    System.out.print("Masukkan panjang rusuk kubus (cm) : ");
    int S04 = ayu.nextInt();

    Vol04 = VolumeKubus04(S04);
    L04 = LuasPermukaanKubus04(S04);
    System.out.println("Volume Kubus : "+Vol04);
    System.out.println("Luas Permukaan Kubus : "+L04);
 }   
 public static int VolumeKubus04 (int S04){
    int Vol04 = S04 * S04 * S04;
    return Vol04;
 }
 public static int LuasPermukaanKubus04 (int S04){
    int L04 = 6 * S04 *S04;
    return L04;
 }
}
