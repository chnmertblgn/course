package src;

public class ProjectPrimeNumber {
    public static void main(String[] args) {
        String message = "say�s� asald�r.";
        int number = 7;
        int remainder;

        if (number == 1) {
            System.out.println(number + " say�s� asal de�ildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Ge�ersiz say�");
            return;
        }

        out:
        for (int i = 2; i < number; i++) {
            remainder = number % i;

            if (remainder == 0) {
                message = "say�s� asal de�ildir.";
                break out;
            }
        }
        System.out.println(number + " " +message);
    }
}
