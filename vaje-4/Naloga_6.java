import java.util.Scanner;

class Naloga_6  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();

        for (int i = 0; i < phrase.length() ; i++) {
            System.out.println(phrase.charAt(i));
        }
    }
}