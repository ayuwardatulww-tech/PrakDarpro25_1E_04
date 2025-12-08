package P16;

import java.util.Scanner;

public class CM2_Siakad_04 {
    static Scanner ayu = new Scanner(System.in);
    static String Matkul04 [];
    static int sks04[];

    static int jmlMhs04;
    static int nimMhs04[];
    static String namaMhs04[];

    
    static int nilaiMhs04[][];
    static String nilaiHUruf04 [][];
    static double nilaiSetara04 [][];

    static int pilihNo04,pilih04,mhs04;
    static double ipSemester04;
    static String status04;
    public static void main(String[] args) {
        Matkul04 = new String[]{"Pancasila","Konsep Teknologi Informasi","Critikal Thingking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemograman","Praktikum Dasar Pemograman","Keselamatan dan Kesehatan Kerja","Fisika"};
        sks04 = new int[] {2,2,2,2,2,2,3,2,2};
       
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs04 = ayu.nextInt();

        namaMhs04 = new String[jmlMhs04];
        nimMhs04 = new int[jmlMhs04];

        nilaiMhs04 = new int[jmlMhs04][Matkul04.length];
        nilaiHUruf04 = new String[jmlMhs04][Matkul04.length];
        nilaiSetara04 = new double[jmlMhs04][Matkul04.length];

        int pilih04;
        do {
        System.out.println("=====================================");
        System.out.println("    SISTEM SIAKAD SEDERHANA MENU    ");
        System.out.println("=====================================");
        System.out.println("1. Input nilai mata kuliah");
        System.out.println("2. Lihat KHS (KOnversi & IP + Status");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu : ");
        pilih04 = ayu.nextInt();

        switch (pilih04) {
            case 1 :inputNIlai04();
                break;
            case 2 :KHSmahasiswa04();
                break;
            case 3 :System.out.println("Program telah selesai");
                break;
            default:System.out.println("Pilihan tidak valid!");
                break;
        }
         } while (pilih04 != 3);
    }
    static void inputNIlai04(){
        System.out.println("Daftar Mahasiswa: ");
        for (int i = 0; i < jmlMhs04; i++) {
            System.out.println((i+1)+". "+(namaMhs04[i]==null?"(Belum diisi)" : namaMhs04[i]));
            
        }
        System.out.println("Pilih nomor mahasiswa : ");
        pilihNo04 = ayu.nextInt();

        if (pilihNo04<1 || pilihNo04>jmlMhs04) {
            System.out.println("Nomor tidak valid");
            return;
        }
        int index04 = pilihNo04 -1;

        System.out.println("=== INPUT NILAI MAHASISWA ===");
        System.out.print("Nama : ");
        namaMhs04[index04]= ayu.nextLine();
        ayu.nextLine();
        System.out.print("NIM : ");
        nimMhs04[index04] = ayu.nextInt();
        

        for (int i = 0; i < Matkul04.length; i++) {
            System.out.print((i+1)+". "+Matkul04[i]+":");
            nilaiMhs04[index04][i] = ayu.nextInt();
        }
        System.out.println("[OK] Semua nilai berhasil dimasukkan");
        konversiNilai04(index04);
    }
         static void KHSmahasiswa04 (){
        System.out.println("Daftar Mahasiswa :");
        for (int i = 0; i < jmlMhs04; i++) {
            System.out.println((i+1)+". "+"(belum diisi) /-"+(namaMhs04[i]==null?"(Belum diisi)" : namaMhs04[i]));
        }
        System.out.println("Pilih nomor mahasiswa :");
        int milih04 = ayu.nextInt()-1;
        if (milih04 <0 || milih04 >= jmlMhs04 || namaMhs04[milih04]==null) {
            System.out.println("Data belum diisi");
            return;
        }
        double totBobot04 = 0;
        int totSKS04 =0;
        boolean Status04=false;
        String status04;
        System.out.println("=========================================");
        System.out.println("    HASIL KONVERSI NILAI MAHASISWA  ");
        System.out.println("=========================================");
        System.out.println("Nama : "+namaMhs04[milih04]);
        System.out.println("NIM : "+nimMhs04[milih04]);
        System.out.println("NO\t"+"Mata Kuliah"+"\t\t\t"+"SKS"+"\t"+"NIlai"+"\t"+"Huruf"+"\t"+"Setara");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < Matkul04.length; i++) {  
            System.out.println((i+1)+"\t"+
                Matkul04[i]+"\t"+
                sks04[i]+"\t"+
                nilaiMhs04[milih04][i]+"\t"+
                nilaiHUruf04[milih04][i]+"\t"+
                nilaiSetara04[milih04][i]);
    
            totBobot04 += nilaiSetara04[milih04][i]*sks04[i];
            totSKS04 += sks04[i];
        }
        double ipSemester04 = totBobot04/totSKS04;
        status04="";
        if (nilaiHUruf04.equals("E")){
            status04 = "Tidak Lulus Ada Nilai E";
        }
        if (Matkul04[0].equals("Pancasila")){
            status04 = "Tidak Lulus Karena Nilai Pancasila < 60";
        }
        if (ipSemester04>2.0){
            status04 = " Lulus";
        }else if (ipSemester04<2.0){
            status04 = "Tidak Lulus Karena IP < 2.0";
        }
        System.out.println("\nTotal Sks : "+totSKS04);
        System.out.println("Total Bobot : "+totBobot04);
        System.out.println("Indeks Prestasi (IP) :"+ipSemester04);
        System.out.println("Status Kelulusan : "+ status04);
       
    }
    static void konversiNilai04 (int mhs04){
        for (int j = 0; j < Matkul04.length; j++) {
        int nilai04 = nilaiMhs04[mhs04][j];
        if (nilai04>=80) {
            nilaiHUruf04[mhs04][j] = "A";
            nilaiSetara04[mhs04][j] = 4;
        }else if (nilai04>=73) {
            nilaiHUruf04[mhs04][j] = "B+";
            nilaiSetara04[mhs04][j] = 3.5;
        }else if (nilai04>=65) {
            nilaiHUruf04[mhs04][j] ="B";
            nilaiSetara04[mhs04][j] = 3;
        }else if (nilai04>=60) {
            nilaiHUruf04[mhs04][j] ="C+";
            nilaiSetara04[mhs04][j]=2.5;
        }else if (nilai04>=50) {
            nilaiHUruf04[mhs04][j]="C";
            nilaiSetara04[mhs04][j]=2;
        }else if (nilai04>=39) {
            nilaiHUruf04[mhs04][j]="D";
            nilaiSetara04[mhs04][j]=1;
        }else {
            nilaiHUruf04[mhs04][j]="E";
            nilaiSetara04[mhs04][j]=0;
        }
    }
}
    static void Close04 (){

    }
}
