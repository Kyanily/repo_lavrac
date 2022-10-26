import java.util.Scanner;

class Naloga4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStars = sc.nextInt();

        for (int i = 1; i <= numStars; i++) {
            if (numStars < 3) {
                System.out.println("Not a valid number.");
                break;
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}