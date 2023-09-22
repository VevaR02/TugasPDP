import java.util.Scanner;

public class SoalRelasiLogika {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("=============Soal 1============");
       
        byte a = 3;
       byte b = 6;
       byte c = 2;
       byte k = 5;
       byte l = 4;
       byte m = 3;

       System.out.println((4 + 2 > a) && (b - 2 > 3 + 2) || (b + 2 <= 6 + 2));
       System.out.println((k + 5 < m) || (c * m < l ) && ( 2 * m - l > 0));
       System.out.println((l + 5 < m) || (c * k < l) && (2 * k - l > 0));
       System.out.println((a * 4 ) <= (3 * m + b));
       System.out.println((k + 10 > a) && (l - 2 > 4 * c));

       System.out.println("=============Phytagoras Soal 2============");

        int h, sa, s;
        System.out.println("Hipotenusa :");
        h = in.nextInt();
        System.out.println("Sisi Alas :");
        sa = in.nextInt();
        System.out.println("Sisi :");
        s = in.nextInt();

        System.out.println((sa*sa)+(s*s));
        System.out.println(Math.sqrt((sa*sa)+(s*s)));

        if (h*h==(sa*sa)+(s*s)){
            System.out.println("Phytagoras Sesuai");
        }
        else{
            System.out.println("Phytagoras Tidak Sesuai");
        }

    }
}
