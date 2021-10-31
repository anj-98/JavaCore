package homework.practichomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework practicehomework = new PracticeHomework();

        long second = practicehomework.convert(9);
        System.out.println("second = " + second);

        long days = practicehomework.calcAge(45);
        System.out.println("days = " + days);

        int next_number = practicehomework.nextNumber(8);
        System.out.println("Next Number = " + next_number);

        boolean test = practicehomework.isSameNum(9, 9);
        System.out.println(test);

        boolean number = practicehomework.lessThanOrEqualToZero(0);
        System.out.println(number);

        boolean reverseBool = practicehomework.reverseBool(true);
        System.out.println(reverseBool);

        int[] array1 = {7, 8, 15, 63};
        int[] array2 = {9, 2, 4, 5, 30, 78};
        int length = practicehomework.maxLength(array1, array2);
        System.out.println("Max Length=" + length);


    }
}
