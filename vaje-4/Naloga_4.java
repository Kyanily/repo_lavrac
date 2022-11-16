import java.util.Scanner;

class Naloga_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String besede[];
        besede = new String[5];

        for (int i = 0; i < 5; i++) {
            besede[i] = scan.nextLine();
        }

        for (int i = besede.length-1; i>=0; i--) {
            System.out.print(besede[i] + " ");
        }
    }
}