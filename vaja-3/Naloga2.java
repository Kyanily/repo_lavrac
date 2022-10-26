import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        System.out.print("Enter a number from 10 to 1000: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        int x = a; 


        for (int i = 1; i < x; i++) {
            a = a + i;
            
        }

        for (;;) {
            if (x > 1000 || x < 10) {
                System.out.println("Not a valid number.");
                break;
            } else {
                System.out.print("Result: ");
                System.out.println(a);
                break;
            }
        }

    }
}