package p6;
import java.util.Scanner;

public class ifElseCetakKRS044 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        int semester04;

        System.out.println("---Cetas KRS SIAKAD");
        System.out.println("Masukkan semester saat ini");
        semester04 = sc04.nextInt();

       if (semester04 == 1) {
        System.out.println("KRS Semester 1 ditampilkan");
       } else if (semester04 == 2) {
         System.out.println("KRS Semester 2 ditampilkan");
       } else if (semester04 == 3) {
         System.out.println("KRS Semester 3 ditampilkan");
       } else if (semester04 == 4) {
        System.out.println("KRS Semester 4 ditampilkan");
       } else if (semester04 == 5) {
        System.out.println("KRS Semester 5 ditampilkan");
       } else if (semester04 == 6) {
        System.out.println("KRS Semester 6 ditampilkan");
       } else if (semester04 == 7) {
         System.out.println("KRS Semester 7 ditampilkan");
       } else if (semester04 == 8) {
        System.out.println("KRS Semester 8 ditampilkan");
       }else{
         System.out.println("Semester tidak valid");
       }
        }

    }

