package src;

public class projectVowelLetters {
    public static void main(String[] args) {
        char ch = 'A';

        switch (ch) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " kalýn sesli harftir.");
                break;
            default:
                System.out.println(ch + " ince sesli harftir.");

        }
    }
}
