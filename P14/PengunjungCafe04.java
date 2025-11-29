package P14;
public class PengunjungCafe04 {
    public static void main(String[] args) {
        daftarPengunjung04("Ali","Budi","Citra"); 
        daftarPengunjung04("Andi");
        daftarPengunjung04("Doni","Eti","Fahmi","Galih");
    }

    static void daftarPengunjung04 (String...namaPengunjung04){
        System.out.println("Daftar Nama Pengunjung : ");
        for (int i = 0; i < namaPengunjung04.length; i++) {
            System.out.println("- "+namaPengunjung04[i]);
        }
    }
}