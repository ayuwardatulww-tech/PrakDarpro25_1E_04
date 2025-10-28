package P9;

import java.util.Scanner;

public class parkir04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        int jenis04, durasi04 = 0, total04 = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 mobil,2 motor,0 keluar)");
            jenis04 = ayu.nextInt();

            if (jenis04 == 0) {
                System.out.println("Program Selesai.");
                break;
            }
            if (jenis04 == 1 || jenis04 == 2) {
                System.out.println("Masukkan durasi (jam)");
                durasi04 = ayu.nextInt();
            }
            if (durasi04 > 5) {
                total04 += 12500;
            } else if (jenis04 == 1) {

                total04 += durasi04 * 3000;

            } else if (jenis04 == 2) {
                total04 += durasi04 * 2_000;
            } else {
                System.out.println("jenis kendaraan tidak dikenali");
            }
        } while (true);

        System.out.println("Total pemasukan: Rp" + total04);

    }
}1

