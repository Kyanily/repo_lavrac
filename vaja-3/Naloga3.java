import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();

        double numAverage = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10.0;

        System.out.println(num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10);
        System.out.println(numAverage);
    }
}