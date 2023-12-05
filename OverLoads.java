import java.io.*;
import java.util.Scanner;

class BangunDatar {

    public int hitungLuas(int s) {
        int luas = s * s;
        return luas;
    }

    public int hitungKeliling(int s) {
        int keliling = 4 * s;
        return keliling;
    }

    public double hitungLuas(double a, double t) {
        double luas = a * t * 1 / 2;
        return luas;
    }

    public int hitungKeliling(int a, int t, int h) {
        int keliling = a + t + h;
        return keliling;
    }

    public double hitungLuas(double r) {
        double luas = r * r * 3.14;
        return luas;
    }

    public double hitungKeliling(double r) {
        double keliling = r * 2.0 * 3.14;
        return keliling;
    }
}

class Kalkulator {
    public int hitung(int a, int b) {
        int plus = a + b;
        return plus;
    }

    public int hitung(int a, int b, int c) {
        int minus = a - b;
        return minus;
    }

    public int hitung(int a, int b, int c, int d) {
        int kali = a * b;
        return kali;
    }

    public double hitung(double a4, double b4) {
        double bagi = a4 / b4;
        return bagi;
    }

}

class OverLoads {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Bangun Datar 2. Kalkulator");
        System.out.print("Silakan Pilih: ");
        int pil = input.nextInt();

        switch (pil) {
            case 1:
                System.out.println("1. Persegi 2. Segitiga 3. Lingkaran");
                System.out.print("Silakan Pilih: ");
                int pilih = input.nextInt();

                BangunDatar bentuk = new BangunDatar();

                if (pilih == 1) {
                    System.out.print("Masukkan sisi: ");
                    int s = input.nextInt();
                    int luas1 = bentuk.hitungLuas(s);
                    System.out.println("Luas Persegi = " + luas1);
                    int keliling1 = bentuk.hitungKeliling(s);
                    System.out.println("Keliling Persegi = " + keliling1);
                } else if (pilih == 2) {
                    System.out.print("Masukkan alas: ");
                    int a = input.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int t = input.nextInt();
                    System.out.print("Masukkan hipotenusa: ");
                    int h = input.nextInt();
                    double luas2 = bentuk.hitungLuas(a, t);
                    System.out.println("Luas Segitiga = " + luas2);
                    int keliling2 = bentuk.hitungKeliling(a, t, h);
                    System.out.println("Keliling Segitiga = " + keliling2);
                } else if (pilih == 3) {
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();
                    double luas3 = bentuk.hitungLuas(r);
                    System.out.println("Luas Lingkaran = " + luas3);
                    double keliling3 = bentuk.hitungKeliling(r);
                    System.out.println("Keliling Lingkaran = " + keliling3);
                } else {
                    System.out.println("Pilihan tidak ada - Error");
                }
                break;

            case 2:

                Kalkulator buatHitung = new Kalkulator();
                System.out.println("1. Penjumlahan 2. Pengurangan 3. Perkalian 4. Pembagian");
                System.out.print("Silakan Pilih: ");
                int pilihitung = input.nextInt();
                switch (pilihitung) {
                    case 1:
                        System.out.print("Masukkan nilai a: ");
                        int a = input.nextInt();
                        System.out.print("Masukkan nilai b: ");
                        int b = input.nextInt();
                        int hitung1 = buatHitung.hitung(a, b);
                        System.out.println("Hasil penjumlahan = " + hitung1);
                        break;

                    case 2:
                        System.out.print("Masukkan nilai a: ");
                        int a2 = input.nextInt();
                        System.out.print("Masukkan nilai b: ");
                        int b2 = input.nextInt();
                        int c2 = 0;
                        int hitung2 = buatHitung.hitung(a2, b2, c2);
                        System.out.println("Hasil pengurangan = " + hitung2);
                        break;

                    case 3:
                        System.out.print("Masukkan nilai a: ");
                        int a3 = input.nextInt();
                        System.out.print("Masukkan nilai b: ");
                        int b3 = input.nextInt();
                        int c3 = 0;
                        int d3 = 0;
                        int hitung3 = buatHitung.hitung(a3, b3, c3, d3);
                        System.out.println("Hasil perkalian = " + hitung3);
                        break;

                    case 4:
                        System.out.print("Masukkan nilai a: ");
                        double a4 = input.nextDouble();
                        System.out.print("Masukkan nilai b: ");
                        double b4 = input.nextDouble();
                        double hitung4 = buatHitung.hitung(a4, b4);
                        System.out.println("Hasil perkalian = " + hitung4);
                        break;

                    default:
                        System.out.println("Pilihan tidak ada - Error");
                        break;
                }

            default:
                System.out.println("Pilihan tidak ada - Error");
                break;
        }

    }
}
