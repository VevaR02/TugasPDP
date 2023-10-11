import java.util.Scanner;

public class pertemuanLima {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("--------------------------------------------------");
        System.out.println(" ");

        System.out.println("HALAMAN CEK GAJI PT. MV");
        System.out.println(" ");

        System.out.print("NAMA: ");
        String nama = input.next();
        System.out.println(" ");

        System.out.println("Hai " + nama + ", Silakan Pilih Departemen Anda");
        System.out.println("A. Produksi     B. Marketing        C. Inventory");

        System.out.print("Pilih Departemen: ");
        char departemen = input.next().charAt(0);
        System.out.println(" ");

        if (departemen == 'A'){
            System.out.print("Lama bekerja di Departemen Produksi (dalam Tahun): ");
            double lama = input.nextDouble();
            if (lama > 0 && lama < 1){
                System.out.println("Gaji Anda = Rp.3.000.000,-");
            }
            else if (lama >= 1 && lama <= 2) {
                System.out.println("Gaji Anda = Rp.4.000.000,-");
            }
            else if (lama > 2) {
                System.out.println("Gaji Anda = Rp.5.000.000,-");
            }
            else {
                System.out.println("Mohon maaf data gaji tidak ditemukan");
            }
        }

        else if (departemen == 'B'){
            System.out.print("Lama bekerja di Departemen Marketing (dalam Tahun): ");
            double lama = input.nextDouble();
            if (lama > 0 && lama < 1){
                System.out.println("Gaji Anda = Rp.3.000.000,-");
            }
            else if (lama >= 1 && lama <= 2) {
                System.out.println("Gaji Anda = Rp.4.000.000,-");
            }
            else if (lama > 2) {
                System.out.println("Gaji Anda = Rp.5.000.000,-");
            }
            else {
                System.out.println("Mohon maaf data gaji tidak ditemukan");
            }
        }

        else if (departemen == 'C'){
            System.out.print("Lama bekerja di Departemen Inventory (dalam Tahun): ");
            double lama = input.nextDouble();
            if (lama > 0 && lama < 1){
                System.out.println("Gaji Anda = Rp.3.000.000,-");
            }
            else if (lama >= 1 && lama <= 2) {
                System.out.println("Gaji Anda = Rp.4.000.000,-");
            }
            else if (lama > 2) {
                System.out.println("Gaji Anda = Rp.5.000.000,-");
            }
            else {
                System.out.println("Mohon maaf data gaji tidak ditemukan");
            }
        }

        else {
            System.out.println("Departemen tidak ditemukan");
        }
        System.out.println("--------------------------------------------------");
    }
}