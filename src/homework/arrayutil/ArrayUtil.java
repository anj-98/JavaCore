package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {22, 1, 65, 42, 10, 13, 48, 7, 28, 12};
        //1․ Տպել Մասիվի բոլոր էլեմենտները
        System.out.println("1․ Մասիվի բոլոր էլեմենտները");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //2․ Տպել մասիվի ամենամեծ թիվը
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("2.Տպել Մասիվի ամենամեծ թիվը");
        System.out.println("max=" + max);

        //3․ Տպել Մասիվի ամենափոքր էլեմենտը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("3․ Տպել Մասիվի ամենափոքր թիվը");
        System.out.println("min=" + min);

        //4.Տպել մասիվի բոլոր զույգ էլեմենտները
        System.out.println("4. Մասիվի զույգ էլեմենտները");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
        //5.Տպել մասիվի բոլոր կենտ էլեմենտները։
        System.out.println("5. Մասիվի կենտ էլեմենտները");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();

        //6.Տպել զույգերի քանակը։
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count1++;

            }
        }
        System.out.println("6․ Մասիվի զույգ թվերի քանակը");
        System.out.println("count=" + count1);

        //7.Տպել կենտերի քանակը։
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println("7․ Մասիվի կենտ թվերի քանակը");
        System.out.println("count=" + count2);

        //8.Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        double sum = 0;
        double result;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        result = sum /array.length;
        System.out.println("8. Մասիվի բոլոր թվերի միջին թվաբանականը");
        System.out.println("result=" + result);

        //9.Տպել մասիվի էլեմենտների գումարը։
        int sum1=0;
        for (int i = 0; i <array.length; i++) {
            sum1+=array[i];

        }
        System.out.println("9. Մասիվի էլեմենտների գումարը");
        System.out.println("Sum= "+sum1);

    }
}
