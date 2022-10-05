import java.util.Scanner;

class Naloga4 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in); 
        int a = num1.nextInt();
        int b = num2.nextInt();
        System.out.println("Before change: " + a + ", " + b);
        int x = a;
        a = b;
        b = x;
        System.out.println("After change: " + a + ", " + b);
    }
}