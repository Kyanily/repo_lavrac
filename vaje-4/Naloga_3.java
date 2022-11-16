import java.util.Random;
import java.util.Scanner;

class Naloga_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num[];
        num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = rand.nextInt(10);
            System.out.println(num[i]);
        }

        System.out.println("-------------------");

        Scanner scan = new Scanner(System.in);
        int fndNum = scan.nextInt();

        Boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (fndNum != num[i]) {
                continue;
            } else {
                found = true;
                System.out.print(i);
            }
        }

        if (found == false) {
            System.out.println("Stevilo ni bilo najdeno.");
        }
        
    }
}