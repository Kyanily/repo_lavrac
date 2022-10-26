import java.util.Scanner;

class Naloga5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String secretWord = "konec";
        String guess = "";

        while (!guess.equals(secretWord)) {
            guess = sc.nextLine();
        }

        System.out.println("You win!");
    }
}