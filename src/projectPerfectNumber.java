package src;

public class projectPerfectNumber {
    public static void main(String[] args) {
        boolean isPerfect = false;
        int number = 28;
        int total = 0;
        int remainder;

        if (number < 1) {
            System.out.println("Ge�ersiz say�.");
            return;
        }

        for (int i = 1; i < number; i++) {
            remainder = number % i;

            if (remainder == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " m�kemmel say�d�r.");
        } else {
            System.out.println(number + " m�kemmel say� de�ildir.");
        }
    }
}
