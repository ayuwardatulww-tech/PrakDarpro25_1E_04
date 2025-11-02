package P10;

import java.util.Scanner;

public class perhitungan04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = ayu.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlah04 = 0;
            System.out.print("n = "+ i + "-> jumlah kuadrat = ");
            for (int j = 1; j <= i; j++) {
                jumlah04 += j*j;
                System.out.print(j*j);
                if (j<i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = "+jumlah04);
        }
    }
}
