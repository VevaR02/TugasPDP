import java.util.Scanner;

public class Manusia {

    String kelamin = "Laki-Laki";

    String nama = "Veva Ramadhan";

    void kuliah() {

        System.out.println("Manusia " + kelamin + " bernama " + nama + " itu sedang berkuliah");

    }

    void kerja() {

        System.out.println("Manusia " + kelamin + " bernama " + nama + " itu sedang bekerja");

    }

    public static void main(String[] args) {

        Manusia saya = new Manusia();

        Scanner input = new Scanner(System.in);

        System.out.print("Sedang berada dimana? 'Rumah' atau 'Kampus' --> ");
        String tempat = input.nextLine();

        switch (tempat) {
            case "Rumah":
                saya.kerja();
                break;

            case "Kampus":
                saya.kuliah();
                break;

            default:
                break;
        }

    }

}