package src;

public class DataTypes {
    public static void main(String[] args) {
        boolean bl = true;//true ya da false - 1 bit
        byte number = 127;//-128 ile 127 arası - 8 bit
        char ch = 'a';//karakter - 16 bit
        short number2 = 32767;//tam sayı -32,768 ile 32,767 arası - 16 bit
        int number3 = 2147483647;//tam sayı -2,147,483,648 ile 2,147,483,647 arası - 32 bit
        long number4 = 9223372036854775807L;//tam sayı -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arası - 64 bit
        float number5 = 312312312.2f;//ondalıklı sayı 7 decimal - 32 bit
        double number6 = 12312312312313123.5d;//ondalıklı sayı 16 decimal - 64 bit

        System.out.println(bl);
        System.out.println(number);
        System.out.println(ch);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
    }
}
