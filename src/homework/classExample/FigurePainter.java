package homework.classExample;

public class FigurePainter {
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i + j >= length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void drawRightBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRhombus(int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i < length - i; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length - 1; j >= i * 2; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

