import java.util.Scanner;

class Naloga1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("Stevilo je enomestno");
        } else if (num >= 10) {
            System.out.println("Stevilo je dvomestno");
        } else if (num >= 100) {
            System.out.println("Stevilo je trimestno");
        } else if (num >= 1000) {
            System.out.println("Stevilo je stirimestno");
        } else if (num >= 10000) {
            System.out.println("Stevilo je petmestno");
        } else if (num >= 100000) {
            System.out.println("Stevilo je sestmestno");
        } else {
            System.out.println("Stevilo je vecmestno");
        }
    }
}