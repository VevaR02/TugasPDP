import java.util.Scanner;

public class MainInput {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        System.out.println("====================================Tugas 2======================================");
    	
        // Input Nama
        System.out.print("NAMA: ");
        String mynama = input.next();
    	
        // Input NIM
        System.out.print("NIM: ");
        int mynim = input.nextInt();
    	
        // Input Nilai Tugas
        System.out.print("Nilai Tugas: ");
        int mynilaitgs = input.nextInt();

        // Input Nilai UTS
        System.out.print("Nilai UTS: ");
        int mynilaiuts = input.nextInt();

        // Input Nilai UAS
        System.out.print("Nilai UAS: ");
        int mynilaiuas = input.nextInt();

        // Input Nilai 
        System.out.print("Nilai Akhir: " + (mynilaitgs*30/100 + mynilaiuts*30/100 + mynilaiuas*40/100));

        System.out.println("====================================Tugas 1======================================");

        String nama = "Muhamad Veva Ramadhan";
        int nim = 1237050072;
        byte tgs = 90;
        byte uts = 90;
        byte uas = 90;
        System.out.println("DATA MAHASISWA");
        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Tugas : " + tgs);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Nilai Akhir :" + (tgs*30/100 + uts*30/100 + uas*40/100));

    }
}