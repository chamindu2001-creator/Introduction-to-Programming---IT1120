public class lab7q2b {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            System.out.print(row + " -");
            
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            
            System.out.println(); // move to next line
        }
    }
}
