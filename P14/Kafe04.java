package P14;
public class Kafe04 {
    public static String DISKON50 ="DISKON50";
    public static String DISKON30 ="DISKON30";
    
    public static void main(String[] args) {
        Menu04("BUdi", true);
        Diskon04("DISKON50");
    }
        public static void Menu04(String namaPelanggan04, boolean isMember04){
            if (isMember04) {
                System.out.println("Anda adalah member dapatkan diskon 10% untuk setiap pembelian!");
            }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. KOpi Hitam - RP. 15.000");
        System.out.println("2. Cappucino - RP.20.000");
        System.out.println("3. Latte - Rp.22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("=================================");
        System.out.println("Silahkan Pilih Menu Yang Anda Ingingkan ");
    }
    public static void Diskon04(String kodePromo){
        if (kodePromo==DISKON50) {
            System.out.println("Anda mendapatkan diskon 50%");
        }else if (kodePromo==DISKON30) {
            System.out.println("Anda mendapatkan diskon 30%");
        }else {
            System.out.println("Tampilan kode invalid");
        }
    }

}