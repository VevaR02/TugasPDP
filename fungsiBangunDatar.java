import java.util.Scanner;

public class fungsiBangunDatar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Persegi 2. Segitiga 3. Lingkaran");
        System.out.print("Silakan Pilih: ");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.print("Masukkan sisi: ");
            int s = input.nextInt();
            System.out.println("Luas Persegi = " + luasPersegi(s));
            System.out.println("Keliling Persegi = " + kelilingPersegi(s));
        } else if (pilih == 2) {
            System.out.print("Masukkan Alas: ");
            int a = input.nextInt();
            System.out.print("Masukkan Tinggi: ");
            int t = input.nextInt();
            System.out.print("Masukkan Hipotenusa: ");
            int h = input.nextInt();
            System.out.println("Luas Segitiga = " + luasSegitiga(a, t));
            System.out.println("Keliling Segitiga = " + kelilingSegitiga(a, t, h));
        } else if (pilih == 3) {
            System.out.print("Masukkan Jari-jari: ");
            double r = input.nextDouble();
            System.out.println("Luas Lingkaran = " + luasLingkaran(r));
            System.out.println("Keliling Lingkaran = " + kelilingLingkaran(r));
        }

    }

    static int luasPersegi(int sisi) {
        return sisi * sisi;

    }

    static int kelilingPersegi(int sisi) {
        return 4 * sisi;

    }

    static int luasSegitiga(int alas, int tinggi) {
        return alas * tinggi * 1 / 2;

    }

    static int kelilingSegitiga(int alas, int tinggi, int hipotenusa) {
        return alas + tinggi + hipotenusa;

    }

    static double luasLingkaran(double jarijari) {
        return jarijari * jarijari * 3.14;

    }

    static double kelilingLingkaran(double jarijari) {
        return jarijari * 2 * 3.14;

    }

}