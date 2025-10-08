package p6;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class perpustakaan04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        Boolean kartuMahasiswa, registrasiOnline;
        System.out.println("Apakah ada kartu mahasiswa (true/false)");
        kartuMahasiswa = sc04.nextBoolean();
        System.out.println("Apakah sudah registrasi online (true/false)");
        registrasiOnline = sc04.nextBoolean();
        if (kartuMahasiswa && registrasiOnline) {
            System.out.println("boleh masuk");
        }else {
            System.out.println("tidak boleh masuk");
        }
    }
}
