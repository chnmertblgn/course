package src;

public class ProjectFindNumber {
    public static void main(String[] args) {
        String message = "say�s� dizi i�erisinde yok.";
        int[] numbers = new int[]{1,2,5,7,9,0};
        int aranacakSayi = 5;

        for (int number : numbers) {
            if (aranacakSayi == number) {
                message = "say�s� dizi i�erisinde var.";
                break;
            }
        }
        System.out.println(aranacakSayi + " " + message);
    }
}
