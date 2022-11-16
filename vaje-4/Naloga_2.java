import java.util.Random;

class Naloga_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num[];
        num = new int[5];

        for (int i = 0; i <= 4; i++) {
            num[i] = rand.nextInt();
            System.out.println(num[i]);
        }

        int smallest = num[0];
        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
        if (num[i] > largest)
            largest = num[i];
        else if (num[i] < smallest)
            smallest = num[i];
        }

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    } 
}