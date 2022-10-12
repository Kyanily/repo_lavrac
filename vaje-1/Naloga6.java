import java.util.Scanner;

class Naloga6 {
    public static void main(String[] args) {
        Scanner price_with_tax, tax_amount;

        System.out.println("Price of computer with TAX: ");
        price_with_tax = new Scanner(System.in);
        int total_price = price_with_tax.nextInt();

        System.out.println("TAX amount: ");
        tax_amount = new Scanner(System.in);
        int tax = tax_amount.nextInt();

        int total = total_price - total_price * tax / 100;

        System.out.println("Computer price before TAX: " + total + "$");
    }
}