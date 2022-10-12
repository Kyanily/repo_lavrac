import java.util.Scanner;

class Naloga1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("Stevilo je enomestno");
        } else {
            System.out.println("Stevilo je vecmestno");
        }
    }
}