public class labq2c {
      public static void main(String[] args) {

        for (int row = 5; row >= 1; row--) {
            // Print leading spaces
            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }

            // Print numbers with spaces between
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            System.out.println(); // move to next line
        }
    }
}
