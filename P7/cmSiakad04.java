package P7;

import java.util.Scanner;

public class cmSiakad04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        
        System.out.println("=====INPUT DATA MAHASISWA=====");
        System.out.print("Nama: ");
        String nama04 = sc04.nextLine();
        System.out.print("NIM: ");
        String nim04 = sc04.nextLine();
        System.out.println("");
        System.out.println("Masukkan Nilai Angka (0-100)");
        System.out.print("1. Pancasila: ");
        int nilaiPancasila04 = sc04.nextInt();
        System.out.print("2. Dasar Pemograman: ");
        int nilaiDaspro = sc04.nextInt();
        System.out.print("3. Bahasa Ingrris: ");
        int nilaiBing = sc04.nextInt();
        if (nilaiPancasila04>0 && nilaiPancasila04<100 && nilaiDaspro>0 && nilaiDaspro<100 && nilaiBing>0 && nilaiBing<100) {
            
       
        //sks matkul
        System.err.print("sks pancasila: ");
        int sks1 = sc04.nextInt();
        System.out.print("sks dasar pemograman: ");
        int sks2 = sc04.nextInt();
        System.out.print("sks bahasa inggris: ");
        int sks3 = sc04.nextInt();
        int totalSKS = sks1+sks2+sks3;

        //nilai huruf
        String nilaiHuruf1;
        if (nilaiPancasila04>=80) {
            nilaiHuruf1 = "A";
        }else if (nilaiPancasila04>=73) {
            nilaiHuruf1 = "B+";
        }else if (nilaiPancasila04>=65) {
            nilaiHuruf1 = "B";
        }else if (nilaiPancasila04>=60) {
            nilaiHuruf1 = "C+";
        }else if (nilaiPancasila04>=50) {
            nilaiHuruf1 = "C";
        }else if (nilaiPancasila04>=39) {
            nilaiHuruf1 = "D";
        }else {
            nilaiHuruf1 = "E";
        }

        double nilaiSetara1;
        if (nilaiPancasila04>=80) {
            nilaiSetara1 = 4;
        }else if (nilaiPancasila04>=73) {
            nilaiSetara1 = 3.5;
        }else if (nilaiPancasila04>=65) {
            nilaiSetara1 = 3;
        }else if (nilaiPancasila04>=60) {
            nilaiSetara1 = 2.5;
        }else if (nilaiPancasila04>=50) {
            nilaiSetara1 = 2;
        }else if (nilaiPancasila04>=39) {
            nilaiSetara1 = 1;
        }else {
            nilaiSetara1 = 0.0;
        }
        System.out.println("nilai huruf pancasila: "+nilaiPancasila04);
        System.out.println("nilai setara pancasila: "+nilaiSetara1);
        
        String nilaiHuruf2= "";
        if (nilaiDaspro>=80) {
            nilaiHuruf2 = "A";
        }else if (nilaiDaspro>=73) {
            nilaiHuruf2 = "B+";
        }else if (nilaiDaspro>=65) {
            nilaiHuruf2 = "B";
        }else if (nilaiDaspro>=60) {
            nilaiHuruf2 = "C+";
        }else if (nilaiDaspro>=50) {
            nilaiHuruf2 = "C";
        }else if (nilaiDaspro>=39) {
            nilaiHuruf2 = "D";
        }else {
            nilaiHuruf2 = "E";
        }

        double nilaiSetara2;
        if (nilaiDaspro>=80) {
            nilaiSetara2 = 4;
        }else if (nilaiDaspro>=73) {
            nilaiSetara2 = 3.5;
        }else if (nilaiDaspro>=65) {
            nilaiSetara2 = 3;
        }else if (nilaiDaspro>=60) {
            nilaiSetara2 = 2.5;
        }else if (nilaiDaspro>=50) {
            nilaiSetara2 = 2;
        }else if (nilaiDaspro>=39) {
            nilaiSetara2 = 1;
        }else {
            nilaiSetara2 = 0.0;
        }
        System.out.println("nilai huruf dasar pemograman: "+ nilaiHuruf2);
        System.out.println("nilai setara dasar pemograman: "+nilaiSetara2); 

        String nilaiHuruf3;
        if (nilaiBing>=80) {
            nilaiHuruf3 = "A";
        }else if (nilaiBing>=73) {
            nilaiHuruf3 = "B+";
        }else if (nilaiBing>=65) {
            nilaiHuruf3 = "B";
        }else if (nilaiBing>=60) {
            nilaiHuruf3 = "C+";
        }else if (nilaiBing>=50) {
            nilaiHuruf3 = "C";
        }else if (nilaiBing>=39) {
            nilaiHuruf3 = "D";
        }else {
            nilaiHuruf3 = "E";
        }

        double nilaiSetara3;
        if (nilaiBing>=80) {
            nilaiSetara3= 4;
        }else if (nilaiBing>=73) {
            nilaiSetara3 = 3.5;
        }else if (nilaiBing>=65) {
            nilaiSetara3 = 3;
        }else if (nilaiBing>=60) {
            nilaiSetara3 = 2.5;
        }else if (nilaiBing>=50) {
            nilaiSetara3 = 2;
        }else if (nilaiBing>=39) {
            nilaiSetara3 = 1;
        }else {
            nilaiSetara3 = 0.0;
        }
       
        //menghitung ip 
        double nilaiBobot1 = nilaiSetara1*sks1;
        double nilaiBobot2 = nilaiSetara2*sks2;
        double nilaiBobot3 = nilaiSetara3*sks3;
        double totalBobot = nilaiBobot1+nilaiBobot2+nilaiBobot3;
        double ip = totalBobot/totalSKS;
     
        // 
        String statusSemester;
        if ((ip >= 2.00 && nilaiPancasila04 > 2 && nilaiDaspro > 0 && nilaiBing > 0)) {
            statusSemester = "lulus";
         }else {
            statusSemester = "tidak lulus (karena nilai pancasila > C)";
         }

         // tabel
         System.out.println("========== HASIL KONVERSI NILAI MAHASISWA==========");
         System.out.println("Nama: "+nama04);
         System.out.println("NIM: "+ nim04);
         System.out.println("--------------------------------------------------------------");
         System.out.println("Mata Kuliah\t\tSKS\tNilai\tHuruf\tSetara\t"); 
         System.out.println("--------------------------------------------------------------");
         System.out.println("Pancasila"+"\t\t"+sks1+"\t"+nilaiPancasila04+"\t"+nilaiHuruf1+"\t"+nilaiSetara1);
         System.out.println("Dasar Pemograman"+"\t"+sks2+"\t"+nilaiDaspro+"\t"+nilaiHuruf2+"\t"+nilaiSetara2);
         System.out.println("Bahasa Inggris"+"\t\t"+sks3+"\t"+nilaiBing+"\t"+nilaiHuruf3+"\t"+nilaiSetara3);
         System.out.println("--------------------------------------------------------------");
         System.out.println("Total SKS: "+totalSKS);
         System.out.println("Total Bobot: "+totalBobot);
         System.out.println("Indeks Prestasi (IP): "+ ip);
         System.out.println("Status Semester: "+statusSemester);

          }else {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        }
        sc04.close();
    }

}
