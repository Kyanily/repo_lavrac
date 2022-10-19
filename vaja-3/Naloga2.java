import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        System.out.print("Enter a number from 10 to 1000: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        for (int i = 1; i <= a; i++) {
            System.out.print(i + a);
        }
    }
}