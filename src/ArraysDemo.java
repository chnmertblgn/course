package src;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] students = new String[4];

        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";
        students[3] = "Ahmet";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("-----------------------------");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
