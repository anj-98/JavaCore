package homework.arraybolola;

import java.util.Arrays;

public class ArrayBolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        //1. Հայտարարել c փոփոխական և տպել c փոփոխականի քանակը (c='o')
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }
        }
        System.out.println("1. Տպելմասիվի c փոփոխականների քանակը");
        System.out.println("count=" + count);

        //2․ Գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
        System.out.println("2․ Տպել մասիվի մեջտեղի 2 սիմվոլները");
        System.out.print(bolola[bolola.length / 2 - 1]);
        System.out.println(bolola[bolola.length / 2]);

        //3․ Տպել true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        boolean found = false;
        char a = 'l';
        char b = 'y';
        if ((bolola.length - 1) == a && (bolola.length - 2) == b) {
            found = true;
        }
        System.out.println("3․ Տպել true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false");
        System.out.println(found);

        //4.Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean name = false;
        char s = 'b';
        for (int i = 1; i < babola.length - 1; i++) {
            if ((babola[i - 1]) == s && (babola[i + 1]) == s) {
                name = true;
            }
        }
        System.out.println("4.Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սիմվոլ");
        System.out.println(name);

        //5.Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev java )
        System.out.println("5.text մասիվից ստանալ char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)");
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', 'j', 'a', 'v', 'a', ' ',' ',' ',' ', ' '};
        char k = ' ';
        int first = ' ';
        int last = ' ';
        for (int i = 0; i < text.length; i++) {
            if (text[i] != k) {
                first = i;
                break;
            }
        }
        for (int j = text.length - 1; j >= 0; j--) {
            if (text[j] != k) {
                last = j;
                break;
            }
        }
        char[] result = new char[(last + 1) - first];
        int index = 0;
        for (int j = first; j <= result.length + 1; j++) {
            result[index] = text[j];
            index++;
        }
        System.out.println(result);
    }
}

