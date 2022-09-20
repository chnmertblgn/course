package src;

public class reCapDemo {
    public static void main(String[] args) {
        int number = 20;
        int number2 = 25;
        int number3 = 2;
        int maxNumber = number;

        if (maxNumber < number2) {
            maxNumber = number2;
        }

        if (maxNumber < number3) {
            maxNumber = number3;
        }

        System.out.println("En büyük sayı:"+ maxNumber);
    }
}
