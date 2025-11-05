package P11;

public class SearchNilai04 {
    public static void main(String[] args) {
        int [] arrNilai04 = {80,85,70,96,90,82,86};
        int key04 = 90;
        int hasil04 = 0;

        for (int i = 0; i < arrNilai04.length; i++) {
            if (key04 == arrNilai04[i]) {
                hasil04 = i;
                break;
            }
        }
        System.out.println();
        System.out.println("NIlai "+key04+" Ketemu di indeks ke-"+hasil04);
        System.out.println();
    }
}
