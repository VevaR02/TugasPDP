import java.util.Scanner;

public class PertemuanEmpat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("=============Soal 1============");
       
        int nilai;
        System.out.println("Masukkan Nilai Anda:");
        nilai = in.nextInt();

        if (nilai >= 60){
            System.out.println("Selamat Anda Lulus");
        }
        else{
            System.out.println("Mohon Maaf Anda Tidak Lulus");
        }

        System.out.println("=============Soal 2============");

        System.out.print("NAMA: ");
        String mynama = in.next();
    	
        // Input NIM
        System.out.print("NIM: ");
        int mynim = in.nextInt();
    	
        // Input Nilai Tugas
        System.out.print("Nilai Tugas: ");
        int mynilaitgs = in.nextInt();

        // Input Nilai UTS
        System.out.print("Nilai UTS: ");
        int mynilaiuts = in.nextInt();

        // Input Nilai UAS
        System.out.print("Nilai UAS: ");
        int mynilaiuas = in.nextInt();

        int mynilaiakhir = (mynilaitgs*30/100 + mynilaiuts*30/100 + mynilaiuas*40/100);

        // Input Nilai 
        System.out.println("Nilai Akhir: " + mynilaiakhir);

        if (mynilaiakhir >= 80) {
            System.out.println("Grade Nilai A");
        }
        else if ( mynilaiakhir < 80 && mynilaiakhir >= 70) {
            System.out.println("Grade Nilai B");
        }
        else if ( mynilaiakhir < 70 && mynilaiakhir >= 60) {
            System.out.println("Grade Nilai C");
        }
        else if ( mynilaiakhir < 60 && mynilaiakhir >= 50) {
            System.out.println("Grade Nilai D");
        }
        else if ( mynilaiakhir < 50) {
            System.out.println("Grade Nilai E");
        }

        System.out.println("=============Soal 3============");

        System.out.println("=============Persegi============");

        int s;
        System.out.println("Masukkan Nilai s:");
        s = in.nextInt();
        double luaspersegi = (s * s);
        System.out.println("Menghitung Luas Persegi...");

        if (luaspersegi > 0){
            System.out.println("Luas Persegi = " + luaspersegi + " cm^2");
        }
        else{
            System.out.println("Error");
        }
        

        System.out.println("=============Segitiga============");

        int a;
        int t;
        System.out.println("Masukkan Nilai a:");
        a = in.nextInt();
        System.out.println("Masukkan Nilai t:");
        t = in.nextInt();
        double luassegitigiga = (0.5 * a * t);

        System.out.println("Menghitung Luas Segitiga...");

        if (luassegitigiga > 0){
            System.out.println("Luas Segitiga = " + luassegitigiga + " cm^2");
        }
        else{
            System.out.println("Error");
        }

        System.out.println("=============Lingkaran============");

        int r;
        System.out.println("Masukkan Nilai r:");
        r = in.nextInt();
        double luaslingkaran = (3.14 * r * r);
        System.out.println("Menghitung Luas Lingkaran...");

        if (luaslingkaran > 0){
            System.out.println("Luas Lingkaran = " + luaslingkaran + " cm^2");
        }
        else{
            System.out.println("Error");
        }
    }
}
