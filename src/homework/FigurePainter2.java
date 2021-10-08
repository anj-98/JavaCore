package homework;

public class FigurePainter2 {
        public static void main(String[] args) {
            System.out.println("Triangle 1 \n");
            int index=0;
            for (int i = 0; i < 4; i++) {
                index=i;
                for (int j = 0; j <index ; j++) {
                    System.out.print("  ");
                }
                for (int j = 3; j>=index ;j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Triangle 2 \n");
            for (int i = 0; i < 3; i++) {
                index=i;
                for (int j = 3; j > index ; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <=index ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < 4; i++) {
                index=i;
                for (int j = 0; j <index ; j++) {
                    System.out.print(" ");
                }
                for (int j = 3; j>=index ;j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }



        }
    }



