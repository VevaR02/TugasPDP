import java.util.Scanner;

public class jawabUts {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        System.out.println("------------------------------------------Soal 1----------------------------------------------");
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();
        System.out.println(" ");
        System.out.println("Bismillahirrahmaanirrahiim, Saya yang bernama " + nama + " berjanji dan bersungguh-sungguh\r\n" + //
                "semaksimal mungkin mengerjakan UTS ini dengan usaha sendiri, tanpa sekalipun melihat\r\n" + //
                "pekerjaan teman Saya, serta mematuhi tata tertib selama ujian. Jika Saya melanggar janji ini,\r\n" + //
                "Saya berani menanggung resikonya.");
        System.out.println(" ");

        System.out.println("------------------------------------------Soal 2----------------------------------------------");
        System.out.println("TOKO KELONTONG VEVA");
        System.out.println("___________________");
        System.out.println("1. Susu Dancow: \r\n" + //
                                    "1. Ukuran Kecil\r\n" + //
                                    "2. Ukuran Sedang\r\n" + //
                                    "3. Ukuran Besar\r\n");
        System.out.println("2. Susu Bendera: \r\n" + //
                                    "1. Ukuran Kecil\r\n" + //
                                    "2. Ukuran Sedang\r\n" + //
                                    "3. Ukuran Besar\r\n");
        System.out.println("3. Susu SGM: \r\n" + //
                                    "1. Ukuran Kecil\r\n" + //
                                    "2. Ukuran Sedang\r\n" + //
                                    "3. Ukuran Besar\r\n");
        System.out.println(" ");

            System.out.print("Masukkan jenis susu: ");
            int jenisSusu = input.nextInt();
                if(jenisSusu == 1){
                    System.out.print("Masukkan ukuran kaleng susu Dancow: ");
                    int ukuranKalengsusu = input.nextInt();
                        if (ukuranKalengsusu == 1){
                            System.out.println("Harga Susu Dancow kecil = Rp15.000");
                            System.out.print("Jumlah yang dibeli: ");
                            int banyakBeli = input.nextInt();
                            System.out.println("Total harga: Rp. " + 15000 * banyakBeli);

                        }
                        else if (ukuranKalengsusu == 2){
                            System.out.println("Harga Susu Dancow sedang = Rp20.000");
                            System.out.print("Jumlah yang dibeli: ");
                            int banyakBeli = input.nextInt();
                            System.out.println("Total harga: Rp. " + 20000 * banyakBeli);
                        }
                        else if (ukuranKalengsusu == 3){
                            System.out.println("Harga Susu Dancow besar = Rp25.000");
                            System.out.print("Jumlah yang dibeli: ");
                            int banyakBeli = input.nextInt();
                            System.out.println("Total harga: Rp. " + 25000 * banyakBeli);
                        }


                }
                else if(jenisSusu == 2){
                    System.out.print("Masukkan ukuran kaleng susu Bendera: ");
                    int ukuranKalengsusu = input.nextInt();
                            if (ukuranKalengsusu == 1){
                                System.out.println("Harga Susu Bendera kecil= Rp13.500");
                                System.out.print("Jumlah yang dibeli: ");
                                int banyakBeli = input.nextInt();
                                System.out.println("Total harga: Rp. " + 13500 * banyakBeli);
                            }
                            else if (ukuranKalengsusu == 2){
                                System.out.println("Harga Susu Bendera sedang = Rp17.500");
                                System.out.print("Jumlah yang dibeli: ");
                                int banyakBeli = input.nextInt();
                                System.out.println("Total harga: Rp. " + 17500 * banyakBeli);
                            }
                            else if (ukuranKalengsusu == 3){
                                System.out.println("Harga Susu Bendera besar= Rp20.000");
                                System.out.print("Jumlah yang dibeli: ");
                                int banyakBeli = input.nextInt();
                                System.out.println("Total harga: Rp. " + 20000 * banyakBeli);
                            }
                }
                else if(jenisSusu == 3){
                    System.out.print("Masukkan ukuran kaleng susu SGM: ");
                    int ukuranKalengsusu = input.nextInt();
                            if (ukuranKalengsusu == 1){
                                System.out.println("Harga Susu SGM kecil= Rp15.000");
                                System.out.print("Jumlah yang dibeli: ");
                                int banyakBeli = input.nextInt();
                                System.out.println("Total harga: Rp. " + 15000 * banyakBeli);
                            }
                            else if (ukuranKalengsusu == 2){
                                System.out.println("Harga Susu SGM sedang= Rp18.500");
                                System.out.print("Jumlah yang dibeli: ");
                                int banyakBeli = input.nextInt();
                                System.out.println("Total harga: Rp. " + 18500 * banyakBeli);
                            }
                            else if (ukuranKalengsusu == 3){
                                System.out.println("Harga Susu SGM besar = Rp22.000");
                                System.out.print("Jumlah yang dibeli: ");
                                int banyakBeli = input.nextInt();
                                System.out.println("Total harga: Rp. " + 22000 * banyakBeli);
                            }
                }

                System.out.print("Ulang Transaksi? (Y/N)");

    }
}