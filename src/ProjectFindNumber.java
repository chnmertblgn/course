package src;

public class ProjectFindNumber {
    public static void main(String[] args) {
        String message = "sayısı dizi içerisinde yok.";
        int[] numbers = new int[]{1,2,5,7,9,0};
        int aranacakSayi = 5;

        for (int number : numbers) {
            if (aranacakSayi == number) {
                message = "sayısı dizi içerisinde var.";
                break;
            }
        }
        System.out.println(aranacakSayi + " " + message);
    }
}
