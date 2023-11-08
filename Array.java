import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========Soal 1==========");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] umurMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan umur mahasiswa ke-" + (i + 1) + ": ");
            umurMahasiswa[i] = input.nextInt();
        }

        System.out.println("\n=== Data Umur Mahasiswa ===");
        System.out.println(" ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Umur Mahasiswa ke-: " + (i + 1) + ": " + umurMahasiswa[i]);
        }

        /*
         * variasi soal 2
         * System.out.print("Masukkan jumlah tipe sepatu: ");
         * int jumlahTipesepatu = input.nextInt();
         * 
         * int[] hargaTipesepatu = new int[jumlahTipesepatu];
         * int totalHarga = 0;
         * 
         * for (int i = 0; i < jumlahTipesepatu; i++) {
         * System.out.print("Masukkan harga sepatu tipe-" + (i+1) + ": ");
         * hargaTipesepatu[i] = input.nextInt();
         * totalHarga += hargaTipesepatu[i];
         * }
         * 
         * double rataRata = (double) totalHarga / jumlahTipesepatu;
         * System.out.println("Harga rata-rata seluruh tipe sepatu adalah: " +
         * rataRata);
         */

        System.out.println("==========Soal 2==========");
        System.out.print("Masukkan jumlah tipe sepatu: ");
        int jumlahTipesepatu = input.nextInt();

        String[] tipeSepatu = new String[jumlahTipesepatu];
        int[] quantityPertipe = new int[jumlahTipesepatu];
        int[] hargaSepatu = new int[jumlahTipesepatu];

        for (int i = 0; i < jumlahTipesepatu; i++) {

            System.out.println("=====Data ke-" + (i + 1) + "=====");
            System.out.print("Masukkan sepatu tipe ke-" + (i + 1) + ": ");
            tipeSepatu[i] = input.next();

            System.out.print("Masukkan stok sepatu tipe ke-" + (i + 1) + ": ");
            quantityPertipe[i] = input.nextInt();

            System.out.print("Masukkan harga sepatu tipe ke-" + (i + 1) + ": ");
            hargaSepatu[i] = input.nextInt();
        }

        System.out.println("\n=== Data Sepatu ===");
        for (int i = 0; i < jumlahTipesepatu; i++) {
            System.out.println("Tipe: " + tipeSepatu[i]);
            System.out.println("Stok: " + quantityPertipe[i]);
            System.out.println("Harga: " + hargaSepatu[i]);
            System.out.println("======================");
        }

        /*
         * variasi soal 2
         * System.out.print("Masukkan jumlah tipe sepatu: ");
         * int jumlahTipesepatu = input.nextInt();
         * 
         * int[] hargaTipesepatu = new int[jumlahTipesepatu];
         * 
         * for (int i = 0; i < jumlahTipesepatu; i++) {
         * System.out.print("Masukkan harga sepatu tipe ke-" + (i+1) + ": ");
         * hargaTipesepatu[i] = input.nextInt();
         * }
         * 
         * Arrays.sort(hargaTipesepatu);
         * 
         * System.out.println("\n=== Harga Tipe Sepatu ===");
         * for (int i = jumlahTipesepatu-1; i >= 0; i--) {
         * System.out.println(hargaTipesepatu[i]);
         * }
         */
    }
}