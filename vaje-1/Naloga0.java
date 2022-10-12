import java.util.Scanner;

class Naloga0 {
    public static void main(String[] args) {
        int a = 5;
        String s = "Vrednost";
        System.out.println(s + " " + a);

        System.out.print("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }
}