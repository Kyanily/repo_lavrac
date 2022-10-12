import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        double a, b;
        a = num1.nextInt();
        b = num2.nextInt();

        if (a < b) {
            System.out.println("a = manjse");
            System.out.println("b = vecje");
        } else if (a > b) {
            System.out.println("a = vecje");
            System.out.println("b = manjse");
        } else {
            System.out.print("Stevili sta enaki");
        }
    }
}