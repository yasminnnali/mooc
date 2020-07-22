public class StarSign {

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");


        printSquare(4);
        System.out.println("");

        printRectangle(17, 3);
        System.out.println("");

        printTriangle(4);

    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i < size) {
            printStars(i + 1);
            i++;
        }
    }
}