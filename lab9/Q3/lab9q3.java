public class lab9q3 {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Expression i: (3*4 + 5*7)^2
        int expr1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression ii: (4+7)^2 + (8+3)^2
        int expr2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + expr1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + expr2);
    }
}