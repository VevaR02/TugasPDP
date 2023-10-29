import java.util.Scanner;

public class jawabUtsperbaikan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "------------------------------------------Soal 1----------------------------------------------");
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();
        System.out.println(" ");
        System.out.println("Bismillahirrahmaanirrahiim, Saya yang bernama " + nama
                + " berjanji dan bersungguh-sungguh\r\n" + //
                "semaksimal mungkin mengerjakan UTS ini dengan usaha sendiri, tanpa sekalipun melihat\r\n" + //
                "pekerjaan teman Saya, serta mematuhi tata tertib selama ujian. Jika Saya melanggar janji ini,\r\n" + //
                "Saya berani menanggung resikonya.");
        System.out.println(" ");

        char pilihan;

        do {
            System.out.print("Lakukan transaksi? (Y/N): ");
            pilihan = input.next().charAt(0);

            if (pilihan == 'Y' || pilihan == 'y') {
                System.out.println(
                        "------------------------------------------Soal 2----------------------------------------------");
                System.out.println("TOKO KELONTONG VEVA");
                System.out.println("___________________");
                System.out.println("A. Susu Dancow: \r\n" + //
                        "1. Ukuran Kecil\r\n" + //
                        "2. Ukuran Sedang\r\n" + //
                        "3. Ukuran Besar\r\n");
                System.out.println("B. Susu Bendera: \r\n" + //
                        "1. Ukuran Kecil\r\n" + //
                        "2. Ukuran Sedang\r\n" + //
                        "3. Ukuran Besar\r\n");
                System.out.println("C. Susu SGM: \r\n" + //
                        "1. Ukuran Kecil\r\n" + //
                        "2. Ukuran Sedang\r\n" + //
                        "3. Ukuran Besar\r\n");
                System.out.println(" ");

                System.out.print("Masukkan jenis susu: ");
                char jenisSusu = input.next().charAt(0);
                if (jenisSusu == 'A') {
                    System.out.print("Masukkan ukuran kaleng susu Dancow: ");
                    int ukuranKalengsusu = input.nextInt();
                    if (ukuranKalengsusu == 1) {
                        System.out.println("Harga Susu Dancow kecil = Rp15.000");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 15000 * banyakBeli);

                    } else if (ukuranKalengsusu == 2) {
                        System.out.println("Harga Susu Dancow sedang = Rp20.000");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 20000 * banyakBeli);
                    } else if (ukuranKalengsusu == 3) {
                        System.out.println("Harga Susu Dancow besar = Rp25.000");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 25000 * banyakBeli);
                    }

                } else if (jenisSusu == 'B') {
                    System.out.print("Masukkan ukuran kaleng susu Bendera: ");
                    int ukuranKalengsusu = input.nextInt();
                    if (ukuranKalengsusu == 1) {
                        System.out.println("Harga Susu Bendera kecil= Rp13.500");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 13500 * banyakBeli);
                    } else if (ukuranKalengsusu == 2) {
                        System.out.println("Harga Susu Bendera sedang = Rp17.500");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 17500 * banyakBeli);
                    } else if (ukuranKalengsusu == 3) {
                        System.out.println("Harga Susu Bendera besar= Rp20.000");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 20000 * banyakBeli);
                    }
                } else if (jenisSusu == 'C') {
                    System.out.print("Masukkan ukuran kaleng susu SGM: ");
                    int ukuranKalengsusu = input.nextInt();
                    if (ukuranKalengsusu == 1) {
                        System.out.println("Harga Susu SGM kecil= Rp15.000");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 15000 * banyakBeli);
                    } else if (ukuranKalengsusu == 2) {
                        System.out.println("Harga Susu SGM sedang= Rp18.500");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 18500 * banyakBeli);
                    } else if (ukuranKalengsusu == 3) {
                        System.out.println("Harga Susu SGM besar = Rp22.000");
                        System.out.print("Jumlah yang dibeli: ");
                        int banyakBeli = input.nextInt();
                        System.out.println("Total harga: Rp. " + 22000 * banyakBeli);
                    }

                } else if (pilihan != 'N' && pilihan != 'n') {
                    System.out.println("Pilihan tidak valid. Silakan masukkan Y atau N.");
                }
            }

        } while (pilihan != 'N' && pilihan != 'n');

        System.out.println("Terima kasih! Transaksi selesai.");
        input.close();

    }
}