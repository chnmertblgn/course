package src;

public class projectPerfectNumber {
    public static void main(String[] args) {
        boolean isPerfect = false;
        int number = 28;
        int total = 0;
        int remainder;

        if (number < 1) {
            System.out.println("Geçersiz sayý.");
            return;
        }

        for (int i = 1; i < number; i++) {
            remainder = number % i;

            if (remainder == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " mükemmel sayýdýr.");
        } else {
            System.out.println(number + " mükemmel sayý deðildir.");
        }
    }
}
