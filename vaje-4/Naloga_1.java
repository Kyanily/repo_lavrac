import java.util.Random;

class Naloga_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num[];
        num = new int[5];

        for (int i = 0; i <= 4; i++) {
            num[i] = rand.nextInt();
            System.out.println(num[i]);
        }

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        
        System.out.println(sum);

        int numAvg = sum / num.length;

        System.out.println(numAvg);
    }
}