import java.util.Scanner;

public class butterflyPatternOptimised {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        int space = 2 * rows - 2;

        for (int i = 1; i <= 2 * rows - 1; i++) {

            int noOfStars = i;

            if (i > rows) {
                noOfStars = 2 * rows - i;
            }

            for (int j = 1; j <= noOfStars; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= noOfStars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < rows) {
                space -= 2;
            } else {
                space += 2;
            }
        }
    }
}