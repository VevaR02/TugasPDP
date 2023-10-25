import java.util.Scanner;

public class pertemuanTujuh {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi bintang segitiga yang diinginkan: ");
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.print("Masukkan tinggi bintang segitiga terbalik yang diinginkan: ");
        int tingginya = input.nextInt();

        for (int i = 1; i <= tingginya; i++) {
            for (int j = tingginya; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}