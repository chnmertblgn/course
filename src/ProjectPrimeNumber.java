package src;

public class ProjectPrimeNumber {
    public static void main(String[] args) {
        String message = "sayısı asaldır.";
        int number = 7;
        int remainder;

        if (number == 1) {
            System.out.println(number + " sayısı asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı");
            return;
        }

        out:
        for (int i = 2; i < number; i++) {
            remainder = number % i;

            if (remainder == 0) {
                message = "sayısı asal değildir.";
                break out;
            }
        }
        System.out.println(number + " " +message);
    }
}
