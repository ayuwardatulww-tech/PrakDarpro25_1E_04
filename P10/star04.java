package P10;

import java.util.Scanner;

public class star04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan nilai n =");
        int n = ayu.nextInt();

        for (int i = 1; i <=n ; i+=2){
            System.out.print("*");
        }

    }
}
