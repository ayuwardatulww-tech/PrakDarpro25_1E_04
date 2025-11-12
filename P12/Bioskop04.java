package P12;
public class Bioskop04 {
    public static void main(String[] args) {
        String [][] penonton04 = new String[4][2];
        penonton04[0][0] = "Amin";
        penonton04[0][1] = "Bena";
        penonton04[1][0] = "Candra";
        penonton04[1][1] = "Dela";
        penonton04[2][0] = "Eka";
        penonton04[2][1] = "Farhan";
        penonton04[3][0] = "Gisel";
        penonton04[3][1] = "Hana";

        System.out.printf("%s \t %s \n", penonton04[0][0], penonton04[0][1]);
        System.out.printf("%s \t %s \n", penonton04[1][0], penonton04[1][1]);
        System.out.printf("%s \t %s \n", penonton04[2][0], penonton04[2][1]);
        System.out.printf("%s \t %s \n", penonton04[3][0], penonton04[3][1]);

        System.out.println();
        System.out.println(penonton04.length);
        for (String [] barisPenonton04 : penonton04) {
            System.out.println("Panjang baris: "+barisPenonton04.length);
        }
        System.out.println();
        for (int i = 0; i < penonton04.length; i++) {
            System.out.println("Penonton pada baris ke-"+(i+1)+" : "+String.join(",", penonton04[i]));
        }
}
}
