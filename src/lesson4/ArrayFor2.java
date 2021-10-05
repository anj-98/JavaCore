package lesson4;

public class ArrayFor2 {
    public static void main(String[] args) {
        int[] number = new int[10];

        for (int i = 0; i < 10; i++) {
            number[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(number[i]);

        }
        int index = 0;
        for (int i = 10; i > 0; i--) {
            number[index] = i;
            index=index+1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(number[i] + " ");

        }


    }
}

