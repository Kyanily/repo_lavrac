import java.util.Scanner;

class Naloga5 { 
    public static void main(String[] args) {
        Scanner computer_price, tax_amount;

        System.out.println("Price of computer: ");
        computer_price = new Scanner(System.in);
        int price = computer_price.nextInt();

        System.out.println("TAX: ");
        tax_amount = new Scanner(System.in);
        int tax = tax_amount.nextInt();

        int total = price + price * tax / 100;
        System.out.println("Computer price with TAX: " + total + "$");
    }
}