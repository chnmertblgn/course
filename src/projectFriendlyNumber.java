package src;

public class projectFriendlyNumber {
    public static void main(String[] args) {
        int number = 220;
        int number2 = 284;
        int remainder = 0;
        int total = 0;
        int total2 = 0;

        if (number < 1 || number2 < 1) {
            System.out.println("Geçersiz sayı!");
            return;
        }

        for (int i = 1; i < number; i++) {
            remainder = number % i;

            if (remainder == 0){
                total += i;
            }
        }

        for (int i = 1; i < number2; i++) {
            remainder = number2 % i;

            if (remainder == 0){
                total2 += i;
            }
        }

        if (number == total2 && number2 == total) {
            System.out.println(number + " ve " + number2 + " kardeş sayılardır.");
        } else {
            System.out.println(number + " ve " + number2 + " kardeş sayılar değildir.");
        }
    }
}
