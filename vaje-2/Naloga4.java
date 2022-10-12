import java.util.Scanner;

class Naloga4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String sodoLiho = "";


        String pozitivnost = "";

        if (a > 0) {
            pozitivnost = "pozitivno";
        } else if (a < 0) {
            pozitivnost = "negativno";
        } else {
            pozitivnost = "enako nic";
        }

        if (a < 0) {
            a = -a;
        }

        if (a % 2 == 0) {
            sodoLiho = "sodo";
        } else if (a % 2 == 1) {
            sodoLiho = "liho";
        }
        
        String aString = Integer.toString(a);

        System.out.print("Stevilo " + aString + " je " + sodoLiho + " in " + pozitivnost);
    }
}