package homework;

public class FigurePainter {
    public static void main(String[] args) {
        int index = 0;
        System.out.println("Triangle 1");
        for (int i = 0; i < 4; i++) {
            index = i;
            for (int j = 0; j <= index; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Triangle 2");
        for (int i = 0; i < 4; i++) {
            index = i;
            for (int j = 0; j < 4; j++) {
                if (index + j >= 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle 3");
        for (int i = 0; i < 4; i++) {
            index = i;
            for (int j = 4; j > index; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}



