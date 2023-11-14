import java.util.Arrays;

public class arrayDimensi {
    public static void main(String[] args) {
        int[][] a = {
                { 2, 5, 3 },
                { 4, 1, 6 }
        };
        int[][] b = {
                { 1, 4, 3 },
                { 3, 2, 1 }
        };
        int[][] hasil = new int[2][3];

        System.out.println("=================================================================");
        System.out.println("MATRIKS 1");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("MATRIKS 2");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("MATRIKS HASIL 1 + 2");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=================================================================");
    }
}