import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("Stevilo je enomestno");
        } else if (num > 99999) {
            System.out.println("Stevilo je sestmestno");
        } else if (num > 9999) {
            System.out.println("Stevilo je petmestno");
        } else if (num > 999) {
            System.out.println("Stevilo je stirimestno");
        } else if (num > 99) {
            System.out.println("Stevilo je trimestno");
        } else if (num > 9) {
            System.out.println("Stevilo je dvomestno");
        } else {
            System.out.println("Stevilo je vecmestno");
        }
    }
}