package P12;

import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        int [][] nilai04 = new int[4][3];
        for (int i = 0; i < nilai04.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+ (i+1));

            for (int j = 0; j < nilai04[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1)+ " : ");
                nilai04[i][j] = ayu.nextInt();
            }
        }
    }
}
