package P14;
public class PengunjungCafe04 {
    public static void main(String[] args) {
        // daftarPengunjung04("Ali","Budi","Citra"); 
        // daftarPengunjung04("Andi");
        // daftarPengunjung04("Doni","Eti","Fahmi","Galih");
        daftarPengunjung04(args);
    }

    static void daftarPengunjung04 (String...namaPengunjung04){
        System.out.println("Daftar Nama Pengunjung : ");
        for (String nama04 : namaPengunjung04) {
            System.out.println("- "+nama04);
        }
    }
}