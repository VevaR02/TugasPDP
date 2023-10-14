import java.util.Scanner;

import org.w3c.dom.ranges.Range;

public class pertemuanEnam {
    public static void main (String [] Args){
        Scanner input = new Scanner (System.in);

        System.out.println(" ");
        System.out.println("--------------------Soal 1----------------------");
        System.out.println(" ");
        System.out.print("Kalimat yang akan diulang: ");
        String kalimat = input.nextLine();
        System.out.print("Total yang akan diulang: ");
        int total = input.nextInt();
        for (int i=1; i <= total; i++ ){
            System.out.println(kalimat);
        }
        System.out.println(" ");
        System.out.print("Total diulang: ");
        int tot = input.nextInt();
        for (int i=1; i <= tot; i++ ){
            System.out.print("Mana kalimatnya? ");
            String kal = input.next();
        }

        /* while
        System.out.print("Kalimat yang akan diulang: ");
        String kalimatwhile = input.nextLine();
        System.out.print("Total yang akan diulang: ");
        int totalwhile = input.nextInt();
        int i=1; 
        while (i <= totalwhile){
            System.out.println(kalimatwhile);
            i++; 
        }

        do while
        System.out.print("Kalimat yang akan diulang: ");
        String kalimatdowhile = input.nextLine();
        System.out.print("Total yang akan diulang: ");
        int totaldowhile = input.nextInt();
        int i=1;
        do{ 
            System.out.println(kalimatdowhile);
            i++; 
        } while (i <= totaldowhile);
        */
        
        System.out.println("--------------------Soal 2----------------------");
        System.out.println(" ");
        System.out.print("Total yang akan diulang: ");
        int muncul = input.nextInt();
        int ganjil = 1;
        for (int i = 1; i <= muncul; i++){
            System.out.println(ganjil);
            ganjil += 2;
        }

        /*
        System.out.println(" ");
        System.out.print("Total yang akan diulang: ");
        int munculwhile = input.nextInt();
        int ganjilwhile = 1;
        int iwhile = 1;
        while (iwhile <= munculwhile){
            System.out.println(ganjilwhile);
            ganjilwhile += 2;
            i++;
        }

        System.out.println(" ");
        System.out.print("Total yang akan diulang: ");
        int munculdo = input.nextInt();
        int ganjildo = 1;
        int ido = 1;
        do{
            System.out.println(ganjildo);
            ganjildo += 2;
            i++;
        }while (ido <= munculdo);
        */

        System.out.println("--------------------Soal 3----------------------");
        System.out.println(" ");
        System.out.print("Jumlah Mata Kuliah: ");
        int sum = 0;
        int jumatkul = input.nextInt();
        for (int i=1; i <= jumatkul; i++ ){
            System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
            int nilai = input.nextInt();
            sum += nilai;
        }
        System.out.println("Nilai Rata-Rata = " + (sum / jumatkul));
        

    }

}